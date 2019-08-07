
package za.co.telkom.eai.billing.topupenquirymanage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * container type for the request payload
 * 
 * <p>Java class for Request_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionType" type="{http://eai.telkom.co.za/Billing_Types}TransactionType_Type"/&gt;
 *         &lt;element name="TopUpReferenceNumber" type="{http://eai.telkom.co.za/Billing_Types}TopUpReferenceNumber_Type" minOccurs="0"/&gt;
 *         &lt;element name="SessionID" type="{http://eai.telkom.co.za/Billing_Types}SessionID_Type" minOccurs="0"/&gt;
 *         &lt;element name="MerchantID" type="{http://eai.telkom.co.za/Billing_Types}MerchantID_Type"/&gt;
 *         &lt;element name="TerminalID" type="{http://eai.telkom.co.za/Billing_Types}TerminalID_Type"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ProductID" type="{http://eai.telkom.co.za/Billing_Types}ProductID_Type"/&gt;
 *           &lt;element name="ServiceType" type="{http://eai.telkom.co.za/Billing_Types}ServiceType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CallingLineID" type="{http://eai.telkom.co.za/Billing_Types}CallingLineID_Type"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="RequestedAmount" type="{http://eai.telkom.co.za/Billing_Types}TopUpAmount_Type"/&gt;
 *           &lt;element name="VoucherInfo"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="VoucherNumber" type="{http://eai.telkom.co.za/Billing_Types}VoucherNumber_Type"/&gt;
 *                     &lt;element name="VoucherPIN" type="{http://eai.telkom.co.za/Billing_Types}PINType"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ServicePackCode" type="{http://eai.telkom.co.za/Billing_Types}ServicePackCode_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request_type", propOrder = {
    "transactionType",
    "topUpReferenceNumber",
    "sessionID",
    "merchantID",
    "terminalID",
    "productID",
    "serviceType",
    "callingLineID",
    "requestedAmount",
    "voucherInfo",
    "servicePackCode"
})
@XmlSeeAlso({
    za.co.telkom.eai.billing.topupenquirymanage.TopUpEnquiryManage.Request.class
})
public class RequestType {

    @XmlElement(name = "TransactionType", required = true)
    protected String transactionType;
    @XmlElement(name = "TopUpReferenceNumber")
    protected String topUpReferenceNumber;
    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "MerchantID", required = true)
    protected String merchantID;
    @XmlElement(name = "TerminalID", required = true)
    protected String terminalID;
    @XmlElement(name = "ProductID")
    protected String productID;
    @XmlElement(name = "ServiceType")
    protected Integer serviceType;
    @XmlElement(name = "CallingLineID", required = true)
    protected String callingLineID;
    @XmlElement(name = "RequestedAmount")
    protected String requestedAmount;
    @XmlElement(name = "VoucherInfo")
    protected RequestType.VoucherInfo voucherInfo;
    @XmlElement(name = "ServicePackCode")
    protected String servicePackCode;

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
     * Gets the value of the topUpReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopUpReferenceNumber() {
        return topUpReferenceNumber;
    }

    /**
     * Sets the value of the topUpReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopUpReferenceNumber(String value) {
        this.topUpReferenceNumber = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the merchantID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantID() {
        return merchantID;
    }

    /**
     * Sets the value of the merchantID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantID(String value) {
        this.merchantID = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceType(Integer value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the callingLineID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingLineID() {
        return callingLineID;
    }

    /**
     * Sets the value of the callingLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingLineID(String value) {
        this.callingLineID = value;
    }

    /**
     * Gets the value of the requestedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Sets the value of the requestedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedAmount(String value) {
        this.requestedAmount = value;
    }

    /**
     * Gets the value of the voucherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType.VoucherInfo }
     *     
     */
    public RequestType.VoucherInfo getVoucherInfo() {
        return voucherInfo;
    }

    /**
     * Sets the value of the voucherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType.VoucherInfo }
     *     
     */
    public void setVoucherInfo(RequestType.VoucherInfo value) {
        this.voucherInfo = value;
    }

    /**
     * Gets the value of the servicePackCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePackCode() {
        return servicePackCode;
    }

    /**
     * Sets the value of the servicePackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePackCode(String value) {
        this.servicePackCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="VoucherNumber" type="{http://eai.telkom.co.za/Billing_Types}VoucherNumber_Type"/&gt;
     *         &lt;element name="VoucherPIN" type="{http://eai.telkom.co.za/Billing_Types}PINType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "voucherNumber",
        "voucherPIN"
    })
    public static class VoucherInfo {

        @XmlElement(name = "VoucherNumber", required = true)
        protected String voucherNumber;
        @XmlElement(name = "VoucherPIN", required = true)
        protected String voucherPIN;

        /**
         * Gets the value of the voucherNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoucherNumber() {
            return voucherNumber;
        }

        /**
         * Sets the value of the voucherNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoucherNumber(String value) {
            this.voucherNumber = value;
        }

        /**
         * Gets the value of the voucherPIN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVoucherPIN() {
            return voucherPIN;
        }

        /**
         * Sets the value of the voucherPIN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVoucherPIN(String value) {
            this.voucherPIN = value;
        }

    }

}
