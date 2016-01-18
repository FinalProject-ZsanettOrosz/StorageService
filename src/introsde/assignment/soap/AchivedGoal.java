
package introsde.assignment.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for achivedGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="achivedGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAchivement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="achivedGoal" type="{http://soap.assignment.introsde/}goal" minOccurs="0"/>
 *         &lt;element name="achivementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "achivedGoal", propOrder = {
    "idAchivement",
    "achivedGoal",
    "achivementDate"
})
public class AchivedGoal {

    protected int idAchivement;
    protected Goal achivedGoal;
    protected String achivementDate;

    /**
     * Gets the value of the idAchivement property.
     * 
     */
    public int getIdAchivement() {
        return idAchivement;
    }

    /**
     * Sets the value of the idAchivement property.
     * 
     */
    public void setIdAchivement(int value) {
        this.idAchivement = value;
    }

    /**
     * Gets the value of the achivedGoal property.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getAchivedGoal() {
        return achivedGoal;
    }

    /**
     * Sets the value of the achivedGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setAchivedGoal(Goal value) {
        this.achivedGoal = value;
    }

    /**
     * Gets the value of the achivementDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAchivementDate() {
        return achivementDate;
    }

    /**
     * Sets the value of the achivementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAchivementDate(String value) {
        this.achivementDate = value;
    }

}
