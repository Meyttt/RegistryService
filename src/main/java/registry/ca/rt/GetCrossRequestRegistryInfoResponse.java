
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
 *         &lt;element name="GetCrossRequestRegistryInfoResult" type="{http://rt.ca.registry/}CrossRequestRegistryInfo" minOccurs="0"/>
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
    "getCrossRequestRegistryInfoResult"
})
@XmlRootElement(name = "GetCrossRequestRegistryInfoResponse")
public class GetCrossRequestRegistryInfoResponse {

    @XmlElement(name = "GetCrossRequestRegistryInfoResult")
    protected CrossRequestRegistryInfo getCrossRequestRegistryInfoResult;

    /**
     * Gets the value of the getCrossRequestRegistryInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRequestRegistryInfo }
     *     
     */
    public CrossRequestRegistryInfo getGetCrossRequestRegistryInfoResult() {
        return getCrossRequestRegistryInfoResult;
    }

    /**
     * Sets the value of the getCrossRequestRegistryInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRequestRegistryInfo }
     *     
     */
    public void setGetCrossRequestRegistryInfoResult(CrossRequestRegistryInfo value) {
        this.getCrossRequestRegistryInfoResult = value;
    }

}
