
package za.co.telkom.eai.schemas.requestrecharge._20111130.datamodel.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;


/**
 * <p>Java class for FixedRechargeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixedRechargeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RechargeReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientRechargeReferenceNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DesignationNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubAccountNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountBalanceInCents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RequestedAmountInCents" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedRechargeResponseType", propOrder = {
    "rechargeReferenceNumber",
    "clientRechargeReferenceNumber",
    "designationNumber",
    "subAccountNumber",
    "accountBalanceInCents",
    "requestedAmountInCents",
    "any"
})
public class FixedRechargeResponseType {

    @XmlElement(name = "RechargeReferenceNumber")
    protected String rechargeReferenceNumber;
    @XmlElement(name = "ClientRechargeReferenceNumber", required = true)
    protected String clientRechargeReferenceNumber;
    @XmlElement(name = "DesignationNumber", required = true)
    protected String designationNumber;
    @XmlElement(name = "SubAccountNumber")
    protected Integer subAccountNumber;
    @XmlElement(name = "AccountBalanceInCents")
    protected Integer accountBalanceInCents;
    @XmlElement(name = "RequestedAmountInCents")
    protected int requestedAmountInCents;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

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
     * Gets the value of the accountBalanceInCents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountBalanceInCents() {
        return accountBalanceInCents;
    }

    /**
     * Sets the value of the accountBalanceInCents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountBalanceInCents(Integer value) {
        this.accountBalanceInCents = value;
    }

    /**
     * Gets the value of the requestedAmountInCents property.
     * 
     */
    public int getRequestedAmountInCents() {
        return requestedAmountInCents;
    }

    /**
     * Sets the value of the requestedAmountInCents property.
     * 
     */
    public void setRequestedAmountInCents(int value) {
        this.requestedAmountInCents = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
