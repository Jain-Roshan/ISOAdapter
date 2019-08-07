
package za.co.telkom.eai.billing.cardholder3dsauthenticationresultverify;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Container type for the complex element Request
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MerchantId" type="{http://eai.telkom.co.za/Billing_Types}MerchantID_Type"/&gt;
 *         &lt;element name="MerchantPassword" type="{http://eai.telkom.co.za/Billing_Types}MerchantPasswordType"/&gt;
 *         &lt;element name="MerchantProcessorId" type="{http://eai.telkom.co.za/Billing_Types}MerchantApplicationIdType"/&gt;
 *         &lt;element name="TransactionType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://eai.telkom.co.za/Billing_Types}TransactionType_Type"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionId" type="{http://eai.telkom.co.za/Billing_Types}TransactionID_Type"/&gt;
 *         &lt;element name="PayerAuthenticationResponse"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="600"/&gt;
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
@XmlType(name = "RequestType", propOrder = {
    "merchantId",
    "merchantPassword",
    "merchantProcessorId",
    "transactionType",
    "transactionId",
    "payerAuthenticationResponse"
})
public class RequestType {

    @XmlElement(name = "MerchantId", required = true)
    protected String merchantId;
    @XmlElement(name = "MerchantPassword", required = true)
    protected String merchantPassword;
    @XmlElement(name = "MerchantProcessorId", required = true)
    protected String merchantProcessorId;
    @XmlElement(name = "TransactionType", required = true)
    protected String transactionType;
    @XmlElement(name = "TransactionId", required = true)
    protected String transactionId;
    @XmlElement(name = "PayerAuthenticationResponse", required = true)
    protected String payerAuthenticationResponse;

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the merchantPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPassword() {
        return merchantPassword;
    }

    /**
     * Sets the value of the merchantPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPassword(String value) {
        this.merchantPassword = value;
    }

    /**
     * Gets the value of the merchantProcessorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantProcessorId() {
        return merchantProcessorId;
    }

    /**
     * Sets the value of the merchantProcessorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantProcessorId(String value) {
        this.merchantProcessorId = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

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
     * Gets the value of the payerAuthenticationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerAuthenticationResponse() {
        return payerAuthenticationResponse;
    }

    /**
     * Sets the value of the payerAuthenticationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerAuthenticationResponse(String value) {
        this.payerAuthenticationResponse = value;
    }

}
