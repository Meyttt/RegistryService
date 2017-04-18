
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CAStatusReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAStatusReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UtcDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CAs" type="{http://rt.ca.registry/}ArrayOfCADto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAStatusReport", propOrder = {
    "utcDate",
    "cAs"
})
public class CAStatusReport {

    @XmlElement(name = "UtcDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar utcDate;
    @XmlElement(name = "CAs")
    protected ArrayOfCADto cAs;

    /**
     * Gets the value of the utcDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUtcDate() {
        return utcDate;
    }

    /**
     * Sets the value of the utcDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUtcDate(XMLGregorianCalendar value) {
        this.utcDate = value;
    }

    /**
     * Gets the value of the cAs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCADto }
     *     
     */
    public ArrayOfCADto getCAs() {
        return cAs;
    }

    /**
     * Sets the value of the cAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCADto }
     *     
     */
    public void setCAs(ArrayOfCADto value) {
        this.cAs = value;
    }

}
