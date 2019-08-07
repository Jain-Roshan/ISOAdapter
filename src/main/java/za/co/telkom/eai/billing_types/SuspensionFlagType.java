
package za.co.telkom.eai.billing_types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuspensionFlagType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SuspensionFlagType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="1"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SuspensionFlagType")
@XmlEnum
public enum SuspensionFlagType {

    Y,
    N;

    public String value() {
        return name();
    }

    public static SuspensionFlagType fromValue(String v) {
        return valueOf(v);
    }

}
