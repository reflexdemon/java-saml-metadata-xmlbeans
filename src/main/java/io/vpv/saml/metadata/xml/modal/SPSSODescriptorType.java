//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.08 at 06:01:59 AM EDT 
//


package io.vpv.saml.metadata.xml.modal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SPSSODescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SPSSODescriptorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:metadata}SSODescriptorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AssertionConsumerService" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AttributeConsumingService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AuthnRequestsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WantAssertionsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPSSODescriptorType", namespace = "urn:oasis:names:tc:SAML:2.0:metadata", propOrder = {
    "assertionConsumerService",
    "attributeConsumingService"
})
public class SPSSODescriptorType
    extends SSODescriptorType
{

    @XmlElement(name = "AssertionConsumerService", required = true)
    protected List<IndexedEndpointType> assertionConsumerService;
    @XmlElement(name = "AttributeConsumingService")
    protected List<AttributeConsumingServiceType> attributeConsumingService;
    @XmlAttribute(name = "AuthnRequestsSigned")
    protected Boolean authnRequestsSigned;
    @XmlAttribute(name = "WantAssertionsSigned")
    protected Boolean wantAssertionsSigned;

    /**
     * Gets the value of the assertionConsumerService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assertionConsumerService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssertionConsumerService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexedEndpointType }
     * 
     * 
     */
    public List<IndexedEndpointType> getAssertionConsumerService() {
        if (assertionConsumerService == null) {
            assertionConsumerService = new ArrayList<IndexedEndpointType>();
        }
        return this.assertionConsumerService;
    }

    /**
     * Gets the value of the attributeConsumingService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeConsumingService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeConsumingService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeConsumingServiceType }
     * 
     * 
     */
    public List<AttributeConsumingServiceType> getAttributeConsumingService() {
        if (attributeConsumingService == null) {
            attributeConsumingService = new ArrayList<AttributeConsumingServiceType>();
        }
        return this.attributeConsumingService;
    }

    /**
     * Gets the value of the authnRequestsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthnRequestsSigned() {
        return authnRequestsSigned;
    }

    /**
     * Sets the value of the authnRequestsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthnRequestsSigned(Boolean value) {
        this.authnRequestsSigned = value;
    }

    /**
     * Gets the value of the wantAssertionsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWantAssertionsSigned() {
        return wantAssertionsSigned;
    }

    /**
     * Sets the value of the wantAssertionsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWantAssertionsSigned(Boolean value) {
        this.wantAssertionsSigned = value;
    }

}
