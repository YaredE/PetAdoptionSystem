package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class DonationRecordForm extends Composite {
    private TextBox DONATIONRECORD_ID;
    private TextBox AMOUNT;
    private TextBox DONATION_DATE;
    private TextBox ENCRYPTEDBANK_INFO;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public DonationRecordForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.DONATIONRECORD_ID = new TextBox();
        this.AMOUNT = new TextBox();
        this.DONATION_DATE = new TextBox();
        this.ENCRYPTEDBANK_INFO = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("DONATION RECORD ID:"));
        vPanel.add(DONATIONRECORD_ID);
        vPanel.add(new Label("AMOUNT:"));
        vPanel.add(AMOUNT);
        vPanel.add(new Label("DONATION DATE:"));
        vPanel.add(DONATION_DATE);
        vPanel.add(new Label("ENCRYPTEDBANK INFO:"));
        vPanel.add(ENCRYPTEDBANK_INFO);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);
    }

}
