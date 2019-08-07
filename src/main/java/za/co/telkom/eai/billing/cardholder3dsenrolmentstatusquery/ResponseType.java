
package za.co.telkom.eai.billing.cardholder3dsenrolmentstatusquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import za.co.telkom.eai.billing_types.ResultType;


/**
 * Container type for the complex element Response
 * 
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{http://eai.telkom.co.za/Billing_Types}Result_type"/&gt;
 *         &lt;element name="Payload" type="{http://eai.telkom.co.za/Billing/Cardholder3DSEnrolmentStatusQuery}PayloadType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "result",
    "payload"
})
public class ResponseType {

    @XmlElement(name = "Result", required = true)
    protected ResultType result;
    @XmlElement(name = "Payload")
    protected PayloadType payload;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResult(ResultType value) {
        this.result = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link PayloadType }
     *     
     */
    public PayloadType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayloadType }
     *     
     */
    public void setPayload(PayloadType value) {
        this.payload = value;
    }

}
