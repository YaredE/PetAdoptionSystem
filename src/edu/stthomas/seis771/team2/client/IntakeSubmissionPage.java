package edu.stthomas.seis771.team2.client;

import java.util.HashMap;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;
import edu.stthomas.seis771.team2.shared.FieldVerifier;

public class IntakeSubmissionPage extends Composite
{
	/**
     * The animal name field.
     */
    private TextBox petName;
    
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
     * The date of birth submitted.
     */
    private DateBox dobField;
    
    
    /**
     * The animal ID.
     */
    private TextBox petType;
    
    
    /**
     * Description to the animal.
     */
    private TextArea briefDescField;
    
    
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
    public IntakeSubmissionPage(PetAdoptionOrganizationServiceAsync _paoService)
    {
       
    	vPanel = new VerticalPanel();
        initWidget(vPanel);
        
        this.paoService = _paoService;
        
        petName = new TextBox();
        genderField = new TextBox();        
        breedField = new TextBox();
        weightField = new TextBox(); 
        colorField = new TextBox();
        petType = new TextBox();
        briefDescField = new TextArea ();
        briefDescField.setCharacterWidth(22);
        briefDescField.setVisibleLines(5);
        petType.setText(DEFAULT_PET_NAME );
        petType.setReadOnly(true);        
        animalRecordInfo  = new Label();
        // Create a DateBox
		DateTimeFormat dateFormat = DateTimeFormat.getFormat("MM/dd/yyyy");
        dobField = new DateBox();
        dobField.setFormat(new DateBox.DefaultFormat(dateFormat));
        dobField.getDatePicker().setYearArrowsVisible(true);
        
        Grid grid = new Grid(11, 2);
        grid.setWidget(0, 0, new Label("Pet type:"));
        grid.setWidget(0, 1, petType);
        
        grid.setWidget(1, 0, new Label("Name:"));
        grid.setWidget(1, 1, petName);
        
        grid.setWidget(2, 0, new Label("Gender:"));
        grid.setWidget(2, 1, genderField);
        
        grid.setWidget(3, 0, new Label("Breed:"));
        grid.setWidget(3, 1, breedField);
        
        grid.setWidget(4, 0, new Label("Weight:"));
        grid.setWidget(4, 1, weightField );
        
        grid.setWidget(5, 0, new Label("Color:"));
        grid.setWidget(5, 1, colorField);
        
        grid.setWidget(6, 0, new Label("Date of birth:"));
        grid.setWidget(6, 1, dobField);
        
        grid.setWidget(7, 0, new Label("Description:"));
        grid.setWidget(7, 1, briefDescField);
        
        submitButton = new Button("Submit"); 
        submitButton.addClickHandler(new AnimalRegistrationHandler());
 
        grid.setWidget(8, 1, submitButton );
        grid.setWidget(9, 1, animalRecordInfo );
        vPanel.add(grid);
    }
    
    /**
     *  This is handler for recording the pet in the database. ( Makes a trip to the Server ).
     */
    class AnimalRegistrationHandler implements ClickHandler
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
                		MedicalRecordForm mrf = new MedicalRecordForm ( paoService, data );
                		vPanel.clear();
                		vPanel.add(mrf);
                	}
                }
            }
        }

        /**
         * Collect information entered in the UI and send it to the Server.
         */
		private String collectDataRecordAnimal() 
		{	
			
			if ( !FieldVerifier.isValidName (petName.getText()) ||
				 !FieldVerifier.isValidName (genderField.getText()) ||
				 !FieldVerifier.isValidName (breedField.getText()) ||
				 !FieldVerifier.isValidName (weightField.getText()) ||
				 !FieldVerifier.isValidName (colorField.getText()) ||
				 !FieldVerifier.isValidName (dobField.getValue().toString()) ||
				 !FieldVerifier.isValidName (petType.getText()) 
			   )
			{
				return "Invalid data please re-enter";
			}
			
			String errorCode = "Success";
			try
			{
				HashMap<String, String> petInformation = new HashMap<String, String>();
				petInformation.put("name", petName.getText());
				petInformation.put("gender",genderField.getText());
				petInformation.put("breed", breedField.getText());
				petInformation.put("weight", weightField.getText());
				petInformation.put("color", colorField.getText());
				petInformation.put("dob", dobField.getValue().toString());
				petInformation.put("type", petType.getText());
				petInformation.put("desc", briefDescField.getText());
				data = petInformation;
				if ( paoService != null )
				{
					paoService.recordAnimalByIntake(petInformation, new RecordAnimalByIntakeCallBackHandler());	 
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
        	animalRecordInfo.setText(result);
        }
    }
   }
