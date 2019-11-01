package edu.stthomas.seis771.team2.client.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("paoservice")
public interface PetAdoptionOrganizationService extends RemoteService
{
	public String recordAnimalByRescue(HashMap<String, String> petInformation) ;

    public String request(String status, String adoptionid, String date,
            String animalid, String breed, String gender, String age,
            String size, String color, String userName, String password);

    public String submission(String status, String submissionid);

    /**
     * The Registration operation to register any member.
     *
     * @param fname
     * @param lname
     * @param userName
     * @param password
     * @param address
     * @param city
     * @param zip
     * @return the success or failure story.
     */
    public String register(String fname, String lname, String userName,
            String password, String email, String address, String city, String zip);

    /**
     * Used for authenticating the user.
     *
     * @param userName
     * @param password
     * @return the success or failure story.
     */
    public String authenticate(String userName, String password);

    /**
     * @param petInformation
     * @return
     */
    public String recordAnimalByIntake(HashMap<String, String> petInformation);

	/**
	 * Records medical information about a pet.
	 * 
	 * @param petInformation
	 * @return
	 */
    public String recordMedicalInformation(HashMap<String, String> petInformation);

	/**
	 * Make adoption request.
	 * 
	 * @param petInformation
	 * @return
	 */
    public String makeAdoptionRequest(HashMap<String, String> petInformation);
    
    
    public String makeAMatchRequest (HashMap<String, String> petInformation);

}
