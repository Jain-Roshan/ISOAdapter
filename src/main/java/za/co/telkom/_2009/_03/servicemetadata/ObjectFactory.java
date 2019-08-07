
package za.co.telkom._2009._03.servicemetadata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.co.telkom._2009._03.servicemetadata package. 
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

    private final static QName _CorrelationId_QNAME = new QName("http://www.telkom.co.za/2009/03/ServiceMetaData", "CorrelationId");
    private final static QName _SenderId_QNAME = new QName("http://www.telkom.co.za/2009/03/ServiceMetaData", "SenderId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.co.telkom._2009._03.servicemetadata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CorrelationIdType }
     * 
     */
    public CorrelationIdType createCorrelationIdType() {
        return new CorrelationIdType();
    }

    /**
     * Create an instance of {@link SenderIdType }
     * 
     */
    public SenderIdType createSenderIdType() {
        return new SenderIdType();
    }

    /**
     * Create an instance of {@link GeneratedTimeStamp }
     * 
     */
    public GeneratedTimeStamp createGeneratedTimeStamp() {
        return new GeneratedTimeStamp();
    }

    /**
     * Create an instance of {@link SentTimeStamp }
     * 
     */
    public SentTimeStamp createSentTimeStamp() {
        return new SentTimeStamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrelationIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telkom.co.za/2009/03/ServiceMetaData", name = "CorrelationId")
    public JAXBElement<CorrelationIdType> createCorrelationId(CorrelationIdType value) {
        return new JAXBElement<CorrelationIdType>(_CorrelationId_QNAME, CorrelationIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SenderIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.telkom.co.za/2009/03/ServiceMetaData", name = "SenderId")
    public JAXBElement<SenderIdType> createSenderId(SenderIdType value) {
        return new JAXBElement<SenderIdType>(_SenderId_QNAME, SenderIdType.class, null, value);
    }

}
