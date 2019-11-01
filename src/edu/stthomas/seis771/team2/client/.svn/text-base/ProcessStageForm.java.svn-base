package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class ProcessStageForm extends Composite {
    private TextBox PROCESS_ID;
    private TextBox EMPLOYEE_ID;
    private TextBox REQUESTED_DATE;
    private TextBox COMMENTS;
    private TextBox LASTMODIFIED_DATE;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public ProcessStageForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.PROCESS_ID = new TextBox();
        this.EMPLOYEE_ID = new TextBox();
        this.REQUESTED_DATE = new TextBox();
        this.COMMENTS = new TextBox();
        this.LASTMODIFIED_DATE = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("PROCESS ID:"));
        vPanel.add(PROCESS_ID);
        vPanel.add(new Label("EMPLOYEE ID:"));
        vPanel.add(EMPLOYEE_ID);
        vPanel.add(new Label("REQUESTED DATE:"));
        vPanel.add(REQUESTED_DATE);
        vPanel.add(new Label("COMMENTS:"));
        vPanel.add(COMMENTS);
        vPanel.add(new Label("LASTMODIFIED DATE:"));
        vPanel.add(LASTMODIFIED_DATE);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);
    }

}
