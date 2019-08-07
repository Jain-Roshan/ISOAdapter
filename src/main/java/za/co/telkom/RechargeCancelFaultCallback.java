
package za.co.telkom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import za.co.telkom.eai.billing.topupendnotify.TopUpEndNotify;


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
 *         &lt;element ref="{http://eai.telkom.co.za/Billing/TopUpEndNotify}TopUpEndNotify"/&gt;
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
    "topUpEndNotify"
})
@XmlRootElement(name = "rechargeCancelFaultCallback")
public class RechargeCancelFaultCallback {

    @XmlElement(name = "TopUpEndNotify", namespace = "http://eai.telkom.co.za/Billing/TopUpEndNotify", required = true)
    protected TopUpEndNotify topUpEndNotify;

    /**
     * Gets the value of the topUpEndNotify property.
     * 
     * @return
     *     possible object is
     *     {@link TopUpEndNotify }
     *     
     */
    public TopUpEndNotify getTopUpEndNotify() {
        return topUpEndNotify;
    }

    /**
     * Sets the value of the topUpEndNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopUpEndNotify }
     *     
     */
    public void setTopUpEndNotify(TopUpEndNotify value) {
        this.topUpEndNotify = value;
    }

}
