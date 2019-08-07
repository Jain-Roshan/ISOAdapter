
package za.co.telkom.eai.billing.cardholder3dsenrolmentstatusquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container type for the complex element Payload
 * 
 * <p>Java class for PayloadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayloadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionId" type="{http://eai.telkom.co.za/Billing_Types}TransactionID_Type"/&gt;
 *         &lt;element name="EnrolmentFlag"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayerAutheticationRequest" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="600"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccessControlServerURL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="225"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ECIFlag"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadType", propOrder = {
    "transactionId",
    "enrolmentFlag",
    "payerAutheticationRequest",
    "accessControlServerURL",
    "eciFlag"
})
public class PayloadType {

    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "EnrolmentFlag", required = true)
    protected String enrolmentFlag;
    @XmlElement(name = "PayerAutheticationRequest")
    protected String payerAutheticationRequest;
    @XmlElement(name = "AccessControlServerURL")
    protected String accessControlServerURL;
    @XmlElement(name = "ECIFlag")
    protected int eciFlag;

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the enrolmentFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrolmentFlag() {
        return enrolmentFlag;
    }

    /**
     * Sets the value of the enrolmentFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrolmentFlag(String value) {
        this.enrolmentFlag = value;
    }

    /**
     * Gets the value of the payerAutheticationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAutheticationRequest() {
        return payerAutheticationRequest;
    }

    /**
     * Sets the value of the payerAutheticationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAutheticationRequest(String value) {
        this.payerAutheticationRequest = value;
    }

    /**
     * Gets the value of the accessControlServerURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessControlServerURL() {
        return accessControlServerURL;
    }

    /**
     * Sets the value of the accessControlServerURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessControlServerURL(String value) {
        this.accessControlServerURL = value;
    }

    /**
     * Gets the value of the eciFlag property.
     * 
     */
    public int getECIFlag() {
        return eciFlag;
    }

    /**
     * Sets the value of the eciFlag property.
     * 
     */
    public void setECIFlag(int value) {
        this.eciFlag = value;
    }

}
