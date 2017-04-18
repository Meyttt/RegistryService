
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
 *         &lt;element name="GetCAListResult" type="{http://rt.ca.registry/}ArrayOfCAWebDto" minOccurs="0"/>
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
    "getCAListResult"
})
@XmlRootElement(name = "GetCAListResponse")
public class GetCAListResponse {

    @XmlElement(name = "GetCAListResult")
    protected ArrayOfCAWebDto getCAListResult;

    /**
     * Gets the value of the getCAListResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCAWebDto }
     *     
     */
    public ArrayOfCAWebDto getGetCAListResult() {
        return getCAListResult;
    }

    /**
     * Sets the value of the getCAListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCAWebDto }
     *     
     */
    public void setGetCAListResult(ArrayOfCAWebDto value) {
        this.getCAListResult = value;
    }

}
