package com.telkom.processor;

import javax.xml.soap.SOAPMessage;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.jpos.iso.ISOMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.telkom.utility.ISO8583MessageEncoderDecoder;
import com.telkom.utility.ISOAdapterConstant;
import com.telkom.utility.ISOMsgWrraper;
import com.telkom.utility.Mapper;

import za.co.telkom.Recharge;
import za.co.telkom.ValidateAccount;

public class ISOMessageRequestProcessor implements Processor {

	private static Logger logger = LoggerFactory.getLogger(ISOMessageRequestProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("==========Inside ISO Message Request Processor ==========" + exchange.getIn().getBody(String.class));
		String message = exchange.getIn().getBody(String.class);
		ISOMsg isoMsg = ISO8583MessageEncoderDecoder.decomposeISOMessage(message);
		ISOMsgWrraper.isoMsg = isoMsg;
		if (isoMsg != null) {
			exchange.getIn().setHeader("requestType", isoMsg.getMTI());
			if (ISOAdapterConstant.ISO_MSG_0220_TYPE_CODE.equals(isoMsg.getMTI())) {
				ValidateAccount validateAccount = Mapper.mapIsoMessageToValidateAccount(isoMsg);
				SOAPMessage soapMessage = Mapper.mapValidateAccountPojoToSOAPMessage(validateAccount);
				exchange.getIn().setBody(soapMessage);
			} else if (ISOAdapterConstant.ISO_MSG_0200_TYPE_CODE.equals(isoMsg.getMTI())) {
				Recharge recharge = Mapper.mapIsoMessageToRecharge(isoMsg);
				SOAPMessage soapMessage = Mapper.mapRechargePojoToSOAPMessage(recharge);
				exchange.getIn().setBody(soapMessage);
			} 
		}
		logger.info(exchange.getIn().getBody()+"==========Exit from ISO Message Request Processor ==========requestType >> " + exchange.getIn().getHeader("requestType"));
	}
}