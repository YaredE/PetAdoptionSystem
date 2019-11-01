package edu.stthomas.seis771.team2.domainmodel;

/**
 * @author Yared
 *
 */
public class Animal  implements ISaveableObject 
{
	
	/***
	 * <p>
	 *  Constructor with all parameters except for ID.
	 *  </p> 
	 * @param _petName pet name
	 * @param _petGender gender
	 * @param _petBreed  breed 
	 * @param _petWeight weight
	 * @param _petColor color
	 * @param _petDOB dob
	 * @param _petDesc description
	 */
	public Animal(Integer _petID,
				  String _petName, 
				  String _petGender, 
				  String _petBreed, 
				  String _petWeight, 
				  String _petColor, 
				  String _petDOB, 
				  String _petDesc)
	{
		this.setPetName(_petName);
		this.setPetGender(_petGender);
		this.setPetBreed(_petBreed);
		this.setPetWeight(_petWeight);
		this.setPetColor(_petColor);
		this.setPetDOB(_petDOB);
		this.setPetDesc(_petDesc);
	}
	
 
	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetGender() {
		return petGender;
	}

	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}

	public String getPetBreed() {
		return petBreed;
	}

	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}

	public String getPetWeight() {
		return petWeight;
	}

	public void setPetWeight(String petWeight) {
		this.petWeight = petWeight;
	}

	public String getPetColor() {
		return petColor;
	}

	public void setPetColor(String petColor) {
		this.petColor = petColor;
	}

	public String getPetDOB() {
		return petDOB;
	}

	public void setPetDOB(String petDOB) {
		this.petDOB = petDOB;
	}

	public String getPetDesc() {
		return petDesc;
	}

	public void setPetDesc(String petDesc) {
		this.petDesc = petDesc;
	}
	
	public Integer getPetID() {
		return petID;
	}


	public void setPetID(Integer petID) {
		this.petID = petID;
	}
	
	/**
	 * The pet ID.
	 */
	private Integer petID;

	/**
	 * The name of the pet.
	 */
	private String petName;
	/**
	 * The gender.
	 */
	private String petGender;
	/**
	 * The breed.
	 */
	private String petBreed;
	
	/**
	 * The weight
	 */
	private String petWeight;
	
	/**
	 * The color
	 */
	private String petColor;
	
	/**
	 * The DOB
	 */
	private String petDOB;
	
	/**
	 * Brief description of the pet
	 */
	private String petDesc;

	/**
	 * Used for inserting an animal
	 */
	public String values()
	{
		String values = "( ANIMAL_ID, NAME, GENDER, BREED, WEIGHT, COLOR, DOB, DESC, ANIMALTYPE_ID )  VALUES ("
							+ this.getPetID() + ",'" + this.getPetName() + "'"
							+ ", '" + this.getPetGender() + "', '" + this.getPetBreed() + "', '" 
							+ this.getPetWeight() + "', '" + this.getPetColor() 
							+  "', '"  + this.getPetDOB() 
							+ "', '"  + this.getPetDesc() +  "', " +  1 + " );";
		return values;
	}

	/**
	 * Used for searching the database.
	 */
	public String searchCriteria() 
	{
		return " NAME = '" + this.getPetName() + "' AND  DOB ='" + this.getPetDOB() + "'" + " AND  COLOR ='" + this.getPetDOB() +"'" ;
	}
}
