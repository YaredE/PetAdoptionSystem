package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class AnimalForm extends Composite {
    private TextBox ANIMAL_ID;
    private TextBox NAME;
    private TextBox GENDER;
    private TextBox BREED;
    private TextBox WEIGHT;
    private TextBox COLOR;
    private TextBox DOB;
    private TextBox ANIMALTYPE_ID;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public AnimalForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.ANIMAL_ID = new TextBox();
        this.NAME = new TextBox();
        this.GENDER = new TextBox();
        this.BREED = new TextBox();
        this.WEIGHT = new TextBox();
        this.COLOR = new TextBox();
        this.DOB = new TextBox();
        this.ANIMALTYPE_ID = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("ANIMAL ID:"));
        vPanel.add(ANIMAL_ID);
        vPanel.add(new Label("NAME:"));
        vPanel.add(NAME);
        vPanel.add(new Label("GENDER:"));
        vPanel.add(GENDER);
        vPanel.add(new Label("BREED:"));
        vPanel.add(BREED);
        vPanel.add(new Label("WEIGHT:"));
        vPanel.add(WEIGHT);
        vPanel.add(new Label("COLOR:"));
        vPanel.add(COLOR);
        vPanel.add(new Label("DOB:"));
        vPanel.add(DOB);
        vPanel.add(new Label("ANIMAL TYPE ID:"));
        vPanel.add(ANIMALTYPE_ID);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);
    }

}
