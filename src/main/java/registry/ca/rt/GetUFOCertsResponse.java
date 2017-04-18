
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetUFOCertsResult" type="{http://rt.ca.registry/}ArrayOfCertInfoDto" minOccurs="0"/>
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
    "getUFOCertsResult"
})
@XmlRootElement(name = "GetUFOCertsResponse")
public class GetUFOCertsResponse {

    @XmlElement(name = "GetUFOCertsResult")
    protected ArrayOfCertInfoDto getUFOCertsResult;

    /**
     * Gets the value of the getUFOCertsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCertInfoDto }
     *     
     */
    public ArrayOfCertInfoDto getGetUFOCertsResult() {
        return getUFOCertsResult;
    }

    /**
     * Sets the value of the getUFOCertsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCertInfoDto }
     *     
     */
    public void setGetUFOCertsResult(ArrayOfCertInfoDto value) {
        this.getUFOCertsResult = value;
    }

}
