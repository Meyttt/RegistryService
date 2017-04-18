
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
 *         &lt;element name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="haveNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "schemaVersion",
    "haveNumber"
})
@XmlRootElement(name = "GetLatestTSL")
public class GetLatestTSL {

    protected int schemaVersion;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer haveNumber;

    /**
     * Gets the value of the schemaVersion property.
     * 
     */
    public int getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     */
    public void setSchemaVersion(int value) {
        this.schemaVersion = value;
    }

    /**
     * Gets the value of the haveNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHaveNumber() {
        return haveNumber;
    }

    /**
     * Sets the value of the haveNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHaveNumber(Integer value) {
        this.haveNumber = value;
    }

}
