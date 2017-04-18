
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CADto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CADto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Guid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certs" type="{http://rt.ca.registry/}ArrayOfCertDto" minOccurs="0"/>
 *         &lt;element name="Statuses" type="{http://rt.ca.registry/}ArrayOfCAStatusDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CADto", propOrder = {
    "guid",
    "name",
    "certs",
    "statuses"
})
public class CADto {

    @XmlElement(name = "Guid", required = true)
    protected String guid;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Certs")
    protected ArrayOfCertDto certs;
    @XmlElement(name = "Statuses")
    protected ArrayOfCAStatusDto statuses;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the certs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCertDto }
     *     
     */
    public ArrayOfCertDto getCerts() {
        return certs;
    }

    /**
     * Sets the value of the certs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCertDto }
     *     
     */
    public void setCerts(ArrayOfCertDto value) {
        this.certs = value;
    }

    /**
     * Gets the value of the statuses property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCAStatusDto }
     *     
     */
    public ArrayOfCAStatusDto getStatuses() {
        return statuses;
    }

    /**
     * Sets the value of the statuses property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCAStatusDto }
     *     
     */
    public void setStatuses(ArrayOfCAStatusDto value) {
        this.statuses = value;
    }

}
