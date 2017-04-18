
package registry.ca.rt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCACertWebDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCACertWebDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CACertWebDto" type="{http://rt.ca.registry/}CACertWebDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCACertWebDto", propOrder = {
    "caCertWebDto"
})
public class ArrayOfCACertWebDto {

    @XmlElement(name = "CACertWebDto", nillable = true)
    protected List<CACertWebDto> caCertWebDto;

    /**
     * Gets the value of the caCertWebDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caCertWebDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCACertWebDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CACertWebDto }
     * 
     * 
     */
    public List<CACertWebDto> getCACertWebDto() {
        if (caCertWebDto == null) {
            caCertWebDto = new ArrayList<CACertWebDto>();
        }
        return this.caCertWebDto;
    }

}
