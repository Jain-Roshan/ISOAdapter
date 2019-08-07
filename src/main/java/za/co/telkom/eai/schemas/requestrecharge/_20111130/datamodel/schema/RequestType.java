
package za.co.telkom.eai.schemas.requestrecharge._20111130.datamodel.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Fixed" type="{http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd}FixedRechargeRequestType"/>
 *         &lt;element name="Mobile" type="{http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd}MobileRechargeRequestType"/>
 *         &lt;element name="WorldCallCard" type="{http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd}WorldCallCardRechargeRequestType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "fixed",
    "mobile",
    "worldCallCard"
})
public class RequestType {

    @XmlElement(name = "Fixed")
    protected FixedRechargeRequestType fixed;
    @XmlElement(name = "Mobile")
    protected MobileRechargeRequestType mobile;
    @XmlElement(name = "WorldCallCard")
    protected WorldCallCardRechargeRequestType worldCallCard;

    /**
     * Gets the value of the fixed property.
     * 
     * @return
     *     possible object is
     *     {@link FixedRechargeRequestType }
     *     
     */
    public FixedRechargeRequestType getFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedRechargeRequestType }
     *     
     */
    public void setFixed(FixedRechargeRequestType value) {
        this.fixed = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link MobileRechargeRequestType }
     *     
     */
    public MobileRechargeRequestType getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileRechargeRequestType }
     *     
     */
    public void setMobile(MobileRechargeRequestType value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the worldCallCard property.
     * 
     * @return
     *     possible object is
     *     {@link WorldCallCardRechargeRequestType }
     *     
     */
    public WorldCallCardRechargeRequestType getWorldCallCard() {
        return worldCallCard;
    }

    /**
     * Sets the value of the worldCallCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorldCallCardRechargeRequestType }
     *     
     */
    public void setWorldCallCard(WorldCallCardRechargeRequestType value) {
        this.worldCallCard = value;
    }

}
