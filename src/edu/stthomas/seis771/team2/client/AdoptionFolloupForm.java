package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class AdoptionFolloupForm extends Composite {
    private TextBox ADOPTIONFOLLOWUP_ID;
    private TextBox REQUEST_ID;
    private TextBox FOLLOWUP_DATE;
    private TextBox FOLLOWUP_NEEDED;
    private TextBox COMMENT;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public AdoptionFolloupForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.ADOPTIONFOLLOWUP_ID = new TextBox();
        this.REQUEST_ID = new TextBox();
        this.FOLLOWUP_DATE = new TextBox();
        this.FOLLOWUP_NEEDED = new TextBox();
        this.COMMENT = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("ADOPTION FOLLOWUP ID:"));
        vPanel.add(ADOPTIONFOLLOWUP_ID);
        vPanel.add(new Label("REQUEST ID:"));
        vPanel.add(REQUEST_ID);
        vPanel.add(new Label("FOLLOWUP DATE:"));
        vPanel.add(FOLLOWUP_DATE);
        vPanel.add(new Label("FOLLOWUP NEEDED:"));
        vPanel.add(FOLLOWUP_NEEDED);
        vPanel.add(new Label("COMMENT:"));
        vPanel.add(COMMENT);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);
    }

}
