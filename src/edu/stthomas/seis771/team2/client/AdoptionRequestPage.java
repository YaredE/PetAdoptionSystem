package edu.stthomas.seis771.team2.client;

import java.util.HashMap;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;

import edu.stthomas.seis771.team2.client.IntakeSubmissionPage.AnimalRegistrationHandler;
import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;
import edu.stthomas.seis771.team2.shared.FieldVerifier;

public class AdoptionRequestPage extends Composite 
{
	
	
	/**
     * The animal name field.
     */
    private TextBox petDesc;
    
    /**
     * The animal gender.
     */
    private TextBox genderField;
    
    
    /**
     * The animal breed
     */
    private TextBox breedField;
    
    
    /**
     * The animal size.
     */
    private TextBox weightField;
    
    
    /**
     * The animal color.
     */
    private TextBox colorField;
    
    
   
    /**
     * The animal ID.
     */
    private TextBox petType;
    
    
   
    /**
     * The response from the server.
     */
    private Label animalRecordInfo;
    
    
    /**
     *  The submit button
     */
    private Button submitButton;

    /**
     * The default pet type.
     */
	private String DEFAULT_PET_NAME = "Dog";
	
	
    /**
     * This is for invoking PetAdoptionOrganizationServiceAsync.
     */
    private PetAdoptionOrganizationServiceAsync paoService;
    
    
    /**
     * The vertical panel.
     */
    private VerticalPanel vPanel;
    
    
    private HashMap<String, String>  data = null;
    
    /**
     * 
     * @param _paoService
     */
    public AdoptionRequestPage(PetAdoptionOrganizationServiceAsync _paoService)
    {
       
    	vPanel = new VerticalPanel();
        initWidget(vPanel);
        
        this.paoService = _paoService;
        
        petDesc = new TextBox();
        genderField = new TextBox();        
        breedField = new TextBox();
        weightField = new TextBox(); 
        colorField = new TextBox();
        petType = new TextBox();
        petType.setText(DEFAULT_PET_NAME );
        petType.setReadOnly(true);        
        animalRecordInfo  = new Label();
        // Create a DateBox
	       
        Grid grid = new Grid(8, 2);
        grid.setWidget(0, 0, new Label("Pet type:"));
        grid.setWidget(0, 1, petType);
        
        grid.setWidget(1, 0, new Label("Description:"));
        grid.setWidget(1, 1, petDesc);
        
        grid.setWidget(2, 0, new Label("Preferred Gender:"));
        grid.setWidget(2, 1, genderField);
        
        grid.setWidget(3, 0, new Label("Preferred Breed:"));
        grid.setWidget(3, 1, breedField);
        
        grid.setWidget(4, 0, new Label("Preferred Weight:"));
        grid.setWidget(4, 1, weightField );
        
        grid.setWidget(5, 0, new Label("Preferred Color:"));
        grid.setWidget(5, 1, colorField);
        
         
        submitButton = new Button("Submit"); 
        submitButton.addClickHandler(new AnimalAdoptionRequestHandler());
 
        grid.setWidget(6, 1, submitButton );
        grid.setWidget(7, 1, animalRecordInfo );
        vPanel.add(grid);
    }
    
    /**
     *  This is handler for recording the pet in the database. ( Makes a trip to the Server ).
     */
    class AnimalAdoptionRequestHandler implements ClickHandler
    {
        /**
         * Fired when the user clicks on the submitButton.
         */
        public void onClick(ClickEvent event) 
        {
            if (event.getSource() == submitButton) 
            {
                String message = collectDataRecordAnimal();
                if ( message != null && message.contains("Success") )
                {// Ask for more information ... 
                 // Is there any medical record associated for this animal.*\
                	if ( data !=null  && data.size() > 1 )
                	{
                		vPanel.clear();
                		animalRecordInfo  = new Label();
                		animalRecordInfo.setText("Your adoption request has been received we will contact you with the best matches!");
                		vPanel.add(animalRecordInfo);
                	}
                }
            }
        }

        /**
         * Collect information entered in the UI and send it to the Server.
         */
		private String collectDataRecordAnimal() 
		{	
			
			if ( !FieldVerifier.isValidName (petDesc.getText()) ||
				 !FieldVerifier.isValidName (genderField.getText()) ||
				 !FieldVerifier.isValidName (breedField.getText()) ||
				 !FieldVerifier.isValidName (weightField.getText()) ||
				 !FieldVerifier.isValidName (colorField.getText()) ||
				 !FieldVerifier.isValidName (petType.getText()) 
			   )
			{
				return "Invalid data please re-enter";
			}
			
			String errorCode = "Success";
			try
			{
				HashMap<String, String> petInformation = new HashMap<String, String>();
				petInformation.put("desc", petDesc.getText());
				petInformation.put("gender",genderField.getText());
				petInformation.put("breed", breedField.getText());
				petInformation.put("weight", weightField.getText());
				petInformation.put("color", colorField.getText());
				petInformation.put("type", petType.getText());
				data = petInformation;
				if ( paoService != null )
				{
					paoService.makeAdoptionRequest(petInformation, new RecordAnimalByIntakeCallBackHandler());	 
				}
			}
			catch ( Exception ex )
			{
				errorCode = ex.getLocalizedMessage().toString();
			}			
			return  errorCode;
		}
    }
    

    /**
     * <p>
     *  Handle what is going to happen onSuccess and OnFailure.
     * </p>
     *
     * @author user
     *
     */
    private class RecordAnimalByIntakeCallBackHandler implements AsyncCallback<String> {

        public void onFailure(Throwable caught) 
        {
        	animalRecordInfo.setText(caught.toString());
        }

        public void onSuccess(String result)
        {
        	if ( result != null  && result.contains("Success") )
        	{
        		animalRecordInfo.setText("Your adoption request has been received we will contact you with the best matches!");
        	}
        }
    }
}
