package edu.stthomas.seis771.team2.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class RegistrationPage extends Composite
{
	
	private Button login;
	
	/**
	 * The First Name field.
	 */
	private TextBox fnameField;

	/**
	 * The last name field
	 */
	private TextBox lnameField;

	/**
	 * The user name field
	 */
	private TextBox unameField;

	/**
	 * The password field.
	 */
	private PasswordTextBox passwordField;
	
	
	private TextBox emailAddress;

	/**
	 * The street address field
	 */
	private TextBox streetAddressField;

	/**
	 * The city of the address.
	 */
	private TextBox cityAddressField;

	/**
	 * The ZIP for the address
	 */
	private TextBox zipAddressField;
	
	
	/**
	 * The button for handling the registration event.
	 */
	private Button registrationButton;
	
	
	/**
	 * The vertical panel for the whole thing(the main stuff).
	 */
	private VerticalPanel vPanel;
	
	
	/**
	 * <p>
	 *  The result from actually trying to register from the server.
	 *  </p>
	 */
	private Label registrationFromServer;

	/**
	 * The registration event handler.
	 */
	private ClickHandler handler;
	
	
	/**
	 * This is for invoking PetAdoptionOrganizationServiceAsync.
	 */
	private PetAdoptionOrganizationServiceAsync paoService;
	
	
	public RegistrationPage (PetAdoptionOrganizationServiceAsync _paoService)
	{
		this.paoService = _paoService;
		vPanel = new VerticalPanel();
		initWidget(vPanel);
		
		fnameField = new TextBox();
		lnameField = new TextBox();
		unameField = new TextBox();
		passwordField = new PasswordTextBox();
		streetAddressField = new TextBox();
		cityAddressField = new TextBox();
		zipAddressField = new TextBox();
		emailAddress =  new TextBox();
		
		login = new Button("Login");
		login.addClickHandler( new RegistrationHandler());
		
		vPanel.add (new Label("First Name:") );
		vPanel.add(fnameField);
		vPanel.add (new Label("Last Name:") );
		vPanel.add(lnameField);
		vPanel.add (new Label("User Name:") );
		vPanel.add(unameField);
		vPanel.add (new Label("Password:") );
		vPanel.add(passwordField);
		vPanel.add (new Label("Email Address:") );
		vPanel.add(emailAddress);
		vPanel.add (new Label("Street Address:") );
		vPanel.add(streetAddressField);
		vPanel.add (new Label("City:") );
		vPanel.add(cityAddressField);
		vPanel.add (new Label("Zip:") );
		vPanel.add(zipAddressField);
		
		registrationButton = new Button (" Register ");
		handler = new RegistrationHandler();
		registrationButton.addClickHandler(handler);
		
		registrationFromServer = new Label("       ");
		
		vPanel.add(registrationFromServer);
		
		vPanel.add(registrationButton);
		
		vPanel.add(login);
		
	
				
	}


	public TextBox getFnameField() {
		return fnameField;
	}


	public void setFnameField(TextBox fnameField) {
		this.fnameField = fnameField;
	}


	public TextBox getLnameField() {
		return lnameField;
	}


	public void setLnameField(TextBox lnameField) {
		this.lnameField = lnameField;
	}


	public TextBox getUnameField() {
		return unameField;
	}


	public void setUnameField(TextBox unameField) {
		this.unameField = unameField;
	}


	public PasswordTextBox getPasswordField() {
		return passwordField;
	}


	public void setPasswordField(PasswordTextBox passwordField) {
		this.passwordField = passwordField;
	}


	public TextBox getStreetAddressField() {
		return streetAddressField;
	}


	public void setStreetAddressField(TextBox streetAddressField) {
		this.streetAddressField = streetAddressField;
	}


	public TextBox getCityAddressField() {
		return cityAddressField;
	}


	public void setCityAddressField(TextBox cityAddressField) {
		this.cityAddressField = cityAddressField;
	}


	public TextBox getZipAddressField() {
		return zipAddressField;
	}


	public void setZipAddressField(TextBox zipAddressField) {
		this.zipAddressField = zipAddressField;
	}
	
	
	class RegistrationHandler implements ClickHandler, KeyUpHandler {
	
		/**
		 * Fired when the user clicks on the sendButton.
		 */
		public void onClick(ClickEvent event)
		{
			if ( event.getSource() == login )
			{
				LoginPage lPage = new LoginPage (true, paoService);
				vPanel.clear();
				vPanel.add(lPage);
			}
			else
			{
				collectDataAndSendToServer();
			}
		}

		/**
		 * Fired when the user types in the nameField.
		 */
		public void onKeyUp(KeyUpEvent event)
		{
			if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER)
			{
				if ( registrationFromServer != null )
				{
					collectDataAndSendToServer ();
				}
			}
		}
	}


	public void collectDataAndSendToServer()
	{
		String zip = this.getZipAddressField().getText();
		String lname= this.getLnameField().getText();
		String fname =this.getFnameField().getText();
		String userName = this.getUnameField().getText();
		String city = this.getCityAddressField().getText();
		String address = this.getStreetAddressField().getText();
		String password = this.getPasswordField().getText();
		String emailAddress = this.emailAddress.getText();
		this.paoService.register(fname, lname, userName, password, emailAddress, address, city, zip, new RegistrationCallBackHandler());
	}
	
	/**
	 * <p>  
	 *  Handle what is going to happen onSuccess and OnFailure.
	 *  </p>
	 * 
	 * @author Yared
	 *
	 */
	private class RegistrationCallBackHandler implements AsyncCallback<String>
	{

		public void onFailure(Throwable caught) 
		{	
			registrationFromServer.setText(caught.toString());
		}

		public void onSuccess(String result)
		{	
			registrationFromServer.setText(result);
			if ( result != null && result.contains("success") )
			{	
				LoginPage lPage = new LoginPage (true, paoService);
				vPanel.clear();
				vPanel.add(lPage);
			}
		}
	}
}
