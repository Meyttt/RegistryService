
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CACertWebDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CACertWebDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertInBase64" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrlUrls" type="{http://rt.ca.registry/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="CrossesInBase64" type="{http://rt.ca.registry/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CACertWebDto", propOrder = {
    "certInBase64",
    "crlUrls",
    "crossesInBase64"
})
public class CACertWebDto {

    @XmlElement(name = "CertInBase64")
    protected String certInBase64;
    @XmlElement(name = "CrlUrls")
    protected ArrayOfString crlUrls;
    @XmlElement(name = "CrossesInBase64")
    protected ArrayOfString crossesInBase64;

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
     * Gets the value of the crlUrls property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getCrlUrls() {
        return crlUrls;
    }

    /**
     * Sets the value of the crlUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setCrlUrls(ArrayOfString value) {
        this.crlUrls = value;
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

}
