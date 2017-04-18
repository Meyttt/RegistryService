
package registry.ca.rt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCertDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCertDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertDto" type="{http://rt.ca.registry/}CertDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCertDto", propOrder = {
    "certDto"
})
public class ArrayOfCertDto {

    @XmlElement(name = "CertDto", nillable = true)
    protected List<CertDto> certDto;

    /**
     * Gets the value of the certDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertDto }
     * 
     * 
     */
    public List<CertDto> getCertDto() {
        if (certDto == null) {
            certDto = new ArrayList<CertDto>();
        }
        return this.certDto;
    }

}
