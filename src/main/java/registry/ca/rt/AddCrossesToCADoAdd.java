
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caGuid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="crossesInBase64" type="{http://rt.ca.registry/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="signData" type="{http://rt.ca.registry/}CASignedByClientDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caGuid",
    "crossesInBase64",
    "signData"
})
@XmlRootElement(name = "AddCrossesToCADoAdd")
public class AddCrossesToCADoAdd {

    @XmlElement(required = true)
    protected String caGuid;
    protected ArrayOfString crossesInBase64;
    protected CASignedByClientDto signData;

    /**
     * Gets the value of the caGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaGuid() {
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
    public void setCaGuid(String value) {
        this.caGuid = value;
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
     * Gets the value of the signData property.
     * 
     * @return
     *     possible object is
     *     {@link CASignedByClientDto }
     *     
     */
    public CASignedByClientDto getSignData() {
        return signData;
    }

    /**
     * Sets the value of the signData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASignedByClientDto }
     *     
     */
    public void setSignData(CASignedByClientDto value) {
        this.signData = value;
    }

}
