package edu.stthomas.seis771.team2.client;

import java.util.ArrayList;
import java.util.HashMap;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class MatcherPage extends Composite {

	/**
	 *  The requested text.
	 */
	private TextArea requestedText;
	
	/**
	 * The request Date.
	 */
	private TextBox requestedDate;
	
    
    /**
     * The vertical panel.
     */
    private VerticalPanel vPanel;
    
    
    /**
     *  The submit button
     */
    private Button submitButton;
    
    /**
     * The matching records message.
     */
    private Label matchIngRecords;
    
    /**
     * Matching records.
     */
    private ArrayList<String> data;
    
    
    private PetAdoptionOrganizationServiceAsync paoService;
	
	/**
	 * 
	 * @param get_paoservice
	 */
	public MatcherPage(PetAdoptionOrganizationServiceAsync _paoservice)
	{
		paoService = _paoservice;
    	vPanel = new VerticalPanel();
        initWidget(vPanel);
        
		requestedText = new TextArea();
		requestedDate = new TextBox();
		submitButton = new Button("Submit"); 
		submitButton.addClickHandler(new MatchRequestHandler());
		
		matchIngRecords = new Label();
		
		data = new ArrayList<String>();
		
		Grid grid = new Grid(4, 2);
		grid.setWidget(0, 0, new Label("Requested match criteria:"));
		grid.setWidget(0, 1, requestedText);

		grid.setWidget(1, 0, new Label("Requested Date:"));
		grid.setWidget(1, 1, requestedDate);
		
        grid.setWidget(2, 1, submitButton );
        grid.setWidget(3, 1, matchIngRecords );
        vPanel.add(grid);
	}
	
	  /**
     *  This is handler for recording the pet in the database. ( Makes a trip to the Server ).
     */
    class MatchRequestHandler implements ClickHandler
    {
        

		/**
         * Fired when the user clicks on the submitButton.
         */
        public void onClick(ClickEvent event) 
        {
            if (event.getSource() == submitButton) 
            {
                String message = collectDataSearchForMatch();
                if ( message != null && message.contains("Success") )
                {// Ask for more information ... 
                 // Is there any medical record associated for this animal.*\
                	if ( data !=null  && data.size() > 1 )
                	{
                		vPanel.clear();
                		matchIngRecords  = new Label();
                		matchIngRecords.setText("Your adoption request has been received we will contact you with the best matches!");
                		vPanel.add(matchIngRecords);
                	}
                }
            }
        }
    }

	public String collectDataSearchForMatch()
	{
		String errorCode = "Success";
		try
		{
			HashMap<String, String> petInformation = new HashMap<String, String>();
			petInformation.put("name", requestedText.getText());
			petInformation.put("gender",requestedDate.getText());
			if ( paoService != null )
			{
				paoService.makeAMatchRequest(petInformation, new MatchingRecordCallBackHandler());	 
			}
		}
		catch ( Exception ex )
		{
			errorCode = ex.getLocalizedMessage().toString();
		}			
		return  errorCode;
	}
	
	/**
     * <p>
     *  Handle what is going to happen onSuccess and OnFailure.
     * </p>
     *
     * @author user
     *
     */
    private class MatchingRecordCallBackHandler implements AsyncCallback<String> {

        public void onFailure(Throwable caught) 
        {
        	matchIngRecords.setText(caught.toString());
        }

        public void onSuccess(String result)
        {
        	if ( result != null  )
        	{
        		matchIngRecords.setText(result);
        	}
        }
    }
}