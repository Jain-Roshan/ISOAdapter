
package za.co.telkom.eai.billing.cardholder3dsauthenticationresultverify;

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
 *         &lt;element name="CAVV"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionXId" type="{http://eai.telkom.co.za/Billing_Types}TransactionID_Type"/&gt;
 *         &lt;element name="ECIFlag" type="{http://eai.telkom.co.za/Billing_Types}ECIFlagType"/&gt;
 *         &lt;element name="EnrolmentFlag" type="{http://eai.telkom.co.za/Billing_Types}EnrolmentFlagType"/&gt;
 *         &lt;element name="PAResStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PAResSignatureVerification"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
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
    "cavv",
    "transactionXId",
    "eciFlag",
    "enrolmentFlag",
    "paResStatus",
    "paResSignatureVerification"
})
public class PayloadType {

    @XmlElement(name = "CAVV", required = true)
    protected String cavv;
    @XmlElement(name = "TransactionXId", required = true)
    protected String transactionXId;
    @XmlElement(name = "ECIFlag")
    protected int eciFlag;
    @XmlElement(name = "EnrolmentFlag", required = true)
    protected String enrolmentFlag;
    @XmlElement(name = "PAResStatus", required = true)
    protected String paResStatus;
    @XmlElement(name = "PAResSignatureVerification", required = true)
    protected String paResSignatureVerification;

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAVV() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAVV(String value) {
        this.cavv = value;
    }

    /**
     * Gets the value of the transactionXId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionXId() {
        return transactionXId;
    }

    /**
     * Sets the value of the transactionXId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionXId(String value) {
        this.transactionXId = value;
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
     * Gets the value of the paResStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAResStatus() {
        return paResStatus;
    }

    /**
     * Sets the value of the paResStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAResStatus(String value) {
        this.paResStatus = value;
    }

    /**
     * Gets the value of the paResSignatureVerification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAResSignatureVerification() {
        return paResSignatureVerification;
    }

    /**
     * Sets the value of the paResSignatureVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAResSignatureVerification(String value) {
        this.paResSignatureVerification = value;
    }

}
