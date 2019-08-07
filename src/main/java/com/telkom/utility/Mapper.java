package com.telkom.utility;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.nio.charset.Charset;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;

import org.jpos.iso.ISOMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import za.co.telkom.Recharge;
import za.co.telkom.RechargeResponse;
import za.co.telkom.ValidateAccount;
import za.co.telkom.ValidateAccountResponse;
import za.co.telkom.eai.billing.topupenquirymanage.TopUpEnquiryManage;
import za.co.telkom.eai.billing.topupenquirymanage.TopUpEnquiryManage.Request;
import za.co.telkom.eai.billing.topuprechargemanage.RequestType;
import za.co.telkom.eai.billing.topuprechargemanage.TopUpRechargeManage;

public class Mapper {
	private static Logger logger = LoggerFactory.getLogger(Mapper.class);

	public static Recharge mapIsoMessageToRecharge(ISOMsg isoMsg) throws Exception {
		logger.info("Inside mapIsoMessageToRecharge Mapper >> " + isoMsg.getMaxField());
		logger.info("isoMsg.getString(4) <<12>> " + isoMsg.getString(4));
		logger.info("isoMsg.getString(12) <<6>> " + isoMsg.getString(12));
		logger.info("isoMsg.getString(13) <<4>> " + isoMsg.getString(13));
		logger.info("isoMsg.getString(32) <<11>> " + isoMsg.getString(32));
		logger.info("isoMsg.getString(37) <<12>> " + isoMsg.getString(37));
		logger.info("isoMsg.getString(41) <<8>> " + isoMsg.getString(41));
		logger.info("isoMsg.getString(103) <<28>> " + isoMsg.getString(103));
		Recharge recharge = null;
		try {
			recharge = new Recharge();
			TopUpRechargeManage topUpRechargeManage = new TopUpRechargeManage();
			RequestType requestType = new RequestType();

			requestType.setSessionID(isoMsg.getString(37));

			requestType.setRechargeAmount(Long.valueOf(isoMsg.getString(4)));

			// If P-32='1110000501011', set to "ABSA"
			if (ISOAdapterConstant.ABSA_MERCHANT_ID.equals(isoMsg.getString(32))) {
				requestType.setMechantId("ABSA");
			}
			// If populated, truncate to 10 characters, else ignore
			if (isoMsg.getString(41) != null) {
				requestType.setTerminalId(isoMsg.getString(41));
			}

			if (isoMsg.getString(103) != null && isoMsg.getString(103).length() > 10) {
				// Substring (S-103, 1, 4)
				requestType.setServicePackCode(isoMsg.getString(103).substring(0, 4));
			}

			// don't have the CallingLineID
			if (isoMsg.getString(103) != null && isoMsg.getString(103).length() > 14) {
				// Substring (S-103, 5, 14)
				// requestType.setServiceId(isoMsg.getString(103).substring(5, 14));
			}

			// If populated, Concatenate(P-13 + P-12 + substring(P-37, 6, 7) +
			// Substring(S-103, 6, 9) + Substring(P-41, 2, 5)), else ignore
			if (isoMsg.getString(13) != null && isoMsg.getString(12) != null && isoMsg.getString(37) != null
					&& isoMsg.getString(103) != null && isoMsg.getString(41) != null) {
				StringBuilder topUpReferenceNumberbuilder = new StringBuilder(isoMsg.getString(13));
				topUpReferenceNumberbuilder.append(isoMsg.getString(12));
				topUpReferenceNumberbuilder.append(isoMsg.getString(37).substring(6, 7));
				topUpReferenceNumberbuilder.append(isoMsg.getString(103).substring(6, 9));
				topUpReferenceNumberbuilder.append(isoMsg.getString(41).substring(2, 5));
				requestType.setTopUpReferenceNumber(topUpReferenceNumberbuilder.toString());
			}

			// 8001891 PrepayBalanceManagement ,8002712 ManageSubcriberProductEntProcess
			// if service pack is not present i.e "0000" then set product id 8001891
			if (requestType.getServicePackCode() != null && "0000".equalsIgnoreCase(requestType.getServicePackCode())) {
				requestType.setProductId("8001891");
			} else {
				requestType.setProductId("8002712");
			}
			// requestType.setTransactionType("");

			topUpRechargeManage.setRequest(requestType);
			recharge.setTopUpRechargeManage(topUpRechargeManage);
		} catch (Exception ex) {
			logger.info("Problem occured during mapIsoMessageToRecharge in mapper : " + ex.getMessage());
		}
		logger.info("Exit from mapIsoMessageToRecharge Mapper");
		return recharge;

	}

