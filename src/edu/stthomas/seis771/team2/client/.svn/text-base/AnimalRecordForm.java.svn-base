package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class AnimalRecordForm extends Composite {
    private TextBox ANIMAL_ID;
    private TextBox PROCESS_ID;
    private TextBox SUBMISSION_ID;
    private TextBox REQUEST_ID;
    private TextBox FACILITY_ID;
    private TextBox ARRIVAL_DATE;
    private TextBox ANIMAL_CONDITION;
    private TextBox DEPARTURE_DATE;
    private TextBox EMPLOYEE_ID;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public AnimalRecordForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.ANIMAL_ID = new TextBox();
        this.PROCESS_ID = new TextBox();
        this.SUBMISSION_ID = new TextBox();
        this.REQUEST_ID = new TextBox();
        this.FACILITY_ID = new TextBox();
        this.ARRIVAL_DATE = new TextBox();
        this.ANIMAL_CONDITION = new TextBox();
        this.DEPARTURE_DATE = new TextBox();
        this.EMPLOYEE_ID = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("ANIMAL ID:"));
        vPanel.add(ANIMAL_ID);
        vPanel.add(new Label("PROCESS ID:"));
        vPanel.add(PROCESS_ID);
        vPanel.add(new Label("SUBMISSION ID:"));
        vPanel.add(SUBMISSION_ID);
        vPanel.add(new Label("REQUEST ID:"));
        vPanel.add(REQUEST_ID);
        vPanel.add(new Label("FACILITY ID:"));
        vPanel.add(FACILITY_ID);
        vPanel.add(new Label("ARRIVAL DATE:"));
        vPanel.add(ARRIVAL_DATE);
        vPanel.add(new Label("ANIMAL CONDITION:"));
        vPanel.add(ANIMAL_CONDITION);
        vPanel.add(new Label("DEPARTURE DATE:"));
        vPanel.add(DEPARTURE_DATE);
        vPanel.add(new Label("EMPLOYEE ID:"));
        vPanel.add(EMPLOYEE_ID);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);
    }
}
