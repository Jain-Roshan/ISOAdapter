package com.telkom.utility;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.packager.GenericPackager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import za.co.telkom.RechargeResponse;
import za.co.telkom.ValidateAccountResponse;
import za.co.telkom.eai.billing.topupenquirymanage.ResponseType.Payload;
import za.co.telkom.eai.billing.topuprechargemanage.ResponseType;

public class ISO8583MessageEncoderDecoder {
	private static Logger logger = LoggerFactory.getLogger(ISO8583MessageEncoderDecoder.class);

	public static ISOMsg decomposeISOMessage(String message) throws Exception {
		logger.info("Inside ISO8583MessageDecoder to parseISOMessage >>"+message);
		ISOMsg isoMsg = new ISOMsg();
		try {
			String configFilePath = "/home/roshan/9thBIT/codebase2/fuse-ISO-adapter/src/main/resources/iso-config/fileds.xml";
			GenericPackager packager = new GenericPackager(configFilePath);
			isoMsg.setPackager(packager);
			isoMsg.unpack(message.getBytes());
		} catch (ISOException e) {
			logger.error("Inside ISO8583MessageDecoder to decomposeISOMessage Exception>>"+e.getMessage(),e);
		}
		logger.info("Exit ISO8583MessageDecoder to parseISOMessage >>"+message);
		return isoMsg;
	}
	
	public static String composeISOMessageFromValidateAccountResponse(ValidateAccountResponse validateAccountResponse) throws Exception {
		logger.info("Inside ISO8583MessageDecoder to composeISOMessageFromValidateAccountResponse >>");
		String composeMessage = null;
		ISOMsg isoMsg = ISOMsgWrraper.isoMsg;
		try {
			if(validateAccountResponse != null && validateAccountResponse.getTopUpEnquiryManage() != null && validateAccountResponse.getTopUpEnquiryManage().getResponse() != null) {
				logger.info("Set Values:::>>");
				za.co.telkom.eai.billing.topupenquirymanage.ResponseType responseType = validateAccountResponse.getTopUpEnquiryManage().getResponse();

				Payload payload = responseType.getPayload();
				if(payload != null) {
					isoMsg.set(37, payload.getTopUpReferenceNumber());
					isoMsg.set(103, payload.getCardNumber());
					isoMsg.set(4, payload.getRechargeAmount());
				}
				if(responseType.getResult() != null) {
					String responseCode = String.valueOf(responseType.getResult().getResultCode()).length() <2 ? "0"+String.valueOf(responseType.getResult().getResultCode()) : String.valueOf(responseType.getResult().getResultCode());
					isoMsg.set(39, responseCode);
				}
				//isoMsg.set(41, "Terminal");//use request data as per call communication
				//isoMsg.set(32, "99999999999");//use request data as per call communication
				
			}
			byte[] data = isoMsg.pack();
			composeMessage = new String(data);
		} catch (ISOException e) {
			logger.info("Inside ISO8583MessageEncoderDecoder to composeISOMessageFromValidateAccountResponse Exception>>"+e.getMessage());
		}
		logger.info("Exit ISO8583MessageDecoder to composeISOMessageFromValidateAccountResponse >>");
		return composeMessage;
	}
	
	
	public static String composeISOMessageFromRechargeResponse(RechargeResponse rechargeResponse) throws Exception {
		logger.info("Inside ISO8583MessageDecoder to composeISOMessageFromRechargeResponse >>");
		String composeMessage = null;
		ISOMsg isoMsg = ISOMsgWrraper.isoMsg;
		try {
			if(rechargeResponse != null && rechargeResponse.getTopUpRechargeManage() != null && rechargeResponse.getTopUpRechargeManage().getResponse() != null) {
				logger.info("Set Values:::>>");
				ResponseType responseType = rechargeResponse.getTopUpRechargeManage().getResponse();
				
				if(responseType.getPayload() != null) {
					isoMsg.set(41, responseType.getPayload().getTopUpReferenceNumber());
					isoMsg.set(4, responseType.getPayload().getRechargeAmount());
				}
				
				if(responseType.getResult() != null) {
					String responseCode = String.valueOf(responseType.getResult().getResultCode()).length() <2 ? "0"+String.valueOf(responseType.getResult().getResultCode()) : String.valueOf(responseType.getResult().getResultCode());
					isoMsg.set(39, responseCode);
				}
				
				//isoMsg.set(38, "ClientRechargeReferenceNumber");//not required as per call communication
				//isoMsg.set(103, "");//use request data as per call communication
				byte[] data = isoMsg.pack();
				composeMessage = new String(data);
			}
			
		} catch (ISOException e) {
			logger.error("Inside ISO8583MessageEncoderDecoder to composeISOMessageFromRechargeResponse Exception>>"+e.getMessage());
		}
		logger.info("Exit ISO8583MessageDecoder to composeISOMessageFromRechargeResponse >>");
		return composeMessage;
	}
	
	
	public static String composeISOMessageForErrorResponse() throws Exception {
		logger.info("Inside ISO8583MessageDecoder to composeISOMessageForErrorResponse >>");
		String composeMessage = null;
		ISOMsg isoMsg = ISOMsgWrraper.isoMsg;
		try {
				isoMsg.set(39, "01");
				byte[] data = isoMsg.pack();
				composeMessage = new String(data);
		} catch (ISOException e) {
			logger.error("Inside ISO8583MessageEncoderDecoder to composeISOMessageForErrorResponse Exception>>"+e.getMessage());
		}
		logger.info("Exit ISO8583MessageDecoder to composeISOMessageForErrorResponse >>");
		return composeMessage;
	}
}
