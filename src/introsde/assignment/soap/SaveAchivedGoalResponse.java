
package introsde.assignment.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveAchivedGoalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveAchivedGoalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="achivedGoal" type="{http://soap.assignment.introsde/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveAchivedGoalResponse", propOrder = {
    "achivedGoal"
})
public class SaveAchivedGoalResponse {

    protected Person achivedGoal;

    /**
     * Gets the value of the achivedGoal property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getAchivedGoal() {
        return achivedGoal;
    }

    /**
     * Sets the value of the achivedGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setAchivedGoal(Person value) {
        this.achivedGoal = value;
    }

}
