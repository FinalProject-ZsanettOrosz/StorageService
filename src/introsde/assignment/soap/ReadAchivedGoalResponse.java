
package introsde.assignment.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readAchivedGoalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readAchivedGoalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "readAchivedGoalResponse", propOrder = {
    "achivedGoal"
})
public class ReadAchivedGoalResponse {

    protected AchivedGoal achivedGoal;

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
