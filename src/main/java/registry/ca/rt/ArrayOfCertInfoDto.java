
package registry.ca.rt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCertInfoDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCertInfoDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CertInfoDto" type="{http://rt.ca.registry/}CertInfoDto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCertInfoDto", propOrder = {
    "certInfoDto"
})
public class ArrayOfCertInfoDto {

    @XmlElement(name = "CertInfoDto", nillable = true)
    protected List<CertInfoDto> certInfoDto;

    /**
     * Gets the value of the certInfoDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certInfoDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertInfoDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertInfoDto }
     * 
     * 
     */
    public List<CertInfoDto> getCertInfoDto() {
        if (certInfoDto == null) {
            certInfoDto = new ArrayList<CertInfoDto>();
        }
        return this.certInfoDto;
    }

}
