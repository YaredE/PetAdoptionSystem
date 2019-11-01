package edu.stthomas.seis771.team2.server;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationService;
import edu.stthomas.seis771.team2.shared.FieldVerifier;

/**
 * 
 * @author Yared
 * 
 */
public class PetAdoptionOrganizationServiceImpl extends RemoteServiceServlet
		implements PetAdoptionOrganizationService {

	/*
	 * The serialVersionUID
	 */
	private static final long serialVersionUID = -7627832371307312875L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationService
	 * #authenticate(java.lang.String, java.lang.String)
	 */
	public String authenticate(String userName, String password) {
		if (FieldVerifier.isValidName(userName)
				&& FieldVerifier.isValidName(password)) {
			return SystemObjectFactory.authenticateUser(userName, password);
		}
		return "Invalid Login information please fix!";
	}

	public String recordAnimalByIntake(HashMap<String, String> petInformation) {
		if (petInformation == null) {
			return "Invalid pet information, please resubmit.";
		}
		String petName = petInformation.get("name");
		String petGender = petInformation.get("gender");
		String petBreed = petInformation.get("breed");
		String petWeight = petInformation.get("weight");
		String petColor = petInformation.get("color");
		String petDOB = petInformation.get("dob");
		String petDesc = petInformation.get("desc");
		return SystemObjectFactory.recordAnimal(petName, petGender, petBreed,
				petWeight, petColor, petDOB, petDesc);

	}

	public String recordMedicalInformation(
			HashMap<String, String> petInformation) {
		if (petInformation == null) {
			return "Invalid pet information, please resubmit.";
		}

		String petName = petInformation.get("name");
		String petGender = petInformation.get("gender");
		String petBreed = petInformation.get("breed");
		String petWeight = petInformation.get("weight");
		String petColor = petInformation.get("color");
		String petDOB = petInformation.get("dob");
		String petDesc = petInformation.get("desc");

		Integer animalID = SystemObjectFactory.searchIdofTheObject(petName,
				petGender, petBreed, petWeight, petColor, petDOB, petDesc);

		if (animalID >= 0)
		{
			String careDate = petInformation.get("careDate");
			String comment = petInformation.get("comment");
			String outsidecaredNeededComment = petInformation
					.get("outsidecaredNeededComment");
			Integer employee_id = 0;
			String eId = petInformation.get("employeeId");
			if (eId != null && !eId.isEmpty()) {
				employee_id = Integer
						.parseInt(petInformation.get("employeeId"));
			}
			return SystemObjectFactory.recordMedicalInfoForAPet(employee_id,
					animalID, careDate, comment, outsidecaredNeededComment);
		}
		return "Invalid pet information, please resubmit.";
	}

	/**
	 * 
	 */
	public String recordAnimalByRescue(HashMap<String, String> petInformation) 
	{
		if ( petInformation != null )
		{
			petInformation.put("typeofRequest", "Rescue");
		}
		return recordAnimalByIntake (petInformation);
	}
	

	public String request(String status, String adoptionid, String date,
			String animalid, String breed, String gender, String age,
			String size, String color, String userName, String password) {
		if (FieldVerifier.isValidName(adoptionid)
				&& FieldVerifier.isValidName(animalid)
				&& FieldVerifier.isValidName(userName)) {
			return SystemObjectFactory.requestAnimal(status, adoptionid, date,
					animalid, breed, gender, age, size, color, userName,
					password);
		}
		return "Invalid registration data please fix!";
	}

	public String submission(String status, String submissionid) {
		if (FieldVerifier.isValidName(submissionid)
				&& FieldVerifier.isValidName(status)) {
			return SystemObjectFactory.submitAnimal(status, submissionid);
		}
		return "Invalid registration data please fix!";
	}

	public String register(String fname, String lname, String userName,
			String password, String _email, String address, String city,
			String zip) {
		if (FieldVerifier.isValidName(fname)
				&& FieldVerifier.isValidName(lname)
				&& FieldVerifier.isValidName(userName)) {
			return SystemObjectFactory.registerAUser(fname, lname, userName,
					password, _email, address, city, zip);
		}
		return "Invalid registration data please fix!";
	}

	public String makeAdoptionRequest(HashMap<String, String> petInformation) 
	{
		
		if (petInformation == null) {
			return "Invalid pet information, please resubmit.";
		}
		String petDesc = petInformation.get("desc");
		String petGender = petInformation.get("gender");
		String petBreed = petInformation.get("breed");
		String petWeight = petInformation.get("weight");
		String petColor = petInformation.get("color");
		String type = petInformation.get("type");
		String userId = petInformation.get("userId");
		
		return SystemObjectFactory.makeAdoptionRequest(petDesc, userId, type,
				petGender, petBreed, petWeight, petColor);
	}

	/**
	 * 
	 */
	public String makeAMatchRequest( HashMap<String, String> petInformation)
	{
		return null;
	}

}
