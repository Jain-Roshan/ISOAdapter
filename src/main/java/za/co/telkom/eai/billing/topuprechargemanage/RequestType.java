
package za.co.telkom.eai.billing.topuprechargemanage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
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
 *         &lt;element name="MechantId" type="{http://eai.telkom.co.za/Billing_Types}MerchantID_Type" minOccurs="0"/&gt;
 *         &lt;element name="TerminalId" type="{http://eai.telkom.co.za/Billing_Types}TerminalID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ServiceId" type="{http://eai.telkom.co.za/Billing_Types}CallingLineID_Type" minOccurs="0"/&gt;
 *         &lt;element name="SubAccountID" type="{http://eai.telkom.co.za/Billing_Types}AccountID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://eai.telkom.co.za/Billing_Types}ProductID_Type" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="CreditCardNumber" type="{http://eai.telkom.co.za/Billing_Types}CreditCardNumber_Type"/&gt;
 *             &lt;element name="CVV2" type="{http://eai.telkom.co.za/Billing_Types}CVV2_Type"/&gt;
 *             &lt;element name="CardExpiryDate" type="{http://eai.telkom.co.za/Billing_Types}CardExpiryDate_Type"/&gt;
 *             &lt;element name="NameOnCard" type="{http://eai.telkom.co.za/Billing_Types}NameOnCard_Type"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="VoucherInfo"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="VoucherNumber" type="{http://eai.telkom.co.za/Billing_Types}VoucherNumber_Type"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="RechargeAmount" type="{http://eai.telkom.co.za/Billing_Types}AmountCentsValue_Type" minOccurs="0"/&gt;
 *         &lt;element name="CAVV" type="{http://eai.telkom.co.za/Billing_Types}CAVVType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionXId" type="{http://eai.telkom.co.za/Billing_Types}TransactionID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ECIFlag" type="{http://eai.telkom.co.za/Billing_Types}ECIFlagType" minOccurs="0"/&gt;
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
    "mechantId",
    "terminalId",
    "serviceId",
    "subAccountID",
    "productId",
    "creditCardNumber",
    "cvv2",
    "cardExpiryDate",
    "nameOnCard",
    "voucherInfo",
    "rechargeAmount",
    "cavv",
    "transactionXId",
    "eciFlag",
    "servicePackCode"
})
public class RequestType {

    @XmlElement(name = "TransactionType", required = true)
    protected String transactionType;
    @XmlElement(name = "TopUpReferenceNumber")
    protected String topUpReferenceNumber;
    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "MechantId")
    protected String mechantId;
    @XmlElement(name = "TerminalId")
    protected String terminalId;
    @XmlElement(name = "ServiceId")
    protected String serviceId;
    @XmlElement(name = "SubAccountID")
    protected String subAccountID;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CVV2")
    protected String cvv2;
    @XmlElement(name = "CardExpiryDate")
    protected String cardExpiryDate;
    @XmlElement(name = "NameOnCard")
    protected String nameOnCard;
    @XmlElement(name = "VoucherInfo")
    protected RequestType.VoucherInfo voucherInfo;
    @XmlElement(name = "RechargeAmount")
    protected Long rechargeAmount;
    @XmlElement(name = "CAVV")
    protected String cavv;
    @XmlElement(name = "TransactionXId")
    protected String transactionXId;
    @XmlElement(name = "ECIFlag")
    protected Integer eciFlag;
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
     * Gets the value of the mechantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechantId() {
        return mechantId;
    }

    /**
     * Sets the value of the mechantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechantId(String value) {
        this.mechantId = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the subAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAccountID() {
        return subAccountID;
    }

    /**
     * Sets the value of the subAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAccountID(String value) {
        this.subAccountID = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the cvv2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV2() {
        return cvv2;
    }

    /**
     * Sets the value of the cvv2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVV2(String value) {
        this.cvv2 = value;
    }

    /**
     * Gets the value of the cardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Sets the value of the cardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiryDate(String value) {
        this.cardExpiryDate = value;
    }

    /**
     * Gets the value of the nameOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Sets the value of the nameOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCard(String value) {
        this.nameOnCard = value;
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
     * Gets the value of the rechargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRechargeAmount() {
        return rechargeAmount;
    }

    /**
     * Sets the value of the rechargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRechargeAmount(Long value) {
        this.rechargeAmount = value;
    }

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
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getECIFlag() {
        return eciFlag;
    }

    /**
     * Sets the value of the eciFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setECIFlag(Integer value) {
        this.eciFlag = value;
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
        "voucherNumber"
    })
    public static class VoucherInfo {

        @XmlElement(name = "VoucherNumber", required = true)
        protected String voucherNumber;

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

    }

}
