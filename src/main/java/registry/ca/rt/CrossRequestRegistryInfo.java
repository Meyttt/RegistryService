
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossRequestRegistryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossRequestRegistryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAGuid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="CertInBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrossesInBase64" type="{http://rt.ca.registry/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="MatchError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossRequestRegistryInfo", propOrder = {
    "caName",
    "caGuid",
    "certInBase64",
    "crossesInBase64",
    "matchError"
})
public class CrossRequestRegistryInfo {

    @XmlElement(name = "CAName")
    protected String caName;
    @XmlElement(name = "CAGuid", required = true)
    protected String caGuid;
    @XmlElement(name = "CertInBase64")
    protected String certInBase64;
    @XmlElement(name = "CrossesInBase64")
    protected ArrayOfString crossesInBase64;
    @XmlElement(name = "MatchError")
    protected String matchError;

    /**
     * Gets the value of the caName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAName() {
        return caName;
    }

    /**
     * Sets the value of the caName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAName(String value) {
        this.caName = value;
    }

    /**
     * Gets the value of the caGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAGuid() {
        return caGuid;
    }

    /**
     * Sets the value of the caGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAGuid(String value) {
        this.caGuid = value;
    }

    /**
     * Gets the value of the certInBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertInBase64() {
        return certInBase64;
    }

    /**
     * Sets the value of the certInBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertInBase64(String value) {
        this.certInBase64 = value;
    }

    /**
     * Gets the value of the crossesInBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCrossesInBase64() {
        return crossesInBase64;
    }

    /**
     * Sets the value of the crossesInBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCrossesInBase64(ArrayOfString value) {
        this.crossesInBase64 = value;
    }

    /**
     * Gets the value of the matchError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchError() {
        return matchError;
    }

    /**
     * Sets the value of the matchError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchError(String value) {
        this.matchError = value;
    }

}
