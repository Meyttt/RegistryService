
package registry.ca.rt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCAWebDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCAWebDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAWebDto" type="{http://rt.ca.registry/}CAWebDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCAWebDto", propOrder = {
    "caWebDto"
})
public class ArrayOfCAWebDto {

    @XmlElement(name = "CAWebDto", nillable = true)
    protected List<CAWebDto> caWebDto;

    /**
     * Gets the value of the caWebDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caWebDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCAWebDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAWebDto }
     * 
     * 
     */
    public List<CAWebDto> getCAWebDto() {
        if (caWebDto == null) {
            caWebDto = new ArrayList<CAWebDto>();
        }
        return this.caWebDto;
    }

}
