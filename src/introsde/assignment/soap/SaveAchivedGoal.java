
package introsde.assignment.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveAchivedGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveAchivedGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="achivedGoal" type="{http://soap.assignment.introsde/}achivedGoal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveAchivedGoal", propOrder = {
    "personId",
    "achivedGoal"
})
public class SaveAchivedGoal {

    protected int personId;
    protected AchivedGoal achivedGoal;

    /**
     * Gets the value of the personId property.
     * 
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     */
    public void setPersonId(int value) {
        this.personId = value;
    }

    /**
     * Gets the value of the achivedGoal property.
     * 
     * @return
     *     possible object is
     *     {@link AchivedGoal }
     *     
     */
    public AchivedGoal getAchivedGoal() {
        return achivedGoal;
    }

    /**
     * Sets the value of the achivedGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AchivedGoal }
     *     
     */
    public void setAchivedGoal(AchivedGoal value) {
        this.achivedGoal = value;
    }

}
