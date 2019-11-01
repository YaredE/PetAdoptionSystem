package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class AbuseDetailsForm extends Composite {
    private TextBox ABUSE_ID;
    private TextBox RESCUE_ID;
    private TextBox DESCRIPTION;
    private TextBox EMPLOYEE_ID;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public AbuseDetailsForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.ABUSE_ID = new TextBox();
        this.RESCUE_ID = new TextBox();
        this.DESCRIPTION = new TextBox();
        this.EMPLOYEE_ID = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("ABUSE ID:"));
        vPanel.add(ABUSE_ID);
        vPanel.add(new Label("RESCUE ID:"));
        vPanel.add(RESCUE_ID);
        vPanel.add(new Label("DESCRIPTION:"));
        vPanel.add(DESCRIPTION);
        vPanel.add(new Label("EMPLOYEE_ID:"));
        vPanel.add(EMPLOYEE_ID);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);
    }

}
