package com.telkom.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telkom.utility.ISO8583MessageEncoderDecoder;
import com.telkom.utility.ISOAdapterConstant;
import com.telkom.utility.ISOMsgWrraper;
import com.telkom.utility.Mapper;

import za.co.telkom.RechargeResponse;
import za.co.telkom.ValidateAccountResponse;

public class ISOMessageResponseProcessor implements Processor{

	private static Logger logger = LoggerFactory.getLogger(ISOMessageResponseProcessor.class);
	ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	public void process(Exchange exchange) throws Exception {
		String body = exchange.getIn().getBody(String.class);
		logger.info("==========Inside ISO Message Response Processor =========="+body) ;
		String response = "Invalid ios message type request";
		if (ISOAdapterConstant.ISO_MSG_0220_TYPE_CODE.equals(ISOMsgWrraper.isoMsg.getMTI())) {
			//ValidateAccountResponse validateAccountResponse = Mapper.mapValidateAccountResponseXmlValuesToPojo(body);
			ValidateAccountResponse validateAccountResponse = Mapper.mapValidateAccountResponseSOAPMessageToPojo(body);
			response = ISO8583MessageEncoderDecoder.composeISOMessageFromValidateAccountResponse(validateAccountResponse);
		}else if(ISOAdapterConstant.ISO_MSG_0200_TYPE_CODE.equals(ISOMsgWrraper.isoMsg.getMTI())){
			RechargeResponse rechargeResponse =  Mapper.mapRechargeResponseSOAPMessageToPojo(body);
			response = ISO8583MessageEncoderDecoder.composeISOMessageFromRechargeResponse(rechargeResponse);
		}else {
			response = ISO8583MessageEncoderDecoder.composeISOMessageForErrorResponse();
		}
		exchange.getOut().setBody(response);
		logger.info("==========Exit from ISO Message Response Processor ==========");
	}
}
