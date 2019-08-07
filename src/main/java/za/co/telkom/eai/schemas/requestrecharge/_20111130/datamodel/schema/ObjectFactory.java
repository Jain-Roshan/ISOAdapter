
package za.co.telkom.eai.schemas.requestrecharge._20111130.datamodel.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.co.telkom.eai.schemas.requestrecharge._20111130.datamodel.schema package. 
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

    private final static QName _Response_QNAME = new QName("http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", "Response");
    private final static QName _MobileRechargeRequest_QNAME = new QName("http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", "MobileRechargeRequest");
    private final static QName _FixedRechargeRequest_QNAME = new QName("http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", "FixedRechargeRequest");
    private final static QName _FixedRechargeResponse_QNAME = new QName("http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", "FixedRechargeResponse");
    private final static QName _Request_QNAME = new QName("http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", "Request");
    private final static QName _MobileRechargeResponse_QNAME = new QName("http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", "MobileRechargeResponse");
    private final static QName _Result_QNAME = new QName("http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", "Result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.co.telkom.eai.schemas.requestrecharge._20111130.datamodel.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link FixedRechargeRequestType }
     * 
     */
    public FixedRechargeRequestType createFixedRechargeRequestType() {
        return new FixedRechargeRequestType();
    }

    /**
     * Create an instance of {@link MobileRechargeRequestType }
     * 
     */
    public MobileRechargeRequestType createMobileRechargeRequestType() {
        return new MobileRechargeRequestType();
    }

    /**
     * Create an instance of {@link FixedRechargeResponseType }
     * 
     */
    public FixedRechargeResponseType createFixedRechargeResponseType() {
        return new FixedRechargeResponseType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link MobileRechargeResponseType }
     * 
     */
    public MobileRechargeResponseType createMobileRechargeResponseType() {
        return new MobileRechargeResponseType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link WorldCallCardRechargeRequestType }
     * 
     */
    public WorldCallCardRechargeRequestType createWorldCallCardRechargeRequestType() {
        return new WorldCallCardRechargeRequestType();
    }

    /**
     * Create an instance of {@link WorldCallCardRechargeResponseType }
     * 
     */
    public WorldCallCardRechargeResponseType createWorldCallCardRechargeResponseType() {
        return new WorldCallCardRechargeResponseType();
    }

    /**
     * Create an instance of {@link ResponseType.Payload }
     * 
     */
    public ResponseType.Payload createResponseTypePayload() {
        return new ResponseType.Payload();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", name = "Response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileRechargeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", name = "MobileRechargeRequest")
    public JAXBElement<MobileRechargeRequestType> createMobileRechargeRequest(MobileRechargeRequestType value) {
        return new JAXBElement<MobileRechargeRequestType>(_MobileRechargeRequest_QNAME, MobileRechargeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixedRechargeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", name = "FixedRechargeRequest")
    public JAXBElement<FixedRechargeRequestType> createFixedRechargeRequest(FixedRechargeRequestType value) {
        return new JAXBElement<FixedRechargeRequestType>(_FixedRechargeRequest_QNAME, FixedRechargeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixedRechargeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", name = "FixedRechargeResponse")
    public JAXBElement<FixedRechargeResponseType> createFixedRechargeResponse(FixedRechargeResponseType value) {
        return new JAXBElement<FixedRechargeResponseType>(_FixedRechargeResponse_QNAME, FixedRechargeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", name = "Request")
    public JAXBElement<RequestType> createRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Request_QNAME, RequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MobileRechargeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", name = "MobileRechargeResponse")
    public JAXBElement<MobileRechargeResponseType> createMobileRechargeResponse(MobileRechargeResponseType value) {
        return new JAXBElement<MobileRechargeResponseType>(_MobileRechargeResponse_QNAME, MobileRechargeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd", name = "Result")
    public JAXBElement<ResultType> createResult(ResultType value) {
        return new JAXBElement<ResultType>(_Result_QNAME, ResultType.class, null, value);
    }

}
