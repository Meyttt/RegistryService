
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CertificateDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthorityCertSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizedRepresentativeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CATools" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndividualSubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="INN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEntityAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="NotBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Passed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PublicKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RawData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Restriction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignTools" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SNILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateDto", propOrder = {
    "authorityCertSerialNumber",
    "authorizedRepresentativeName",
    "caAddress",
    "caGuid",
    "caName",
    "caTools",
    "certStatus",
    "guid",
    "individualSubjectName",
    "inn",
    "legalEntityAddress",
    "legalEntityName",
    "notAfter",
    "notBefore",
    "ogrn",
    "passed",
    "publicKey",
    "rawData",
    "restriction",
    "serialNumber",
    "signTools",
    "snils",
    "version"
})
public class CertificateDto {

    @XmlElement(name = "AuthorityCertSerialNumber")
    protected String authorityCertSerialNumber;
    @XmlElement(name = "AuthorizedRepresentativeName")
    protected String authorizedRepresentativeName;
    @XmlElement(name = "CAAddress")
    protected String caAddress;
    @XmlElement(name = "CAGuid")
    protected String caGuid;
    @XmlElement(name = "CAName")
    protected String caName;
    @XmlElement(name = "CATools")
    protected String caTools;
    @XmlElement(name = "CertStatus")
    protected int certStatus;
    @XmlElement(name = "Guid")
    protected String guid;
    @XmlElement(name = "IndividualSubjectName")
    protected String individualSubjectName;
    @XmlElement(name = "INN")
    protected String inn;
    @XmlElement(name = "LegalEntityAddress")
    protected String legalEntityAddress;
    @XmlElement(name = "LegalEntityName")
    protected String legalEntityName;
    @XmlElement(name = "NotAfter", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notAfter;
    @XmlElement(name = "NotBefore", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notBefore;
    @XmlElement(name = "OGRN")
    protected String ogrn;
    @XmlElement(name = "Passed")
    protected boolean passed;
    @XmlElement(name = "PublicKey")
    protected String publicKey;
    @XmlElement(name = "RawData")
    protected byte[] rawData;
    @XmlElement(name = "Restriction")
    protected String restriction;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "SignTools")
    protected String signTools;
    @XmlElement(name = "SNILS")
    protected String snils;
    @XmlElement(name = "Version")
    protected byte[] version;

    /**
     * Gets the value of the authorityCertSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityCertSerialNumber() {
        return authorityCertSerialNumber;
    }

    /**
     * Sets the value of the authorityCertSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityCertSerialNumber(String value) {
        this.authorityCertSerialNumber = value;
    }

    /**
     * Gets the value of the authorizedRepresentativeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedRepresentativeName() {
        return authorizedRepresentativeName;
    }

    /**
     * Sets the value of the authorizedRepresentativeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedRepresentativeName(String value) {
        this.authorizedRepresentativeName = value;
    }

    /**
     * Gets the value of the caAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAAddress() {
        return caAddress;
    }

    /**
     * Sets the value of the caAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAAddress(String value) {
        this.caAddress = value;
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
     * Gets the value of the caName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAName() {
        return caName;
    }

    /**
     * Sets the value of the caName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAName(String value) {
        this.caName = value;
    }

    /**
     * Gets the value of the caTools property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATools() {
        return caTools;
    }

    /**
     * Sets the value of the caTools property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATools(String value) {
        this.caTools = value;
    }

    /**
     * Gets the value of the certStatus property.
     * 
     */
    public int getCertStatus() {
        return certStatus;
    }

    /**
     * Sets the value of the certStatus property.
     * 
     */
    public void setCertStatus(int value) {
        this.certStatus = value;
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
     * Gets the value of the individualSubjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualSubjectName() {
        return individualSubjectName;
    }

    /**
     * Sets the value of the individualSubjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualSubjectName(String value) {
        this.individualSubjectName = value;
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
     * Gets the value of the legalEntityAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntityAddress() {
        return legalEntityAddress;
    }

    /**
     * Sets the value of the legalEntityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityAddress(String value) {
        this.legalEntityAddress = value;
    }

    /**
     * Gets the value of the legalEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntityName() {
        return legalEntityName;
    }

    /**
     * Sets the value of the legalEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityName(String value) {
        this.legalEntityName = value;
    }

    /**
     * Gets the value of the notAfter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotAfter() {
        return notAfter;
    }

    /**
     * Sets the value of the notAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotAfter(XMLGregorianCalendar value) {
        this.notAfter = value;
    }

    /**
     * Gets the value of the notBefore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotBefore() {
        return notBefore;
    }

    /**
     * Sets the value of the notBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotBefore(XMLGregorianCalendar value) {
        this.notBefore = value;
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
     * Gets the value of the passed property.
     * 
     */
    public boolean isPassed() {
        return passed;
    }

    /**
     * Sets the value of the passed property.
     * 
     */
    public void setPassed(boolean value) {
        this.passed = value;
    }

    /**
     * Gets the value of the publicKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Sets the value of the publicKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicKey(String value) {
        this.publicKey = value;
    }

    /**
     * Gets the value of the rawData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRawData() {
        return rawData;
    }

    /**
     * Sets the value of the rawData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setRawData(byte[] value) {
        this.rawData = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriction(String value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the signTools property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignTools() {
        return signTools;
    }

    /**
     * Sets the value of the signTools property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignTools(String value) {
        this.signTools = value;
    }

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSNILS() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSNILS(String value) {
        this.snils = value;
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

}
