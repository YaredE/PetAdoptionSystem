package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class IntakeForm extends Composite {
    private TextBox SUBMISSION_ID;
    private TextBox USER_ID;
    private TextBox ANIMAL_ID;
    private TextBox MEDICALRECORD_ID;
    private TextBox ANIMALRECORD_ID;
    private TextBox INTAKE_TYPE;
    private TextBox INTAKE_DATE;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public IntakeForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.SUBMISSION_ID = new TextBox();
        this.USER_ID = new TextBox();
        this.ANIMAL_ID = new TextBox();
        this.MEDICALRECORD_ID = new TextBox();
        this.ANIMALRECORD_ID = new TextBox();
        this.INTAKE_TYPE = new TextBox();
        this.INTAKE_DATE = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("SUBMISSION ID:"));
        vPanel.add(SUBMISSION_ID);
        vPanel.add(new Label("USER ID:"));
        vPanel.add(USER_ID);
        vPanel.add(new Label("ANIMAL ID:"));
        vPanel.add(ANIMAL_ID);
        vPanel.add(new Label("MEDICAL RECORD ID:"));
        vPanel.add(MEDICALRECORD_ID);
        vPanel.add(new Label("ANIMALRECORD ID:"));
        vPanel.add(ANIMALRECORD_ID);
        vPanel.add(new Label("INTAKE TYPE:"));
        vPanel.add(INTAKE_TYPE);
        vPanel.add(new Label("INTAKE DATE:"));
        vPanel.add(INTAKE_DATE);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);
    }

}
