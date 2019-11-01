package edu.stthomas.seis771.team2.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationService;
import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;


public class MainView extends Composite {
    private final PetAdoptionOrganizationServiceAsync paoService = GWT
            .create(PetAdoptionOrganizationService.class);
    private VerticalPanel vPanel = new VerticalPanel();
    private VerticalPanel cPanel;
    
    private PetAdoptionOrganizationServiceAsync _paoservice;

    public MainView(PetAdoptionOrganizationServiceAsync service)
    {
        initWidget(this.vPanel);
        this.vPanel.setBorderWidth(0);
        
        this.set_paoservice(service);
        

        Image head = new Image("/images/header.png");
        head.setWidth("600px");
        Image foot = new Image("/images/footer.png");
        foot.setWidth("600px");
        Image dog = new Image("/images/myDog.png");
        dog.setWidth("600px");

        MenuView menu = new MenuView(this);

        this.cPanel = new VerticalPanel();
        Label txtLbl1 = new Label("Welcome to PAO");

        vPanel.add(head);
        this.vPanel.add(menu);
        this.vPanel.add(cPanel);
        this.vPanel.add(txtLbl1);
        this.vPanel.add(dog);
        vPanel.add(foot);

    }

    /**
     * Open page the login page.
     */
    public void openpage1()
    {
        this.cPanel.clear();

        LoginPage pageone = new LoginPage(false, this.get_paoservice());

        this.cPanel.add(pageone);
    }

    public void openpage2() {
        this.cPanel.clear();

        RegistrationPage pagetwo = new RegistrationPage(this.get_paoservice());

        this.cPanel.add(pagetwo);
    }

    public void openpage4() {
        this.cPanel.clear();
        AdoptionRequestPage pagethree = new AdoptionRequestPage( this.get_paoservice());
        this.cPanel.add(pagethree);
    }

    public void openpage3() {
        this.cPanel.clear();
        IntakeSubmissionPage pagefour = new IntakeSubmissionPage(this.get_paoservice());
        this.cPanel.add(pagefour);
    }

    public void openpage5() {
        this.cPanel.clear();
        AnimalRecordForm pagefive = new AnimalRecordForm(false, this.get_paoservice());
        this.cPanel.add(pagefive);
    }

    public void openpage6() {
        this.cPanel.clear();
        IntakeSubmissionPage pagefive = new IntakeSubmissionPage(this.get_paoservice());
        this.cPanel.add(pagefive);
    }

    public void openpage7() {
        this.cPanel.clear();
        FacilityRequestForm pagefive = new FacilityRequestForm(false, this.get_paoservice());
        this.cPanel.add(pagefive);
    }

    public void openpage8() {
        this.cPanel.clear();
        DonationRecordForm pagefive = new DonationRecordForm(false, this.get_paoservice());
        this.cPanel.add(pagefive);
    }

	/**
	 * @return the _paoservice
	 */
	public PetAdoptionOrganizationServiceAsync get_paoservice()
	{
		return _paoservice;
	}

	/**
	 * @param _paoservice the _paoservice to set
	 */
	public void set_paoservice(PetAdoptionOrganizationServiceAsync _paoservice) {
		this._paoservice = _paoservice;
	}

	public void openpage9()
	{
		  this.cPanel.clear();
		  MatcherPage pagefive = new MatcherPage(this.get_paoservice());
		  this.cPanel.add(pagefive);
	}

}
