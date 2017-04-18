
package registry.ca.rt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUFOCertInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUFOCertInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UFOCertInfo" type="{http://rt.ca.registry/}UFOCertInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUFOCertInfo", propOrder = {
    "ufoCertInfo"
})
public class ArrayOfUFOCertInfo {

    @XmlElement(name = "UFOCertInfo", nillable = true)
    protected List<UFOCertInfo> ufoCertInfo;

    /**
     * Gets the value of the ufoCertInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ufoCertInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUFOCertInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UFOCertInfo }
     * 
     * 
     */
    public List<UFOCertInfo> getUFOCertInfo() {
        if (ufoCertInfo == null) {
            ufoCertInfo = new ArrayList<UFOCertInfo>();
        }
        return this.ufoCertInfo;
    }

}
