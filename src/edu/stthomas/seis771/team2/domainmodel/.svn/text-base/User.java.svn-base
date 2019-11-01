package edu.stthomas.seis771.team2.domainmodel;


public class User extends Person
{
	/**
	 * <p>
	 * The user Id.
	 * </p>
	 */
	private String userId;
	
	
	/**
	 * <p>
	 * Password associated with a user.
	 * </p>
	 */
	private String password;
	
	/**
	 * <p>
	 *  Constructs Person object.
	 * </p>
	 * @param _id
	 * @param _firstName
	 * @param _lastName
	 * @param _dateOfBirth
	 * @param _address
	 */
	public User(String _userID,  String _password, Integer _id, String _firstName, String _lastName, String _emailAddress, Address _address) {
		super(_id, _firstName, _lastName, _emailAddress, _address);
		this.setUserId(_userID);
		this.setPassword(_password);
	}
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * <p>
	 *  Values to be added.
	 * </p>
	 * @return
	 */
	@Override
	public String values()
	{
		String values = "( USER_ID, PASSWORD, PERSON_ID )  VALUES ('"  + this.getUserId() + "'" +
				",'" + this.getPassword()+ "'," +    this.getPersonID() + ");";
		return values;
	}

	/***
	 * <p>
	 * Search will be made using this info.
	 * </p>
	 */
	@Override
	public String searchCriteria() 
	{
		return " USER_ID = '" + this.getUserId() + "'  AND  PASSWORD = '" + this.getPassword() + "'";
	}
}