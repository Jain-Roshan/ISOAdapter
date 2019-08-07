
package za.co.telkom.eai.schemas.requestrecharge._20111130.datamodel.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FixedRechargeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedRechargeRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RechargeReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;sequence>
 *           &lt;element name="ClientRechargeReferenceNumber">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="35"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="TerminalID" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="10"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="MerchantID">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="50"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="DesignationNumber">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="1"/>
 *                 &lt;maxLength value="10"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="SubAccountNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *           &lt;element name="RequestedAmountInCents" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;/sequence>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedRechargeRequestType", propOrder = {
    "rechargeReferenceNumber",
    "clientRechargeReferenceNumber",
    "terminalID",
    "merchantID",
    "designationNumber",
    "subAccountNumber",
    "requestedAmountInCents"
})
public class FixedRechargeRequestType {

    @XmlElement(name = "RechargeReferenceNumber")
    protected String rechargeReferenceNumber;
    @XmlElement(name = "ClientRechargeReferenceNumber")
    protected String clientRechargeReferenceNumber;
    @XmlElement(name = "TerminalID")
    protected String terminalID;
    @XmlElement(name = "MerchantID")
    protected String merchantID;
    @XmlElement(name = "DesignationNumber")
    protected String designationNumber;
    @XmlElement(name = "SubAccountNumber")
    protected Integer subAccountNumber;
    @XmlElement(name = "RequestedAmountInCents")
    protected Integer requestedAmountInCents;

    /**
     * Gets the value of the rechargeReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeReferenceNumber() {
        return rechargeReferenceNumber;
    }

    /**
     * Sets the value of the rechargeReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeReferenceNumber(String value) {
        this.rechargeReferenceNumber = value;
    }

    /**
     * Gets the value of the clientRechargeReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRechargeReferenceNumber() {
        return clientRechargeReferenceNumber;
    }

    /**
     * Sets the value of the clientRechargeReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRechargeReferenceNumber(String value) {
        this.clientRechargeReferenceNumber = value;
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
     * Gets the value of the designationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignationNumber() {
        return designationNumber;
    }

    /**
     * Sets the value of the designationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignationNumber(String value) {
        this.designationNumber = value;
    }

    /**
     * Gets the value of the subAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubAccountNumber() {
        return subAccountNumber;
    }

    /**
     * Sets the value of the subAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubAccountNumber(Integer value) {
        this.subAccountNumber = value;
    }

    /**
     * Gets the value of the requestedAmountInCents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestedAmountInCents() {
        return requestedAmountInCents;
    }

    /**
     * Sets the value of the requestedAmountInCents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestedAmountInCents(Integer value) {
        this.requestedAmountInCents = value;
    }

}
