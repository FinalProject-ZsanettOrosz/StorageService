
package introsde.assignment.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.assignment.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpdatePersonMeasureResponse_QNAME = new QName("http://soap.assignment.introsde/", "updatePersonMeasureResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://soap.assignment.introsde/", "deletePersonResponse");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://soap.assignment.introsde/", "readPersonListResponse");
    private final static QName _ReadAchivedGoalList_QNAME = new QName("http://soap.assignment.introsde/", "readAchivedGoalList");
    private final static QName _ReadPersonList_QNAME = new QName("http://soap.assignment.introsde/", "readPersonList");
    private final static QName _ReadGoalResponse_QNAME = new QName("http://soap.assignment.introsde/", "readGoalResponse");
    private final static QName _SaveAchivedGoal_QNAME = new QName("http://soap.assignment.introsde/", "saveAchivedGoal");
    private final static QName _ReadGoalListResponse_QNAME = new QName("http://soap.assignment.introsde/", "readGoalListResponse");
    private final static QName _UpdatePersonHealthProfileResponse_QNAME = new QName("http://soap.assignment.introsde/", "updatePersonHealthProfileResponse");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://soap.assignment.introsde/", "readMeasureTypesResponse");
    private final static QName _ReadPersonHisotry_QNAME = new QName("http://soap.assignment.introsde/", "readPersonHisotry");
    private final static QName _ReadGoalList_QNAME = new QName("http://soap.assignment.introsde/", "readGoalList");
    private final static QName _ReadPersonHisotryResponse_QNAME = new QName("http://soap.assignment.introsde/", "readPersonHisotryResponse");
    private final static QName _ReadGoal_QNAME = new QName("http://soap.assignment.introsde/", "readGoal");
    private final static QName _ReadAchivedGoal_QNAME = new QName("http://soap.assignment.introsde/", "readAchivedGoal");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://soap.assignment.introsde/", "readPersonResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://soap.assignment.introsde/", "updatePersonResponse");
    private final static QName _ReadPerson_QNAME = new QName("http://soap.assignment.introsde/", "readPerson");
    private final static QName _ReadPersonMeasure_QNAME = new QName("http://soap.assignment.introsde/", "readPersonMeasure");
    private final static QName _UpdatePersonHealthProfile_QNAME = new QName("http://soap.assignment.introsde/", "updatePersonHealthProfile");
    private final static QName _SaveAchivedGoalResponse_QNAME = new QName("http://soap.assignment.introsde/", "saveAchivedGoalResponse");
    private final static QName _ReadAchivedGoalResponse_QNAME = new QName("http://soap.assignment.introsde/", "readAchivedGoalResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://soap.assignment.introsde/", "updatePerson");
    private final static QName _ReadPersonMeasureResponse_QNAME = new QName("http://soap.assignment.introsde/", "readPersonMeasureResponse");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://soap.assignment.introsde/", "createPersonResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://soap.assignment.introsde/", "deletePerson");
    private final static QName _ReadAchivedGoalListResponse_QNAME = new QName("http://soap.assignment.introsde/", "readAchivedGoalListResponse");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://soap.assignment.introsde/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://soap.assignment.introsde/", "savePersonMeasureResponse");
    private final static QName _ReadMeasureTypes_QNAME = new QName("http://soap.assignment.introsde/", "readMeasureTypes");
    private final static QName _CreatePerson_QNAME = new QName("http://soap.assignment.introsde/", "createPerson");
    private final static QName _UpdatePersonMeasure_QNAME = new QName("http://soap.assignment.introsde/", "updatePersonMeasure");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.assignment.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthProfileResponse }
     * 
     */
    public UpdatePersonHealthProfileResponse createUpdatePersonHealthProfileResponse() {
        return new UpdatePersonHealthProfileResponse();
    }

    /**
     * Create an instance of {@link ReadGoalListResponse }
     * 
     */
    public ReadGoalListResponse createReadGoalListResponse() {
        return new ReadGoalListResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHisotry }
     * 
     */
    public ReadPersonHisotry createReadPersonHisotry() {
        return new ReadPersonHisotry();
    }

    /**
     * Create an instance of {@link ReadGoal }
     * 
     */
    public ReadGoal createReadGoal() {
        return new ReadGoal();
    }

    /**
     * Create an instance of {@link ReadPersonHisotryResponse }
     * 
     */
    public ReadPersonHisotryResponse createReadPersonHisotryResponse() {
        return new ReadPersonHisotryResponse();
    }

    /**
     * Create an instance of {@link ReadGoalList }
     * 
     */
    public ReadGoalList createReadGoalList() {
        return new ReadGoalList();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasureResponse }
     * 
     */
    public UpdatePersonMeasureResponse createUpdatePersonMeasureResponse() {
        return new UpdatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link ReadAchivedGoalList }
     * 
     */
    public ReadAchivedGoalList createReadAchivedGoalList() {
        return new ReadAchivedGoalList();
    }

    /**
     * Create an instance of {@link SaveAchivedGoal }
     * 
     */
    public SaveAchivedGoal createSaveAchivedGoal() {
        return new SaveAchivedGoal();
    }

    /**
     * Create an instance of {@link ReadGoalResponse }
     * 
     */
    public ReadGoalResponse createReadGoalResponse() {
        return new ReadGoalResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasure }
     * 
     */
    public SavePersonMeasure createSavePersonMeasure() {
        return new SavePersonMeasure();
    }

    /**
     * Create an instance of {@link SavePersonMeasureResponse }
     * 
     */
    public SavePersonMeasureResponse createSavePersonMeasureResponse() {
        return new SavePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadAchivedGoalListResponse }
     * 
     */
    public ReadAchivedGoalListResponse createReadAchivedGoalListResponse() {
        return new ReadAchivedGoalListResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasure }
     * 
     */
    public UpdatePersonMeasure createUpdatePersonMeasure() {
        return new UpdatePersonMeasure();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadAchivedGoal }
     * 
     */
    public ReadAchivedGoal createReadAchivedGoal() {
        return new ReadAchivedGoal();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthProfile }
     * 
     */
    public UpdatePersonHealthProfile createUpdatePersonHealthProfile() {
        return new UpdatePersonHealthProfile();
    }

    /**
     * Create an instance of {@link ReadPersonMeasure }
     * 
     */
    public ReadPersonMeasure createReadPersonMeasure() {
        return new ReadPersonMeasure();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse }
     * 
     */
    public ReadPersonMeasureResponse createReadPersonMeasureResponse() {
        return new ReadPersonMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadAchivedGoalResponse }
     * 
     */
    public ReadAchivedGoalResponse createReadAchivedGoalResponse() {
        return new ReadAchivedGoalResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link SaveAchivedGoalResponse }
     * 
     */
    public SaveAchivedGoalResponse createSaveAchivedGoalResponse() {
        return new SaveAchivedGoalResponse();
    }

    /**
     * Create an instance of {@link LifeStatus }
     * 
     */
    public LifeStatus createLifeStatus() {
        return new LifeStatus();
    }

    /**
     * Create an instance of {@link AchivedGoal }
     * 
     */
    public AchivedGoal createAchivedGoal() {
        return new AchivedGoal();
    }

    /**
     * Create an instance of {@link HealthMeasureHistory }
     * 
     */
    public HealthMeasureHistory createHealthMeasureHistory() {
        return new HealthMeasureHistory();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link MeasureDefinition }
     * 
     */
    public MeasureDefinition createMeasureDefinition() {
        return new MeasureDefinition();
    }

    /**
     * Create an instance of {@link CustomMeasureDefinition }
     * 
     */
    public CustomMeasureDefinition createCustomMeasureDefinition() {
        return new CustomMeasureDefinition();
    }

    /**
     * Create an instance of {@link Person.HealthProfile }
     * 
     */
    public Person.HealthProfile createPersonHealthProfile() {
        return new Person.HealthProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "updatePersonMeasureResponse")
    public JAXBElement<UpdatePersonMeasureResponse> createUpdatePersonMeasureResponse(UpdatePersonMeasureResponse value) {
        return new JAXBElement<UpdatePersonMeasureResponse>(_UpdatePersonMeasureResponse_QNAME, UpdatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAchivedGoalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readAchivedGoalList")
    public JAXBElement<ReadAchivedGoalList> createReadAchivedGoalList(ReadAchivedGoalList value) {
        return new JAXBElement<ReadAchivedGoalList>(_ReadAchivedGoalList_QNAME, ReadAchivedGoalList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readGoalResponse")
    public JAXBElement<ReadGoalResponse> createReadGoalResponse(ReadGoalResponse value) {
        return new JAXBElement<ReadGoalResponse>(_ReadGoalResponse_QNAME, ReadGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveAchivedGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "saveAchivedGoal")
    public JAXBElement<SaveAchivedGoal> createSaveAchivedGoal(SaveAchivedGoal value) {
        return new JAXBElement<SaveAchivedGoal>(_SaveAchivedGoal_QNAME, SaveAchivedGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readGoalListResponse")
    public JAXBElement<ReadGoalListResponse> createReadGoalListResponse(ReadGoalListResponse value) {
        return new JAXBElement<ReadGoalListResponse>(_ReadGoalListResponse_QNAME, ReadGoalListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "updatePersonHealthProfileResponse")
    public JAXBElement<UpdatePersonHealthProfileResponse> createUpdatePersonHealthProfileResponse(UpdatePersonHealthProfileResponse value) {
        return new JAXBElement<UpdatePersonHealthProfileResponse>(_UpdatePersonHealthProfileResponse_QNAME, UpdatePersonHealthProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHisotry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readPersonHisotry")
    public JAXBElement<ReadPersonHisotry> createReadPersonHisotry(ReadPersonHisotry value) {
        return new JAXBElement<ReadPersonHisotry>(_ReadPersonHisotry_QNAME, ReadPersonHisotry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoalList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readGoalList")
    public JAXBElement<ReadGoalList> createReadGoalList(ReadGoalList value) {
        return new JAXBElement<ReadGoalList>(_ReadGoalList_QNAME, ReadGoalList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHisotryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readPersonHisotryResponse")
    public JAXBElement<ReadPersonHisotryResponse> createReadPersonHisotryResponse(ReadPersonHisotryResponse value) {
        return new JAXBElement<ReadPersonHisotryResponse>(_ReadPersonHisotryResponse_QNAME, ReadPersonHisotryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readGoal")
    public JAXBElement<ReadGoal> createReadGoal(ReadGoal value) {
        return new JAXBElement<ReadGoal>(_ReadGoal_QNAME, ReadGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAchivedGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readAchivedGoal")
    public JAXBElement<ReadAchivedGoal> createReadAchivedGoal(ReadAchivedGoal value) {
        return new JAXBElement<ReadAchivedGoal>(_ReadAchivedGoal_QNAME, ReadAchivedGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readPersonMeasure")
    public JAXBElement<ReadPersonMeasure> createReadPersonMeasure(ReadPersonMeasure value) {
        return new JAXBElement<ReadPersonMeasure>(_ReadPersonMeasure_QNAME, ReadPersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "updatePersonHealthProfile")
    public JAXBElement<UpdatePersonHealthProfile> createUpdatePersonHealthProfile(UpdatePersonHealthProfile value) {
        return new JAXBElement<UpdatePersonHealthProfile>(_UpdatePersonHealthProfile_QNAME, UpdatePersonHealthProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveAchivedGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "saveAchivedGoalResponse")
    public JAXBElement<SaveAchivedGoalResponse> createSaveAchivedGoalResponse(SaveAchivedGoalResponse value) {
        return new JAXBElement<SaveAchivedGoalResponse>(_SaveAchivedGoalResponse_QNAME, SaveAchivedGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAchivedGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readAchivedGoalResponse")
    public JAXBElement<ReadAchivedGoalResponse> createReadAchivedGoalResponse(ReadAchivedGoalResponse value) {
        return new JAXBElement<ReadAchivedGoalResponse>(_ReadAchivedGoalResponse_QNAME, ReadAchivedGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readPersonMeasureResponse")
    public JAXBElement<ReadPersonMeasureResponse> createReadPersonMeasureResponse(ReadPersonMeasureResponse value) {
        return new JAXBElement<ReadPersonMeasureResponse>(_ReadPersonMeasureResponse_QNAME, ReadPersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAchivedGoalListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readAchivedGoalListResponse")
    public JAXBElement<ReadAchivedGoalListResponse> createReadAchivedGoalListResponse(ReadAchivedGoalListResponse value) {
        return new JAXBElement<ReadAchivedGoalListResponse>(_ReadAchivedGoalListResponse_QNAME, ReadAchivedGoalListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.assignment.introsde/", name = "updatePersonMeasure")
    public JAXBElement<UpdatePersonMeasure> createUpdatePersonMeasure(UpdatePersonMeasure value) {
        return new JAXBElement<UpdatePersonMeasure>(_UpdatePersonMeasure_QNAME, UpdatePersonMeasure.class, null, value);
    }

}
