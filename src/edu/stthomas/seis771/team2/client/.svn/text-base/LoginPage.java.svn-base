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

public class LoginPage extends Composite {

    private TextBox username;

    private PasswordTextBox password;

    private Button loginButton;

    private Label lblLogin;

    private PetAdoptionOrganizationServiceAsync service;

    private VerticalPanel vPanel;

    public LoginPage(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        this.service = _service;
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        username = new TextBox();
        password = new PasswordTextBox();
        loginButton = new Button("Login");
        

        loginButton.addClickHandler(new LoginHandler());

        lblLogin = new Label("-------");

        vPanel.add(new Label("User Name:"));
        vPanel.add(username);
        vPanel.add(new Label("Password:"));
        vPanel.add(password);
        vPanel.add(lblLogin);
        vPanel.add(loginButton);
        
    }

    class LoginHandler implements ClickHandler  {

        /**
         * Fired when the user clicks on the sendButton.
         */
        public void onClick(ClickEvent event) {
            if (event.getSource() == loginButton ) {
                authenticateUser();
            }
        }

        /**
         * Fired when the user types in the nameField.
         */
        public void onKeyUp(KeyUpEvent event) {
            if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
                authenticateUser();
            }
        }
    }

    public void authenticateUser() {
          this.service.authenticate(username.getText(), password.getText(),
                new LoginCallBackHandler());
    }

    /**
     * <p>
     * Handle what is going to happen onSuccess and OnFailure.
     * </p>
     *
     * @author Yared
     *
     */
    private class LoginCallBackHandler implements AsyncCallback<String> {

        public void onFailure(Throwable caught) {
            lblLogin.setText(caught.toString());
        }

        public void onSuccess(String result) {
            lblLogin.setText(result);
        }
    }

}