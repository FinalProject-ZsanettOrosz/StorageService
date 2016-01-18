
package introsde.assignment.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readAchivedGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readAchivedGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAchivement" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readAchivedGoal", propOrder = {
    "idAchivement"
})
public class ReadAchivedGoal {

    protected int idAchivement;

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

}
