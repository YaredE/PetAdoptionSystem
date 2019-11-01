package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class FacilityRequestForm extends Composite {
    private TextBox FACILITYREQUEST_ID;
    private TextBox EMPLOYEE_ID;
    private TextBox PROCESS_ID;
    private TextBox REQUEST_DATE;
    private TextBox COMPLETE_DATE;
    private TextBox STATUS_ID;
    private TextBox COMMENTS;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public FacilityRequestForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.FACILITYREQUEST_ID = new TextBox();
        this.EMPLOYEE_ID = new TextBox();
        this.PROCESS_ID = new TextBox();
        this.REQUEST_DATE = new TextBox();
        this.COMPLETE_DATE = new TextBox();
        this.STATUS_ID = new TextBox();
        this.COMMENTS = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("FACILITY REQUEST ID:"));
        vPanel.add(FACILITYREQUEST_ID);
        vPanel.add(new Label("EMPLOYEE ID:"));
        vPanel.add(EMPLOYEE_ID);
        vPanel.add(new Label("PROCESS ID:"));
        vPanel.add(PROCESS_ID);
        vPanel.add(new Label("REQUEST DATE:"));
        vPanel.add(REQUEST_DATE);
        vPanel.add(new Label("COMPLETE DATE:"));
        vPanel.add(COMPLETE_DATE);
        vPanel.add(new Label("STATUS ID:"));
        vPanel.add(STATUS_ID);
        vPanel.add(new Label("COMMENTS:"));
        vPanel.add(COMMENTS);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);
    }

}