	public static ValidateAccount mapIsoMessageToValidateAccount(ISOMsg isoMsg) throws Exception {
		logger.info("Inside mapIsoMessageToValidateAccount Mapper >> " + isoMsg.getMaxField());
		logger.info("isoMsg.getString(4) <<12>> " + isoMsg.getString(4));
		logger.info("isoMsg.getString(12) <<6>> " + isoMsg.getString(12));
		logger.info("isoMsg.getString(13) <<4>> " + isoMsg.getString(13));
		logger.info("isoMsg.getString(32) <<11>> " + isoMsg.getString(32));
		logger.info("isoMsg.getString(37) <<12>> " + isoMsg.getString(37));
		logger.info("isoMsg.getString(41) <<8>> " + isoMsg.getString(41));
		logger.info("isoMsg.getString(103) <<28>> " + isoMsg.getString(103));
		ValidateAccount validateAccount = null;
		try {
			validateAccount = new ValidateAccount();
			TopUpEnquiryManage topUpEnquiryManage = new TopUpEnquiryManage();
			TopUpEnquiryManage.Request request = new Request();

			request.setSessionID(isoMsg.getString(37));

			request.setRequestedAmount(isoMsg.getString(4));

			if (ISOAdapterConstant.ABSA_MERCHANT_ID.equals(isoMsg.getString(32))) {
				request.setMerchantID("ABSA");
			}

			if (isoMsg.getString(41) != null) {
				request.setTerminalID(isoMsg.getString(41));
			}

			if (isoMsg.getString(103) != null && isoMsg.getString(103).length() > 10) {
				// Substring (S-103, 1, 4)
				request.setServicePackCode(isoMsg.getString(103).substring(0, 4));
			}

			if (isoMsg.getString(103) != null && isoMsg.getString(103).length() >= 14) {
				// Substring (S-103, 5, 14)
				request.setCallingLineID(isoMsg.getString(103).substring(5, 14));
			}

			// If populated, Concatenate(P-13 + P-12 + subscring(P-37, 7, 6) +
			// Substring(S-103, 6, 9) + Substring(P-41, 2, 5)), else ignore
			if (isoMsg.getString(13) != null && isoMsg.getString(12) != null && isoMsg.getString(37) != null
					&& isoMsg.getString(103) != null && isoMsg.getString(41) != null) {
				StringBuilder topUpReferenceNumberbuilder = new StringBuilder(isoMsg.getString(13));
				topUpReferenceNumberbuilder.append(isoMsg.getString(12));
				topUpReferenceNumberbuilder.append(isoMsg.getString(37).substring(6, 7));
				topUpReferenceNumberbuilder.append(isoMsg.getString(103).substring(6, 9));
				topUpReferenceNumberbuilder.append(isoMsg.getString(41).substring(2, 5));
				request.setTopUpReferenceNumber(topUpReferenceNumberbuilder.toString());
			}

			// 8001891 PrepayBalanceManagement ,8002712 ManageSubcriberProductEntProcess
			// if service pack is not present i.e "0000" then set product id 8001891
			if (request.getServicePackCode() != null && "0000".equalsIgnoreCase(request.getServicePackCode())) {
				request.setProductID("8001891");
			} else {
				request.setProductID("8002712");
			}

			topUpEnquiryManage.setRequest(request);
			validateAccount.setTopUpEnquiryManage(topUpEnquiryManage);
		} catch (Exception ex) {
			logger.error(
					"Problem occured during marshalling in mapIsoMessageToValidateAccount mapper : " + ex.getMessage());
		}
		logger.info("Exit from mapIsoMessageToValidateAccount Mapper");
		return validateAccount;
	}

