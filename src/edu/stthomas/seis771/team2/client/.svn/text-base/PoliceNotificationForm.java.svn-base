package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class PoliceNotificationForm extends Composite {
    private TextBox POLICE_NOTIFICATION_ID;
    private TextBox ABUSE_ID;
    private TextBox POLICE_ID;
    private TextBox NOTIFICATION_DATE;
    private TextBox DETAILS;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public PoliceNotificationForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.POLICE_NOTIFICATION_ID = new TextBox();
        this.ABUSE_ID = new TextBox();
        this.POLICE_ID = new TextBox();
        this.NOTIFICATION_DATE = new TextBox();
        this.DETAILS = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("POLICE NOTIFICATION ID:"));
        vPanel.add(POLICE_NOTIFICATION_ID);
        vPanel.add(new Label("ABUSE ID:"));
        vPanel.add(ABUSE_ID);
        vPanel.add(new Label("POLICE_ID:"));
        vPanel.add(POLICE_ID);
        vPanel.add(new Label("NOTIFICATION DATE:"));
        vPanel.add(NOTIFICATION_DATE);
        vPanel.add(new Label("DETAILS:"));
        vPanel.add(DETAILS);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);
    }

}
