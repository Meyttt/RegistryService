
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CAWebDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAWebDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Guid" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="WarnEmail1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarnEmail2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarnEmail3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarnPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarnPhone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarnPhone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certs" type="{http://rt.ca.registry/}ArrayOfCACertWebDto" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanAddCertToCAIfNoCrosses" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAWebDto", propOrder = {
    "name",
    "shortName",
    "guid",
    "warnEmail1",
    "warnEmail2",
    "warnEmail3",
    "warnPhone1",
    "warnPhone2",
    "warnPhone3",
    "certs",
    "inn",
    "ogrn",
    "canAddCertToCAIfNoCrosses"
})
public class CAWebDto {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ShortName")
    protected String shortName;
    @XmlElement(name = "Guid", required = true)
    protected String guid;
    @XmlElement(name = "WarnEmail1")
    protected String warnEmail1;
    @XmlElement(name = "WarnEmail2")
    protected String warnEmail2;
    @XmlElement(name = "WarnEmail3")
    protected String warnEmail3;
    @XmlElement(name = "WarnPhone1")
    protected String warnPhone1;
    @XmlElement(name = "WarnPhone2")
    protected String warnPhone2;
    @XmlElement(name = "WarnPhone3")
    protected String warnPhone3;
    @XmlElement(name = "Certs")
    protected ArrayOfCACertWebDto certs;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "OGRN")
    protected String ogrn;
    @XmlElement(name = "CanAddCertToCAIfNoCrosses")
    protected boolean canAddCertToCAIfNoCrosses;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the warnEmail1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnEmail1() {
        return warnEmail1;
    }

    /**
     * Sets the value of the warnEmail1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnEmail1(String value) {
        this.warnEmail1 = value;
    }

    /**
     * Gets the value of the warnEmail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnEmail2() {
        return warnEmail2;
    }

    /**
     * Sets the value of the warnEmail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnEmail2(String value) {
        this.warnEmail2 = value;
    }

    /**
     * Gets the value of the warnEmail3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnEmail3() {
        return warnEmail3;
    }

    /**
     * Sets the value of the warnEmail3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnEmail3(String value) {
        this.warnEmail3 = value;
    }

    /**
     * Gets the value of the warnPhone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnPhone1() {
        return warnPhone1;
    }

    /**
     * Sets the value of the warnPhone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnPhone1(String value) {
        this.warnPhone1 = value;
    }

    /**
     * Gets the value of the warnPhone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnPhone2() {
        return warnPhone2;
    }

    /**
     * Sets the value of the warnPhone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnPhone2(String value) {
        this.warnPhone2 = value;
    }

    /**
     * Gets the value of the warnPhone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarnPhone3() {
        return warnPhone3;
    }

    /**
     * Sets the value of the warnPhone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarnPhone3(String value) {
        this.warnPhone3 = value;
    }

    /**
     * Gets the value of the certs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCACertWebDto }
     *     
     */
    public ArrayOfCACertWebDto getCerts() {
        return certs;
    }

    /**
     * Sets the value of the certs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCACertWebDto }
     *     
     */
    public void setCerts(ArrayOfCACertWebDto value) {
        this.certs = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the canAddCertToCAIfNoCrosses property.
     * 
     */
    public boolean isCanAddCertToCAIfNoCrosses() {
        return canAddCertToCAIfNoCrosses;
    }

    /**
     * Sets the value of the canAddCertToCAIfNoCrosses property.
     * 
     */
    public void setCanAddCertToCAIfNoCrosses(boolean value) {
        this.canAddCertToCAIfNoCrosses = value;
    }

}
