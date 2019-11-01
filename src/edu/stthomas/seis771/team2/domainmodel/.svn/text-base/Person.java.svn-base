package edu.stthomas.seis771.team2.domainmodel;


/*
 * Represents the Person Object.
 */
public class Person implements ISaveableObject
{

	/**
	 * @category Data Model
	 * Represents Person ID.
	 */
	private Integer personID;
 
 
	/**
	 * @category Data Model
	 * Represents Person first name.
	 */
	private String fistName;
 
 
	/**
	 * @category Data Model
	 * Represents Person last name.
	 */
	private String lastName;
	
	 
	/**
	 * @category Data Model
	 * Represents Person Address.
	 */
	private Address address;
	
	
	private String emailAddress;
	
	
	/**
	 * @category Data Model
	 * Default constructor disabled.
	 */
	@SuppressWarnings("unused")
	private Person()
	{
	}

 
	/**
	 * 
	 * @param name
	 * @param lastName
	 */
	public Person(Integer _id, String _firstName, String _lastName,  String _emailAddress, Address _address)
	{
		this.setPersonID(_id);
		this.setFistName(_firstName);
		this.setLastName(_lastName);
		this.setAddress(_address);
		this.setEmailAddress(_emailAddress);
	}


	/**
	 * 
	 * @return the person ID.
	 */
	public Integer getPersonID() {
		return personID;
	}


	/**
	 * 
	 * @param personID the person ID.
	 */
	public void setPersonID(Integer personID) {
		this.personID = personID;
	}


	public String getFistName() {
		return fistName;
	}


	/**
	 * Sets the person's first name.
	 * @param fistName the first name of the person.
	 * 
	 */
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}


	
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	/**
	 * <p>
	 *  Values to be added.
	 * </p>
	 * @return
	 */
	public String values()
	{
		String values = "( PERSON_ID, FIRST_NAME, LAST_NAME, EMAIL_ADDRESS, ADDRESS_ID )  VALUES ("  + this.getPersonID() + ",'" +  this.getFistName() + "', '" +
	                     this.getLastName() + "', '" + this.getEmailAddress() +"' , "  + this.getAddress().getAddressID() + ");";
		return values;
	}
	
	
	/**
	 * Gets the email address
	 * @return the email address
	 */
	public String getEmailAddress() {
		return emailAddress;
	}


	/***
	 * Sets the Email address.
	 * @param emailAddress
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/***
	 * <p>
	 * Search will be made using this info.
	 * </p>
	 */
	public String searchCriteria() 
	{
		return " FIRST_NAME = '" + this.getFistName() + "'  AND  LAST_NAME = '" + this.getLastName() + "'" ;
	}


	

}