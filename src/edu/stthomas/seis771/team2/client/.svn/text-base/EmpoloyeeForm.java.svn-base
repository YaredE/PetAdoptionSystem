package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class EmpoloyeeForm extends Composite {
    private TextBox EMPLOYEE_ID;
    private TextBox EMPLOYEE_TYPE;
    private TextBox USER_LEVEL;
    private TextBox USER_ID;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public EmpoloyeeForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.EMPLOYEE_ID = new TextBox();
        this.EMPLOYEE_TYPE = new TextBox();
        this.USER_LEVEL = new TextBox();
        this.USER_ID = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("EMPLOYEE ID:"));
        vPanel.add(EMPLOYEE_ID);
        vPanel.add(new Label("EMPLOYEE TYPE:"));
        vPanel.add(EMPLOYEE_TYPE);
        vPanel.add(new Label("USER LEVEL:"));
        vPanel.add(USER_LEVEL);
        vPanel.add(new Label("USER ID:"));
        vPanel.add(USER_ID);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);
    }
}
