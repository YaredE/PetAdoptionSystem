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
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.datepicker.client.DateBox;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;
import edu.stthomas.seis771.team2.shared.FieldVerifier;

public class MedicalRecordForm extends Composite {

	public TextBox getPetID() {
		return petID;
	}

	public void setPetID(TextBox petID) {
		this.petID = petID;
	}



	public TextBox getComment() {
		return comment;
	}

	public void setComment(TextBox comment) {
		this.comment = comment;
	}

	public TextBox getOutsidecaredNeededComment() {
		return outsidecaredNeededComment;
	}

	public void setOutsidecaredNeededComment(TextBox outsidecaredNeededComment) {
		this.outsidecaredNeededComment = outsidecaredNeededComment;
	}

	private TextBox petID;
	private DateBox careDate;
	private TextBox comment;
	private TextBox outsidecaredNeededComment;
	private Button submitButton;
	
    /**
     * The response from the server.
     */
    private Label petMedicalInfo;

	private VerticalPanel vPanel;
	
    /**
     * This is for invoking PetAdoptionOrganizationServiceAsync.
     */
    private PetAdoptionOrganizationServiceAsync paoService;
    
	private HashMap<String, String> data = null;

	public MedicalRecordForm(PetAdoptionOrganizationServiceAsync _service,
			HashMap<String, String> _petInformation) 
	{
		paoService = _service;
		vPanel = new VerticalPanel();
		initWidget(vPanel);

		petID = new TextBox();
		String _petInfo = "";
		if ( _petInformation != null )
		{
			_petInfo = _petInformation.get("name") + _petInformation.get("type");
		}
		this.data = _petInformation;
		petID.setText(_petInfo);
		petID.setReadOnly(true);
		comment = new TextBox();
		
		DateTimeFormat dateFormat = DateTimeFormat.getFormat("MM/dd/yyyy");
		careDate = new DateBox();
		careDate.setFormat(new DateBox.DefaultFormat(dateFormat));
		careDate.getDatePicker().setYearArrowsVisible(true);
        
        
		petMedicalInfo = new Label();
		outsidecaredNeededComment = new TextBox();
		submitButton = new Button("Submit");
		submitButton.addClickHandler(new MedicalFormClickHandler());

		Grid grid = new Grid(6, 2);
		grid.setWidget(0, 0, new Label("Pet ID:"));
		grid.setWidget(0, 1, petID);

		grid.setWidget(1, 0, new Label("Care Date:"));
		grid.setWidget(1, 1, careDate);

		grid.setWidget(2, 0, new Label("Comment:"));
		grid.setWidget(2, 1, comment);

		grid.setWidget(3, 0, new Label("Outside care needed :"));
		grid.setWidget(3, 1, outsidecaredNeededComment);

		grid.setWidget(4, 1, submitButton);
		
		grid.setWidget(5, 1, petMedicalInfo);
		
		vPanel.add(grid);
	}

	class MedicalFormClickHandler implements ClickHandler {

		public void onClick(ClickEvent event) 
		{
			if (event.getSource() == submitButton) 
			{				
				String message = collectInfoAndSaveToDatabase();
				if ( message.contains("Success"))
				{
					
				}
			}
		}
	}

	public String collectInfoAndSaveToDatabase() 
	{	
		if ( !FieldVerifier.isValidName (petID.getText()) ||
			 !FieldVerifier.isValidName (careDate.getValue().toString()) ||
			 !FieldVerifier.isValidName (comment.getText()) ||
			 !FieldVerifier.isValidName (outsidecaredNeededComment.getText()) 
		   )
		{
			return "Invalid data please re-enter";
		}
		String errorCode = "Success";
		try
		{
			HashMap<String, String> petInformation = new HashMap<String, String>();
			if ( data != null )
			{
				petInformation.putAll(data);
			}
			petInformation.put("animalID", petID.getText());
			petInformation.put("careDate",careDate.getValue().toString());
			petInformation.put("comment", comment.getText());
			petInformation.put("outsidecaredNeededComment", outsidecaredNeededComment.getText());
			if ( paoService != null )
			{
				paoService.recordMedicalInformation(petInformation, new RecordMedicalInfoCallBackHandler());	 
			}
		}
		catch ( Exception ex )
		{
			errorCode = ex.getLocalizedMessage().toString();
		}			
		return errorCode;
	}
	
	class RecordMedicalInfoCallBackHandler  implements AsyncCallback<String> {

		public void onFailure(Throwable caught) 
		{
			petMedicalInfo.setText(caught.toString());
			
		}

		public void onSuccess(String result)
		{
			petMedicalInfo.setText(result);
		}
	}
}
