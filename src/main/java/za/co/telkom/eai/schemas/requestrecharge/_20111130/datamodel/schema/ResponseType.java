
package za.co.telkom.eai.schemas.requestrecharge._20111130.datamodel.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd}Result"/>
 *         &lt;element name="Payload" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Fixed" type="{http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd}FixedRechargeResponseType"/>
 *                   &lt;element name="Mobile" type="{http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd}MobileRechargeResponseType"/>
 *                   &lt;element name="WorldCallCard" type="{http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd}WorldCallCardRechargeResponseType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="Fixed" type="{http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd}FixedRechargeResponseType"/>
     *         &lt;element name="Mobile" type="{http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd}MobileRechargeResponseType"/>
     *         &lt;element name="WorldCallCard" type="{http://eai.telkom.co.za/schemas/RequestRecharge/20111130/DataModel/Schema.xsd}WorldCallCardRechargeResponseType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fixed",
        "mobile",
        "worldCallCard"
    })
    public static class Payload {

        @XmlElement(name = "Fixed")
        protected FixedRechargeResponseType fixed;
        @XmlElement(name = "Mobile")
        protected MobileRechargeResponseType mobile;
        @XmlElement(name = "WorldCallCard")
        protected WorldCallCardRechargeResponseType worldCallCard;

        /**
         * Gets the value of the fixed property.
         * 
         * @return
         *     possible object is
         *     {@link FixedRechargeResponseType }
         *     
         */
        public FixedRechargeResponseType getFixed() {
            return fixed;
        }

        /**
         * Sets the value of the fixed property.
         * 
         * @param value
         *     allowed object is
         *     {@link FixedRechargeResponseType }
         *     
         */
        public void setFixed(FixedRechargeResponseType value) {
            this.fixed = value;
        }

        /**
         * Gets the value of the mobile property.
         * 
         * @return
         *     possible object is
         *     {@link MobileRechargeResponseType }
         *     
         */
        public MobileRechargeResponseType getMobile() {
            return mobile;
        }

        /**
         * Sets the value of the mobile property.
         * 
         * @param value
         *     allowed object is
         *     {@link MobileRechargeResponseType }
         *     
         */
        public void setMobile(MobileRechargeResponseType value) {
            this.mobile = value;
        }

        /**
         * Gets the value of the worldCallCard property.
         * 
         * @return
         *     possible object is
         *     {@link WorldCallCardRechargeResponseType }
         *     
         */
        public WorldCallCardRechargeResponseType getWorldCallCard() {
            return worldCallCard;
        }

        /**
         * Sets the value of the worldCallCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link WorldCallCardRechargeResponseType }
         *     
         */
        public void setWorldCallCard(WorldCallCardRechargeResponseType value) {
            this.worldCallCard = value;
        }

    }

}
