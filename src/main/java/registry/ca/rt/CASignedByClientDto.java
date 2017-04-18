
package registry.ca.rt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CASignedByClientDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CASignedByClientDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignId" type="{http://microsoft.com/wsdl/types/}guid"/>
 *         &lt;element name="Hash" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Signature" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CASignedByClientDto", propOrder = {
    "signId",
    "hash",
    "signature"
})
public class CASignedByClientDto {

    @XmlElement(name = "SignId", required = true)
    protected String signId;
    @XmlElement(name = "Hash")
    protected byte[] hash;
    @XmlElement(name = "Signature")
    protected byte[] signature;

    /**
     * Gets the value of the signId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignId() {
        return signId;
    }

    /**
     * Sets the value of the signId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignId(String value) {
        this.signId = value;
    }

    /**
     * Gets the value of the hash property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHash() {
        return hash;
    }

    /**
     * Sets the value of the hash property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHash(byte[] value) {
        this.hash = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSignature(byte[] value) {
        this.signature = value;
    }

}
