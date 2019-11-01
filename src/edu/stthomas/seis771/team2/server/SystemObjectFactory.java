package edu.stthomas.seis771.team2.server;

import java.util.Calendar;

import org.datanucleus.store.types.sco.simple.Date;

import edu.stthomas.seis771.team2.dataaccesslayer.PersonDataHandler;
import edu.stthomas.seis771.team2.dataaccesslayer.TransactionHandler;
import edu.stthomas.seis771.team2.dataaccesslayer.UserDataHandler;
import edu.stthomas.seis771.team2.domainmodel.Address;
import edu.stthomas.seis771.team2.domainmodel.ISaveableObject;
import edu.stthomas.seis771.team2.domainmodel.Person;
import edu.stthomas.seis771.team2.domainmodel.User;
import edu.stthomas.seis771.team2.domainmodel.Animal;
import edu.stthomas.seis771.team2.domainmodel.AdoptionRequest;
import edu.stthomas.seis771.team2.domainmodel.PetMedicalRecord;
import  edu.stthomas.seis771.team2.dataaccesslayer.GenericDataChainHandler;


public class SystemObjectFactory {

    /**
     * <p>
     * Responsible for creating a Address object @Pattern Factory
     * </p>
     *
     * @param _aID
     * @param _street
     * @param _city
     * @param _zip
     * @return
     */
    private static Address createAddress(Integer _aID, String _street,
            String _city, String _zip) {
        Address address = null;

        try {
            address = new Address(_aID, _street, _city, _zip);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return address;
    }

    /**
     * <p>
     * Responsible for creating a Person Object and save it.
     *
     * @Pattern Factory
     *          </p>
     * @return
     */
    public static Person createPerson(String firstName, String lastName,
            String emailAddress, String streetAddress, String city, String zip) {

        Person person = null;
        try {
            Integer addressID = (int) (Math.random() * 512 * 6);
            Address address = createAddress(addressID, streetAddress, city, zip);

            java.util.Random random = new java.util.Random();
            int randID = random.nextInt(9999) + 100;
            Integer personID = new Integer(randID);

            person = new Person(personID, firstName, lastName, emailAddress, address);

            // Create a chain here ...
            PersonDataHandler pdh = null;
            pdh = new PersonDataHandler(person, pdh);
            pdh.setNextToProcess(pdh);
            pdh.saveObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return person;
    }

    public static String authenticateUser(String userID, String password) {
        try {
            initializeSystem();
            TransactionHandler handler = new TransactionHandler();
            //We create very lightly populated objects for validation purposes.
            User user = new User(userID, password, 1, " XXX", "XXX","abc@gmail.com", null);
            if (handler.searchRecord(user))
            {
                return " You are logged in!";
            }

        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "Incorrect user name and password provided.";
    }

    /**
     * <p>
     * System setup.
     * </p>
     */
    public static void initializeSystem() {
        TransactionHandler.intSystem();
    }

    /**
     *
     * @param fname
     * @param lname
     * @param userName
     * @param password
     * @param _address
     * @param city
     * @param zip
     * @return
     */
    public static String registerAUser(String fname, String lname,
            String userName, String password, String _email, String _address, String city,
            String zip) {
        TransactionHandler th = new TransactionHandler();
        Address address = new Address(121, _address, city, zip);
        int iAddressCounter = th.generateNextID(address);
        address.setAddressID(iAddressCounter);
        User user = new User(userName, password, 1, fname, lname, _email, address);
        th = new TransactionHandler();
        int personID = th.generateNextID(user);
        user.setPersonID(personID);
        UserDataHandler udh = new UserDataHandler(user, null);
        udh.setNextToProcess(udh);
        try {
            udh.saveObject();
        } catch (Exception e) {
            return e.getMessage();
        }
        return "You are successfully registered";
    }

    public static String rescueAnimal(String status, String rescueid,
            String date, String animalid, String breed, String gender,
            String age, String size, String color, String userName,
            String password)
    {
        return null;
    }

    public static String requestAnimal(String status, String adoptionid,
            String date, String animalid, String breed, String gender,
            String age, String size, String color, String userName,
            String password) {
        // TODO Auto-generated method stub
        return null;
    }

    public static String submitAnimal(String status, String submissionid) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * <p>
     *   Given the pet information it saves it to the database.
     *  </p>
     * @param petName
     * @param petGender
     * @param petBreed
     * @param petWeight
     * @param petColor
     * @param petDOB
     * @param petDesc
     * @return Success if all is good and error if any failure. 
     */
	public static String recordAnimal(String petName,
									  String petGender,
									  String petBreed, 
									  String petWeight, 
									  String petColor, 
									  String petDOB,
									  String petDesc) 
	{
		String errorCode = "Success";
		try
		{
			TransactionHandler th = new TransactionHandler();
			Animal animal =  new Animal(0, petName,petGender,petBreed, petWeight, petColor, petDOB, petDesc );
			Integer _nextID = th.generateNextID(animal);
			animal.setPetID(_nextID);
			GenericDataChainHandler gdch = new GenericDataChainHandler(animal, null);
			gdch.saveObject();
			errorCode =  errorCode + "|" + _nextID;
		}
		catch ( Exception  ex )
		{
			errorCode = ex.toString();
		}		
		return errorCode;
	}
	
	/**
     * <p>
     *   Given the pet information it saves it to the database.
     *  </p>
     * @param petName
     * @param petGender
     * @param petBreed
     * @param petWeight
     * @param petColor
     * @param petDOB
     * @param petDesc
     * @return Success if all is good and error if any failure. 
     */
	public static Integer searchIdofTheObject(String petName,
									  String petGender,
									  String petBreed, 
									  String petWeight, 
									  String petColor, 
									  String petDOB,
									  String petDesc) 
	{
		Animal animal= null;
		try
		{
			TransactionHandler th = new TransactionHandler();
			animal =  new Animal(0, petName,petGender,petBreed, petWeight, petColor, petDOB, petDesc );
			return th.searchRecordId(animal);
		}
		catch ( Exception  ex )
		{
			ex.printStackTrace();
		}		
		return -1;
	}
	
	

	/**
	 *  Make a record of medical care or medical historical data for a pet.
	 * @param employee_id
	 * @param animalID
	 * @param careDate
	 * @param comment
	 * @param outsidecaredNeededComment
	 * @return
	 */
	public static String recordMedicalInfoForAPet(Integer employee_id,
			Integer animalID, String careDate, String comment,
			String outsidecaredNeededComment) {
		String errorCode = "Success";
		try
		{
			TransactionHandler th = new TransactionHandler();
			PetMedicalRecord petMedRecord =  new PetMedicalRecord(animalID,employee_id,careDate,comment,outsidecaredNeededComment);
			Integer _nextID = th.generateNextID(petMedRecord);
			petMedRecord.setId(_nextID);
			GenericDataChainHandler gdch = new GenericDataChainHandler(petMedRecord, null);
			gdch.saveObject();
		}
		catch ( Exception  ex )
		{
			errorCode = ex.toString();
		}		
		return errorCode;
	}
	
	/**
     * <p>
     *   Given the pet information it saves it to the database.
     *  </p>
     * @param petName
     * @param petGender
     * @param petBreed
     * @param petWeight
     * @param petColor
     * @param petDOB
     * @param petDesc
     * @return Success if all is good and error if any failure. 
     */
	public static String recordAnimalByRescue(String petName,
									  String petGender,
									  String petBreed, 
									  String petWeight, 
									  String petColor, 
									  String petDOB,
									  String petDesc) 
	{
		String errorCode = "Success";
		try
		{
			TransactionHandler th = new TransactionHandler();
			Animal animal =  new Animal(0, petName,petGender,petBreed, petWeight, petColor, petDOB, petDesc );
			Integer _nextID = th.generateNextID(animal);
			animal.setPetID(_nextID);
			GenericDataChainHandler gdch = new GenericDataChainHandler(animal, null);
			gdch.saveObject();
			errorCode =  errorCode + "|" + _nextID;
		}
		catch ( Exception  ex )
		{
			errorCode = ex.toString();
		}		
		return errorCode;
	}

	/**
	 * Makes  adoption request in the application.
	 * @param petDesc
	 * @param userId
	 * @param type
	 * @param petGender
	 * @param petBreed
	 * @param petWeight
	 * @param petColor
	 * @return
	 */
	public static String makeAdoptionRequest(String petDesc, String userId,
			String type, String petGender, String petBreed, String petWeight,
			String petColor) 
	{
		
		String sCriteria =    " Gender =" + petGender + 
				               "Breed =" + petBreed +
				              " Weight =" + petWeight +
				              " Description=" + petDesc;
		
		java.util.Date today = Calendar.getInstance().getTime();				
		
		String errorCode = "Success";
		try
		{
			TransactionHandler th = new TransactionHandler();
			AdoptionRequest adpRequest = new AdoptionRequest(0, 1, sCriteria, today.toString(), userId);
			Integer _nextID = th.generateNextID(adpRequest);
			adpRequest.setId(_nextID);
			GenericDataChainHandler gdch = new GenericDataChainHandler(adpRequest, null);
			gdch.saveObject();
			errorCode =  errorCode + "|" + _nextID;
		}
		catch ( Exception  ex )
		{
			errorCode = ex.toString();
		}		
		return errorCode;
	}
	
	
	
	

}
