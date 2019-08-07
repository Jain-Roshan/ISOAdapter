
package za.co.telkom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import za.co.telkom.eai.billing.cardholder3dsauthenticationresultverify.Cardholder3DSAuthenticationResultVerify;


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
 *         &lt;element ref="{http://eai.telkom.co.za/Billing/Cardholder3DSAuthenticationResultVerify}Cardholder3DSAuthenticationResultVerify"/&gt;
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
    "cardholder3DSAuthenticationResultVerify"
})
@XmlRootElement(name = "authenticate3DSResultFaultCallback")
public class Authenticate3DSResultFaultCallback {

    @XmlElement(name = "Cardholder3DSAuthenticationResultVerify", namespace = "http://eai.telkom.co.za/Billing/Cardholder3DSAuthenticationResultVerify", required = true)
    protected Cardholder3DSAuthenticationResultVerify cardholder3DSAuthenticationResultVerify;

    /**
     * Gets the value of the cardholder3DSAuthenticationResultVerify property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder3DSAuthenticationResultVerify }
     *     
     */
    public Cardholder3DSAuthenticationResultVerify getCardholder3DSAuthenticationResultVerify() {
        return cardholder3DSAuthenticationResultVerify;
    }

    /**
     * Sets the value of the cardholder3DSAuthenticationResultVerify property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder3DSAuthenticationResultVerify }
     *     
     */
    public void setCardholder3DSAuthenticationResultVerify(Cardholder3DSAuthenticationResultVerify value) {
        this.cardholder3DSAuthenticationResultVerify = value;
    }

}
