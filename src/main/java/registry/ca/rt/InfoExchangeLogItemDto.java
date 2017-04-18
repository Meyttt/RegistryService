
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InfoExchangeLogItemDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfoExchangeLogItemDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateOfExchange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CAGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CerCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataReceivingStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DataReceivingStatusReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonOfExchange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StatusOfExchange" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StatusOfExchangeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="CaOgrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoExchangeLogItemDto", propOrder = {
    "dateOfExchange",
    "caGuid",
    "cerCount",
    "dataReceivingStatus",
    "dataReceivingStatusReason",
    "guid",
    "reasonOfExchange",
    "statusOfExchange",
    "statusOfExchangeReason",
    "version",
    "caOgrn"
})
public class InfoExchangeLogItemDto {

    @XmlElement(name = "DateOfExchange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfExchange;
    @XmlElement(name = "CAGuid")
    protected String caGuid;
    @XmlElement(name = "CerCount")
    protected int cerCount;
    @XmlElement(name = "DataReceivingStatus")
    protected int dataReceivingStatus;
    @XmlElement(name = "DataReceivingStatusReason")
    protected String dataReceivingStatusReason;
    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "ReasonOfExchange")
    protected int reasonOfExchange;
    @XmlElement(name = "StatusOfExchange")
    protected int statusOfExchange;
    @XmlElement(name = "StatusOfExchangeReason")
    protected String statusOfExchangeReason;
    @XmlElement(name = "Version")
    protected byte[] version;
    @XmlElement(name = "CaOgrn")
    protected String caOgrn;

    /**
     * Gets the value of the dateOfExchange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfExchange() {
        return dateOfExchange;
    }

    /**
     * Sets the value of the dateOfExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfExchange(XMLGregorianCalendar value) {
        this.dateOfExchange = value;
    }

    /**
     * Gets the value of the caGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAGuid() {
        return caGuid;
    }

    /**
     * Sets the value of the caGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAGuid(String value) {
        this.caGuid = value;
    }

    /**
     * Gets the value of the cerCount property.
     * 
     */
    public int getCerCount() {
        return cerCount;
    }

    /**
     * Sets the value of the cerCount property.
     * 
     */
    public void setCerCount(int value) {
        this.cerCount = value;
    }

    /**
     * Gets the value of the dataReceivingStatus property.
     * 
     */
    public int getDataReceivingStatus() {
        return dataReceivingStatus;
    }

    /**
     * Sets the value of the dataReceivingStatus property.
     * 
     */
    public void setDataReceivingStatus(int value) {
        this.dataReceivingStatus = value;
    }

    /**
     * Gets the value of the dataReceivingStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataReceivingStatusReason() {
        return dataReceivingStatusReason;
    }

    /**
     * Sets the value of the dataReceivingStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataReceivingStatusReason(String value) {
        this.dataReceivingStatusReason = value;
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
     * Gets the value of the reasonOfExchange property.
     * 
     */
    public int getReasonOfExchange() {
        return reasonOfExchange;
    }

    /**
     * Sets the value of the reasonOfExchange property.
     * 
     */
    public void setReasonOfExchange(int value) {
        this.reasonOfExchange = value;
    }

    /**
     * Gets the value of the statusOfExchange property.
     * 
     */
    public int getStatusOfExchange() {
        return statusOfExchange;
    }

    /**
     * Sets the value of the statusOfExchange property.
     * 
     */
    public void setStatusOfExchange(int value) {
        this.statusOfExchange = value;
    }

    /**
     * Gets the value of the statusOfExchangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusOfExchangeReason() {
        return statusOfExchangeReason;
    }

    /**
     * Sets the value of the statusOfExchangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusOfExchangeReason(String value) {
        this.statusOfExchangeReason = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setVersion(byte[] value) {
        this.version = value;
    }

    /**
     * Gets the value of the caOgrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaOgrn() {
        return caOgrn;
    }

    /**
     * Sets the value of the caOgrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaOgrn(String value) {
        this.caOgrn = value;
    }

}
