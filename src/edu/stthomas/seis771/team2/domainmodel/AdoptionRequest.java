package edu.stthomas.seis771.team2.domainmodel;

public class AdoptionRequest  implements ISaveableObject 
{	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnimalTypeId() {
		return animalTypeId;
	}

	public void setAnimalTypeId(Integer animalTypeId) {
		this.animalTypeId = animalTypeId;
	}

	public String getCritera() {
		return critera;
	}

	public void setCritera(String critera) {
		this.critera = critera;
	}

	public String getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(String requestedDate) {
		this.requestedDate = requestedDate;
	}

	/**
	 * The adoption requestID
	 */
	private Integer id;
	
	/**
	 * The animal type id.
	 */
	private Integer animalTypeId;
	
	/**
	 * The Criterion
	 */
	private String critera;
	
	
	/**
	 * The date request is made.
	 */
	private String requestedDate;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	/**
	 * The UserID.
	 */
	private String userID;
	

	/**
	 *  This is a constructor for adoption request object.
	 * @param id
	 * @param animalTypeId
	 * @param critera
	 * @param requestedDate
	 * @param userID
	 */
	public AdoptionRequest(Integer id, Integer animalTypeId, String critera,
			String requestedDate, String userID) {
		super();
		this.id = id;
		this.animalTypeId = animalTypeId;
		this.critera = critera;
		this.requestedDate = requestedDate;
		this.userID = userID;
	}

	/**
	 * Used for inserting an adoption request.
	 */
	public String values()
	{
		String values = "( ADOPTIONREQUEST_ID, USER_ID, ANIMALTYPE_ID, CRITERIA, REQUEST_DATE )  VALUES ("
							+  this.getId() + ",'" + this.getUserID() + "'"
							+ ", " + this.getAnimalTypeId() + ", '" + this.getCritera() + "' , '" + this.getRequestedDate() + "');";
		return values;
	}

	/**
	 * Used for searching the database.
	 */
	public String searchCriteria() 
	{
		return " USER_ID = '" + this.getUserID() + "'" ;
	}
}
