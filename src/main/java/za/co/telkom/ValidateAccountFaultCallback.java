
package za.co.telkom;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import za.co.telkom.eai.billing.topupenquirymanage.TopUpEnquiryManage;


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
 *         &lt;element ref="{http://eai.telkom.co.za/Billing/TopUpEnquiryManage}TopUpEnquiryManage"/&gt;
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
    "topUpEnquiryManage"
})
@XmlRootElement(name = "validateAccountFaultCallback")
public class ValidateAccountFaultCallback {

    @XmlElement(name = "TopUpEnquiryManage", namespace = "http://eai.telkom.co.za/Billing/TopUpEnquiryManage", required = true)
    protected TopUpEnquiryManage topUpEnquiryManage;

    /**
     * Gets the value of the topUpEnquiryManage property.
     * 
     * @return
     *     possible object is
     *     {@link TopUpEnquiryManage }
     *     
     */
    public TopUpEnquiryManage getTopUpEnquiryManage() {
        return topUpEnquiryManage;
    }

    /**
     * Sets the value of the topUpEnquiryManage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopUpEnquiryManage }
     *     
     */
    public void setTopUpEnquiryManage(TopUpEnquiryManage value) {
        this.topUpEnquiryManage = value;
    }

}
