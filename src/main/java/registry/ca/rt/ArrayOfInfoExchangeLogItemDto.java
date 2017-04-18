
package registry.ca.rt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfInfoExchangeLogItemDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfInfoExchangeLogItemDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InfoExchangeLogItemDto" type="{http://rt.ca.registry/}InfoExchangeLogItemDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInfoExchangeLogItemDto", propOrder = {
    "infoExchangeLogItemDto"
})
public class ArrayOfInfoExchangeLogItemDto {

    @XmlElement(name = "InfoExchangeLogItemDto", nillable = true)
    protected List<InfoExchangeLogItemDto> infoExchangeLogItemDto;

    /**
     * Gets the value of the infoExchangeLogItemDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoExchangeLogItemDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoExchangeLogItemDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfoExchangeLogItemDto }
     * 
     * 
     */
    public List<InfoExchangeLogItemDto> getInfoExchangeLogItemDto() {
        if (infoExchangeLogItemDto == null) {
            infoExchangeLogItemDto = new ArrayList<InfoExchangeLogItemDto>();
        }
        return this.infoExchangeLogItemDto;
    }

}
