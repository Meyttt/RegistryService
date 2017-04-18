
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="certs" type="{http://rt.ca.registry/}ArrayOfCertInfoDto" minOccurs="0"/>
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
    "certs"
})
@XmlRootElement(name = "UpdateUFOCerts")
public class UpdateUFOCerts {

    protected ArrayOfCertInfoDto certs;

    /**
     * Gets the value of the certs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCertInfoDto }
     *     
     */
    public ArrayOfCertInfoDto getCerts() {
        return certs;
    }

    /**
     * Sets the value of the certs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCertInfoDto }
     *     
     */
    public void setCerts(ArrayOfCertInfoDto value) {
        this.certs = value;
    }

}
