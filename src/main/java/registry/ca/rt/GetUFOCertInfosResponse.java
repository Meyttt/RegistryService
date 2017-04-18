
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
 *         &lt;element name="GetUFOCertInfosResult" type="{http://rt.ca.registry/}ArrayOfUFOCertInfo" minOccurs="0"/>
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
    "getUFOCertInfosResult"
})
@XmlRootElement(name = "GetUFOCertInfosResponse")
public class GetUFOCertInfosResponse {

    @XmlElement(name = "GetUFOCertInfosResult")
    protected ArrayOfUFOCertInfo getUFOCertInfosResult;

    /**
     * Gets the value of the getUFOCertInfosResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUFOCertInfo }
     *     
     */
    public ArrayOfUFOCertInfo getGetUFOCertInfosResult() {
        return getUFOCertInfosResult;
    }

    /**
     * Sets the value of the getUFOCertInfosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUFOCertInfo }
     *     
     */
    public void setGetUFOCertInfosResult(ArrayOfUFOCertInfo value) {
        this.getUFOCertInfosResult = value;
    }

}
