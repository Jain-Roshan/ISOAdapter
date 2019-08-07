
package za.co.telkom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import za.co.telkom.eai.billing.cardholder3dsenrolmentstatusquery.Cardholder3DSEnrolmentStatusQuery;


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
 *         &lt;element ref="{http://eai.telkom.co.za/Billing/Cardholder3DSEnrolmentStatusQuery}Cardholder3DSEnrolmentStatusQuery"/&gt;
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
    "cardholder3DSEnrolmentStatusQuery"
})
@XmlRootElement(name = "check3DSEnrolment")
public class Check3DSEnrolment {

    @XmlElement(name = "Cardholder3DSEnrolmentStatusQuery", namespace = "http://eai.telkom.co.za/Billing/Cardholder3DSEnrolmentStatusQuery", required = true)
    protected Cardholder3DSEnrolmentStatusQuery cardholder3DSEnrolmentStatusQuery;

    /**
     * Gets the value of the cardholder3DSEnrolmentStatusQuery property.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder3DSEnrolmentStatusQuery }
     *     
     */
    public Cardholder3DSEnrolmentStatusQuery getCardholder3DSEnrolmentStatusQuery() {
        return cardholder3DSEnrolmentStatusQuery;
    }

    /**
     * Sets the value of the cardholder3DSEnrolmentStatusQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder3DSEnrolmentStatusQuery }
     *     
     */
    public void setCardholder3DSEnrolmentStatusQuery(Cardholder3DSEnrolmentStatusQuery value) {
        this.cardholder3DSEnrolmentStatusQuery = value;
    }

}
