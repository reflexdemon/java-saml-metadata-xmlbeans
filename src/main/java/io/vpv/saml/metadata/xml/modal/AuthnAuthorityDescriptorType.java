//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.07 at 06:44:19 AM EDT 
//


package io.vpv.saml.metadata.xml.modal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthnAuthorityDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthnAuthorityDescriptorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:metadata}RoleDescriptorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AuthnQueryService" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}AssertionIDRequestService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:metadata}NameIDFormat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthnAuthorityDescriptorType", namespace = "urn:oasis:names:tc:SAML:2.0:metadata", propOrder = {
    "authnQueryService",
    "assertionIDRequestService",
    "nameIDFormat"
})
public class AuthnAuthorityDescriptorType
    extends RoleDescriptorType
{

    @XmlElement(name = "AuthnQueryService", required = true)
    protected List<EndpointType> authnQueryService;
    @XmlElement(name = "AssertionIDRequestService")
    protected List<EndpointType> assertionIDRequestService;
    @XmlElement(name = "NameIDFormat")
    @XmlSchemaType(name = "anyURI")
    protected List<String> nameIDFormat;

    /**
     * Gets the value of the authnQueryService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authnQueryService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthnQueryService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointType }
     * 
     * 
     */
    public List<EndpointType> getAuthnQueryService() {
        if (authnQueryService == null) {
            authnQueryService = new ArrayList<EndpointType>();
        }
        return this.authnQueryService;
    }

    /**
     * Gets the value of the assertionIDRequestService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assertionIDRequestService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssertionIDRequestService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndpointType }
     * 
     * 
     */
    public List<EndpointType> getAssertionIDRequestService() {
        if (assertionIDRequestService == null) {
            assertionIDRequestService = new ArrayList<EndpointType>();
        }
        return this.assertionIDRequestService;
    }

    /**
     * Gets the value of the nameIDFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameIDFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameIDFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameIDFormat() {
        if (nameIDFormat == null) {
            nameIDFormat = new ArrayList<String>();
        }
        return this.nameIDFormat;
    }

}
