
package org.w3._2006._02.addressing.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnonymousType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnonymousType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="optional"/&gt;
 *     &lt;enumeration value="required"/&gt;
 *     &lt;enumeration value="prohibited"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AnonymousType")
@XmlEnum
public enum AnonymousType {

    @XmlEnumValue("optional")
    OPTIONAL("optional"),
    @XmlEnumValue("required")
    REQUIRED("required"),
    @XmlEnumValue("prohibited")
    PROHIBITED("prohibited");
    private final String value;

    AnonymousType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnonymousType fromValue(String v) {
        for (AnonymousType c: AnonymousType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
