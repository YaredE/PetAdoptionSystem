package edu.stthomas.seis771.team2.client.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * These are binding contracts required by the client to fullfill the different use-cases.
 * @author Yared
 *
 */
public interface PetAdoptionOrganizationServiceAsync
{

	/**
	 * Used for authenticating a user ( Employee or customer ).
	 * @param userName
	 * @param password
	 * @param callback
	 */
    void authenticate(String userName, String password,
            AsyncCallback<String> callback);

    /**
     * Used for registering a user.
     * @param fname
     * @param lname
     * @param userName
     * @param password
     * @param address
     * @param city
     * @param zip
     * @param callback
     */
    void register(String fname, String lname, String userName, String password,
            String address, String email, String city, String zip,
            AsyncCallback<String> callback);

    /**
     * Records animal by for in take.
     * @param petInformation
     * @param callback
     */
    void recordAnimalByIntake(HashMap<String, String> petInformation, AsyncCallback<String> callback);
    
    
    /**
     * Records animal medical information either for daily routine or for in take.
     * @param petInformation
     * @param callback
     */
	void recordMedicalInformation(HashMap<String, String> petInformation,
			AsyncCallback<String> callback);
	
    /**
     * Records animal by rescue.
     * @param petInformation
     * @param callback
     */
	void recordAnimalByRescue(HashMap<String, String> petInformation,
			AsyncCallback<String> callback);
	
	/**
	 * Makes the adoption request.
	 * @param petInformation
	 * @param callback
	 */
	void makeAdoptionRequest(HashMap<String, String> petInformation, AsyncCallback<String> callback);

	
    void submission(String status, String submissionid,
            AsyncCallback<String> callback);

    void request(String status, String adoptionid, String date,
            String animalid, String breed, String gender, String age,
            String size, String color, String userName, String password,
            AsyncCallback<String> callback);

    void makeAMatchRequest(HashMap<String, String> petInformation,
			AsyncCallback<String> callback);   

}
