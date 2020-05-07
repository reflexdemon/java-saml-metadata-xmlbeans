//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 

//


package io.vpv.saml.metadata.xml.modal;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="technical"/&gt;
 *     &lt;enumeration value="support"/&gt;
 *     &lt;enumeration value="administrative"/&gt;
 *     &lt;enumeration value="billing"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactTypeType", namespace = "urn:oasis:names:tc:SAML:2.0:metadata")
@XmlEnum
public enum ContactTypeType {

    @XmlEnumValue("technical")
    TECHNICAL("technical"),
    @XmlEnumValue("support")
    SUPPORT("support"),
    @XmlEnumValue("administrative")
    ADMINISTRATIVE("administrative"),
    @XmlEnumValue("billing")
    BILLING("billing"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ContactTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactTypeType fromValue(String v) {
        for (ContactTypeType c: ContactTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
