package com.telkom.route;

import java.net.UnknownHostException;

import javax.ws.rs.ClientErrorException;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.http.common.HttpOperationFailedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.telkom.processor.ISOMessageRequestProcessor;
import com.telkom.processor.ISOMessageResponseProcessor;
import com.telkom.utility.ISOAdapterConstant;

public class ISOAdapterRoute extends RouteBuilder {

	public static final Logger looger = LoggerFactory.getLogger(ISOAdapterRoute.class);

	@Override
	public void configure() throws Exception {

		onException(UnknownHostException.class).handled(true).log("VPN not connected.").transform()
				.simple("VPN not connected.");

		onException(ClientErrorException.class).handled(true).log("Internal system is down.").transform()
				.simple("Internal system is down");
		
		/*onException(HttpOperationFailedException.class).handled(true).log("Internal system communication error.").transform()
		.simple("Internal system error");*/

		//from("mina2:tcp://"+ISOAdapterConstant.TCP_IP_HOST+":" + ISOAdapterConstant.PORT_NUMBER + "?sync=false&textline=true")
		from("mina2:tcp://"+"{{tcpiphost}}"+":" + "{{portnumber}}" + "?sync=false&textline=true")
				.log("======== ISO Adapter IN ========")
				.process(new ISOMessageRequestProcessor())
				.choice()
				.when(header("requestType").isEqualTo(ISOAdapterConstant.ISO_MSG_0220_TYPE_CODE))
					.log("======== inside 0220 route ========")
					.to("{{pinlessrecharge}}")
					.log(" ==== Response from pinless recharge validation process ==== ")
				.when(header("requestType").isEqualTo(ISOAdapterConstant.ISO_MSG_0200_TYPE_CODE))
					.log("======= inside 0200 route ========")
					.to("{{twophase}}")
					.log(" ==== Response from two Phase recharge process ==== ${header.CamelHttpResponseCode}")
				.end()
				.process(new ISOMessageResponseProcessor())
				.log("======== ISO Adapter Exit ========")
				.end();
	}

}