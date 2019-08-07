
package za.co.telkom.eai.billing.cardholder3dsenrolmentstatusquery;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CardNumber" type="{http://eai.telkom.co.za/Billing_Types}CreditCardNumber_Type"/&gt;
 *         &lt;element name="CardExpiry"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Month"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="01"/&gt;
 *                         &lt;maxInclusive value="12"/&gt;
 *                         &lt;totalDigits value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://eai.telkom.co.za/Billing_Types}TransactionType_Type"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrderNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amount" type="{http://eai.telkom.co.za/Billing_Types}AmountCentsValue_Type"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://eai.telkom.co.za/Billing_Types}CurrencyCodeType"/&gt;
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
    "cardNumber",
    "cardExpiry",
    "transactionType",
    "orderNumber",
    "amount",
    "currencyCode"
})
public class RequestType {

    @XmlElement(name = "MerchantId", required = true)
    protected String merchantId;
    @XmlElement(name = "MerchantPassword", required = true)
    protected String merchantPassword;
    @XmlElement(name = "MerchantProcessorId", required = true)
    protected String merchantProcessorId;
    @XmlElement(name = "CardNumber", required = true)
    protected String cardNumber;
    @XmlElement(name = "CardExpiry", required = true)
    protected RequestType.CardExpiry cardExpiry;
    @XmlElement(name = "TransactionType", required = true)
    protected String transactionType;
    @XmlElement(name = "OrderNumber", required = true)
    protected String orderNumber;
    @XmlElement(name = "Amount")
    protected long amount;
    @XmlElement(name = "CurrencyCode")
    protected int currencyCode;

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
     * Gets the value of the cardExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType.CardExpiry }
     *     
     */
    public RequestType.CardExpiry getCardExpiry() {
        return cardExpiry;
    }

    /**
     * Sets the value of the cardExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType.CardExpiry }
     *     
     */
    public void setCardExpiry(RequestType.CardExpiry value) {
        this.cardExpiry = value;
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
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     */
    public int getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     */
    public void setCurrencyCode(int value) {
        this.currencyCode = value;
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
     *         &lt;element name="Month"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="01"/&gt;
     *               &lt;maxInclusive value="12"/&gt;
     *               &lt;totalDigits value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
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
        "month",
        "year"
    })
    public static class CardExpiry {

        @XmlElement(name = "Month")
        protected int month;
        @XmlElement(name = "Year", required = true)
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar year;

        /**
         * Gets the value of the month property.
         * 
         */
        public int getMonth() {
            return month;
        }

        /**
         * Sets the value of the month property.
         * 
         */
        public void setMonth(int value) {
            this.month = value;
        }

        /**
         * Gets the value of the year property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setYear(XMLGregorianCalendar value) {
            this.year = value;
        }

    }

}
