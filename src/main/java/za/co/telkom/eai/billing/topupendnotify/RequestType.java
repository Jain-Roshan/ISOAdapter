
package za.co.telkom.eai.billing.topupendnotify;

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
 *         &lt;element name="TRN" type="{http://eai.telkom.co.za/Billing_Types}TopUpReferenceNumber_Type"/&gt;
 *         &lt;element name="FinalisationStatus" type="{http://eai.telkom.co.za/Billing_Types}FinalisationStatus_Type"/&gt;
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
    "trn",
    "finalisationStatus"
})
public class RequestType {

    @XmlElement(name = "TransactionType", required = true)
    protected String transactionType;
    @XmlElement(name = "TRN", required = true)
    protected String trn;
    @XmlElement(name = "FinalisationStatus", required = true)
    protected String finalisationStatus;

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
     * Gets the value of the trn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRN() {
        return trn;
    }

    /**
     * Sets the value of the trn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRN(String value) {
        this.trn = value;
    }

    /**
     * Gets the value of the finalisationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalisationStatus() {
        return finalisationStatus;
    }

    /**
     * Sets the value of the finalisationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalisationStatus(String value) {
        this.finalisationStatus = value;
    }

}
