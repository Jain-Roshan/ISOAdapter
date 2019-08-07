
package za.co.telkom.eai.billing.topupenquirymanage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import za.co.telkom.eai.billing_types.AccountDetailsType;
import za.co.telkom.eai.billing_types.ResultType;


/**
 * container type for teh response payload
 * 
 * <p>Java class for Response_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Result" type="{http://eai.telkom.co.za/Billing_Types}Result_type"/&gt;
 *         &lt;element name="Payload" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TransactionType" type="{http://eai.telkom.co.za/Billing_Types}TransactionType_Type"/&gt;
 *                   &lt;element name="TopUpReferenceNumber" type="{http://eai.telkom.co.za/Billing_Types}TopUpReferenceNumber_Type"/&gt;
 *                   &lt;element name="RechargeAmount" type="{http://eai.telkom.co.za/Billing_Types}TopUpAmount_Type"/&gt;
 *                   &lt;element name="DiscountAmount" type="{http://eai.telkom.co.za/Billing_Types}TopUpAmount_Type"/&gt;
 *                   &lt;element name="SessionID" type="{http://eai.telkom.co.za/Billing_Types}SessionID_Type" minOccurs="0"/&gt;
 *                   &lt;element name="CardNumber" type="{http://eai.telkom.co.za/Billing_Types}CardNumber_Type" minOccurs="0"/&gt;
 *                   &lt;element name="MainAccount" type="{http://eai.telkom.co.za/Billing_Types}AccountDetails_Type"/&gt;
 *                   &lt;element name="SubAccount" type="{http://eai.telkom.co.za/Billing_Types}AccountDetails_Type" maxOccurs="5" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "Response_type", propOrder = {
    "result",
    "payload"
})
public class ResponseType {

    @XmlElement(name = "Result", required = true)
    protected ResultType result;
    @XmlElement(name = "Payload")
    protected ResponseType.Payload payload;

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
     *     {@link ResponseType.Payload }
     *     
     */
    public ResponseType.Payload getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType.Payload }
     *     
     */
    public void setPayload(ResponseType.Payload value) {
        this.payload = value;
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
     *         &lt;element name="TransactionType" type="{http://eai.telkom.co.za/Billing_Types}TransactionType_Type"/&gt;
     *         &lt;element name="TopUpReferenceNumber" type="{http://eai.telkom.co.za/Billing_Types}TopUpReferenceNumber_Type"/&gt;
     *         &lt;element name="RechargeAmount" type="{http://eai.telkom.co.za/Billing_Types}TopUpAmount_Type"/&gt;
     *         &lt;element name="DiscountAmount" type="{http://eai.telkom.co.za/Billing_Types}TopUpAmount_Type"/&gt;
     *         &lt;element name="SessionID" type="{http://eai.telkom.co.za/Billing_Types}SessionID_Type" minOccurs="0"/&gt;
     *         &lt;element name="CardNumber" type="{http://eai.telkom.co.za/Billing_Types}CardNumber_Type" minOccurs="0"/&gt;
     *         &lt;element name="MainAccount" type="{http://eai.telkom.co.za/Billing_Types}AccountDetails_Type"/&gt;
     *         &lt;element name="SubAccount" type="{http://eai.telkom.co.za/Billing_Types}AccountDetails_Type" maxOccurs="5" minOccurs="0"/&gt;
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
        "transactionType",
        "topUpReferenceNumber",
        "rechargeAmount",
        "discountAmount",
        "sessionID",
        "cardNumber",
        "mainAccount",
        "subAccount"
    })
    public static class Payload {

        @XmlElement(name = "TransactionType", required = true)
        protected String transactionType;
        @XmlElement(name = "TopUpReferenceNumber", required = true)
        protected String topUpReferenceNumber;
        @XmlElement(name = "RechargeAmount", required = true)
        protected String rechargeAmount;
        @XmlElement(name = "DiscountAmount", required = true)
        protected String discountAmount;
        @XmlElement(name = "SessionID")
        protected String sessionID;
        @XmlElement(name = "CardNumber")
        protected String cardNumber;
        @XmlElement(name = "MainAccount", required = true)
        protected AccountDetailsType mainAccount;
        @XmlElement(name = "SubAccount")
        protected List<AccountDetailsType> subAccount;

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
         * Gets the value of the rechargeAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRechargeAmount() {
            return rechargeAmount;
        }

        /**
         * Sets the value of the rechargeAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRechargeAmount(String value) {
            this.rechargeAmount = value;
        }

        /**
         * Gets the value of the discountAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscountAmount() {
            return discountAmount;
        }

        /**
         * Sets the value of the discountAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscountAmount(String value) {
            this.discountAmount = value;
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
         * Gets the value of the cardNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCardNumber() {
            return cardNumber;
        }

        /**
         * Sets the value of the cardNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCardNumber(String value) {
            this.cardNumber = value;
        }

        /**
         * Gets the value of the mainAccount property.
         * 
         * @return
         *     possible object is
         *     {@link AccountDetailsType }
         *     
         */
        public AccountDetailsType getMainAccount() {
            return mainAccount;
        }

        /**
         * Sets the value of the mainAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link AccountDetailsType }
         *     
         */
        public void setMainAccount(AccountDetailsType value) {
            this.mainAccount = value;
        }

        /**
         * Gets the value of the subAccount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subAccount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubAccount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccountDetailsType }
         * 
         * 
         */
        public List<AccountDetailsType> getSubAccount() {
            if (subAccount == null) {
                subAccount = new ArrayList<AccountDetailsType>();
            }
            return this.subAccount;
        }

    }

}