	public static RechargeResponse mapRechargeResponseSOAPMessageToPojo(String body) {
		logger.info("In  mapRechargeResponseSOAPMessageToPojo Body is >> " + body);
		RechargeResponse rechargeResponse = null;
		try {

			SOAPMessage message = MessageFactory.newInstance().createMessage(null,
					new ByteArrayInputStream(body.getBytes(Charset.forName("UTF-8"))));

			JAXBContext jaxbContext = JAXBContext.newInstance(RechargeResponse.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			rechargeResponse = (RechargeResponse) jaxbUnmarshaller
					.unmarshal(message.getSOAPBody().extractContentAsDocument());

		} catch (Exception ex) {
			logger.error("Problem occured during unmarshaller in mapper : " + ex.getMessage());
		}
		return rechargeResponse;
	}

	public static ValidateAccountResponse mapValidateAccountResponseSOAPMessageToPojo(String body) {
		logger.info("In  mapRechargeResponseSOAPMessageToPojo Body is >> " + body);
		ValidateAccountResponse validateAccountResponse = null;
		try {

			SOAPMessage message = MessageFactory.newInstance().createMessage(null,
					new ByteArrayInputStream(body.getBytes(Charset.forName("UTF-8"))));

			JAXBContext jaxbContext = JAXBContext.newInstance(ValidateAccountResponse.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			validateAccountResponse = (ValidateAccountResponse) jaxbUnmarshaller
					.unmarshal(message.getSOAPBody().extractContentAsDocument());

		} catch (Exception ex) {
			logger.error("Problem occured during unmarshaller in mapper : " + ex.getMessage());
		}
		return validateAccountResponse;
	}

	public static ValidateAccountResponse mapValidateAccountResponseXmlValuesToPojo(String body) {
		logger.info("In  mapValidateAccountResponseXmlValuesToPojo Body is >> " + body);
		ValidateAccountResponse validateAccountResponse = null;
		try {

			JAXBContext instance = JAXBContext.newInstance(ValidateAccountResponse.class);
			Unmarshaller unmarshaller = instance.createUnmarshaller();
			StringReader reader = new StringReader(body);
			validateAccountResponse = (ValidateAccountResponse) unmarshaller.unmarshal(reader);

		} catch (Exception ex) {
			logger.error("Problem occured during unmarshaller in mapper : " + ex.getMessage());
		}
		return validateAccountResponse;
	}

	public static SOAPMessage mapRechargePojoToSOAPMessage(Recharge recharge) {
		SOAPMessage message = null;
		try {
			MessageFactory mf = MessageFactory.newInstance();
			message = mf.createMessage();
			SOAPBody body = message.getSOAPBody();

			JAXBContext jc = JAXBContext.newInstance(Recharge.class);
			Marshaller marshaller = jc.createMarshaller();
			marshaller.marshal(recharge, body);

			message.saveChanges();
		} catch (Exception ex) {
			logger.error("Problem occured during marshalling in mapper : " + ex.getMessage());
		}
		logger.info("Exit from mapRechargePojoToSOAPMessage Mapper" + message.toString());
		return message;
	}

	public static SOAPMessage mapValidateAccountPojoToSOAPMessage(ValidateAccount validateAccount) {
		SOAPMessage message = null;
		try {
			MessageFactory mf = MessageFactory.newInstance();
			message = mf.createMessage();
			SOAPBody body = message.getSOAPBody();

			JAXBContext jc = JAXBContext.newInstance(ValidateAccount.class);
			Marshaller marshaller = jc.createMarshaller();
			marshaller.marshal(validateAccount, body);

			message.saveChanges();
		} catch (Exception ex) {
			logger.error("Problem occured during marshalling in mapper : " + ex.getMessage());
		}
		logger.info("Exit from mapValidateAccountPojoToSOAPMessage Mapper" + message.toString());
		return message;
	}
}
