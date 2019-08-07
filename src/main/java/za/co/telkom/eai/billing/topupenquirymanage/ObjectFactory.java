
package za.co.telkom.eai.billing.topupenquirymanage;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.co.telkom.eai.billing.topupenquirymanage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.co.telkom.eai.billing.topupenquirymanage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TopUpEnquiryManage }
     * 
     */
    public TopUpEnquiryManage createTopUpEnquiryManage() {
        return new TopUpEnquiryManage();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link TopUpEnquiryManage.Request }
     * 
     */
    public TopUpEnquiryManage.Request createTopUpEnquiryManageRequest() {
        return new TopUpEnquiryManage.Request();
    }

    /**
     * Create an instance of {@link RequestType.VoucherInfo }
     * 
     */
    public RequestType.VoucherInfo createRequestTypeVoucherInfo() {
        return new RequestType.VoucherInfo();
    }

    /**
     * Create an instance of {@link ResponseType.Payload }
     * 
     */
    public ResponseType.Payload createResponseTypePayload() {
        return new ResponseType.Payload();
    }

}
