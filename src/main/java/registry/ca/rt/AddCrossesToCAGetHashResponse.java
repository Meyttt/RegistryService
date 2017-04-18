
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
 *         &lt;element name="AddCrossesToCAGetHashResult" type="{http://rt.ca.registry/}CASignedByClientDto" minOccurs="0"/>
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
    "addCrossesToCAGetHashResult"
})
@XmlRootElement(name = "AddCrossesToCAGetHashResponse")
public class AddCrossesToCAGetHashResponse {

    @XmlElement(name = "AddCrossesToCAGetHashResult")
    protected CASignedByClientDto addCrossesToCAGetHashResult;

    /**
     * Gets the value of the addCrossesToCAGetHashResult property.
     * 
     * @return
     *     possible object is
     *     {@link CASignedByClientDto }
     *     
     */
    public CASignedByClientDto getAddCrossesToCAGetHashResult() {
        return addCrossesToCAGetHashResult;
    }

    /**
     * Sets the value of the addCrossesToCAGetHashResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASignedByClientDto }
     *     
     */
    public void setAddCrossesToCAGetHashResult(CASignedByClientDto value) {
        this.addCrossesToCAGetHashResult = value;
    }

}
