package edu.stthomas.seis771.team2.domainmodel;

/**
 * 
 * Represents PetMedicalRecord.
 * @author Yared
 *
 */
public class PetMedicalRecord implements ISaveableObject
{
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPetId() {
		return petId;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getCareDate() {
		return careDate;
	}

	public void setCareDate(String careDate) {
		this.careDate = careDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getOutsideCareAdditionalInfo() {
		return outsideCareAdditionalInfo;
	}

	public void setOutsideCareAdditionalInfo(String outsideCareAdditionalInfo) {
		this.outsideCareAdditionalInfo = outsideCareAdditionalInfo;
	}
	
	
	/**
	 * Medical record Id.
	 */
	private Integer id;

	/**
	 * The pet id of this medical record
	 */
	private Integer petId;
	
	
	/**
	 * The employee id.
	 */
	private Integer employeeId;	
	
	
	/**
	 * The date associated with the care.
	 */
	private String careDate;
	
	
	/**
	 * The comment about what happened.
	 */
	private String comment;
	
	
	/**
	 * Comment indicating if we need any extra care info for the pet.
	 */
	private String outsideCareAdditionalInfo;
	

	/**
	 * Used for inserting this medical info
	 */
	public String values()
	{
		String values = "( MEDICALRECORD_ID, ANIMAL_ID, EMPLOYEE_ID, CARE_DATE, COMMENT, OUTSIDECARE_NEEDED )  VALUES ("  + 
				this.getId() + ", " +  
				this.getPetId() + ", " + 
				this.getEmployeeId() + ", '" +
				this.getCareDate() + "', '" + 
				this.getComment() + "', '" + 
				this.getOutsideCareAdditionalInfo() + "' " + ");";
		return values;
	}

	/**
	 * The Search criteria for searching instances of this class in the database.
	 */
	public String searchCriteria()
	{
		return " ANIMAL_ID = " + this.getPetId()  ;
	}
	
	/***
	 * 
	 * @param _petID
	 * @param _empId
	 * @param _careDate
	 * @param comment
	 * @param _outCareNeededComment
	 */
	public PetMedicalRecord ( Integer _petID, Integer _empId, String _careDate, String comment, String _outCareNeededComment )
	{
		this.setId(0);
		this.setEmployeeId(_empId);
		this.setOutsideCareAdditionalInfo(_outCareNeededComment);
		this.setCareDate(_careDate);
		this.setPetId(_petID);		
	}

}
