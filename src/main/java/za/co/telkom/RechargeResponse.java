
package za.co.telkom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import za.co.telkom.eai.billing.topuprechargemanage.TopUpRechargeManage;


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
 *         &lt;element ref="{http://eai.telkom.co.za/Billing/TopUpRechargeManage}TopUpRechargeManage"/&gt;
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
    "topUpRechargeManage"
})
@XmlRootElement(name = "rechargeResponse")
public class RechargeResponse {

    @XmlElement(name = "TopUpRechargeManage", namespace = "http://eai.telkom.co.za/Billing/TopUpRechargeManage", required = true)
    protected TopUpRechargeManage topUpRechargeManage;

    /**
     * Gets the value of the topUpRechargeManage property.
     * 
     * @return
     *     possible object is
     *     {@link TopUpRechargeManage }
     *     
     */
    public TopUpRechargeManage getTopUpRechargeManage() {
        return topUpRechargeManage;
    }

    /**
     * Sets the value of the topUpRechargeManage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopUpRechargeManage }
     *     
     */
    public void setTopUpRechargeManage(TopUpRechargeManage value) {
        this.topUpRechargeManage = value;
    }

}
