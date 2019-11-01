package edu.stthomas.seis771.team2.dataaccesslayer;

import edu.stthomas.seis771.team2.domainmodel.ISaveableObject;
import edu.stthomas.seis771.team2.domainmodel.Person;
import edu.stthomas.seis771.team2.domainmodel.User;

public class UserDataHandler extends PersistDataChainHandler 
{
	

	/**
	 * <p>
	 *  Constructor with param.
	 *  </p>
	 * @param objToSave
	 * @param pdata
	 */
	public UserDataHandler(ISaveableObject objToSave,
			PersistDataChainHandler pdata) {
		super(objToSave, pdata);
	}
	
	
	/**
	 * <p>
	 * Disabled default constructor.
	 * </p>
	 */
	@SuppressWarnings("unused")
	private UserDataHandler()
	{
		this (null,null);
	}

	/**
	 * <p>
	 * Save object handler logic here.
	 * </p>
	 * @throws Exception 
	 */
	@Override
	protected void saveObjectHandler(ISaveableObject object) throws Exception 
	{
    	if ( this.getNextToProcess() == null )
    	{//The only gateway to the database to save anything is right in these two lines.
    		this.saveObject();
    	}
    	else
    	{ 
    		AddressDataHandler adh = new AddressDataHandler(((Person)object).getAddress(),null);
    		adh.saveObject();//Address saved.
    		User user = (User)object;
    		Person person = new Person ( user.getPersonID(), user.getFistName(), user.getLastName(), user.getEmailAddress(), user.getAddress());
    		PersonDataHandler pdh = new PersonDataHandler (person, null);
    		pdh.saveObject();
    		this.setNextToProcess(null);
    		this.saveObject();
    	}
	}
}
