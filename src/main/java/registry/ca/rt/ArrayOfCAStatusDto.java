
package registry.ca.rt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCAStatusDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCAStatusDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAStatusDto" type="{http://rt.ca.registry/}CAStatusDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCAStatusDto", propOrder = {
    "caStatusDto"
})
public class ArrayOfCAStatusDto {

    @XmlElement(name = "CAStatusDto", nillable = true)
    protected List<CAStatusDto> caStatusDto;

    /**
     * Gets the value of the caStatusDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the caStatusDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCAStatusDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAStatusDto }
     * 
     * 
     */
    public List<CAStatusDto> getCAStatusDto() {
        if (caStatusDto == null) {
            caStatusDto = new ArrayList<CAStatusDto>();
        }
        return this.caStatusDto;
    }

}
