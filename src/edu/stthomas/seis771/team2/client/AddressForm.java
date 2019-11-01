package edu.stthomas.seis771.team2.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

public class AddressForm extends Composite {
    private TextBox ADDRESS_ID;
    private TextBox STREET;
    private TextBox APT_NO;
    private TextBox CITY;
    private TextBox ZIP;
    private Label lastUpdatedLabel = new Label();

    private Button Addnew;
    private Button Delold;

    private VerticalPanel vPanel;
    private HorizontalPanel hPanel;

    public AddressForm(boolean showLoginPage,
            PetAdoptionOrganizationServiceAsync _service) {
        vPanel = new VerticalPanel();
        initWidget(vPanel);

        hPanel = new HorizontalPanel();

        this.ADDRESS_ID = new TextBox();
        this.STREET = new TextBox();
        this.APT_NO = new TextBox();
        this.CITY = new TextBox();
        this.ZIP = new TextBox();

        this.Addnew = new Button("ADD");
        this.Delold = new Button("REMOVE");

        vPanel.add(new Label("ADDRESS ID:"));
        vPanel.add(ADDRESS_ID);
        vPanel.add(new Label("STREET:"));
        vPanel.add(STREET);
        vPanel.add(new Label("APT NO:"));
        vPanel.add(APT_NO);
        vPanel.add(new Label("CITY:"));
        vPanel.add(CITY);
        vPanel.add(new Label("ZIP:"));
        vPanel.add(ZIP);
        hPanel.add(new Label("Insert:"));
        hPanel.add(Addnew);
        hPanel.add(new Label("Delete:"));
        hPanel.add(Delold);
        vPanel.add(hPanel);
        vPanel.add(lastUpdatedLabel);

    }

}
