package edu.stthomas.seis771.team2.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationService;
import edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PetAdoptionSystemV0_2 implements EntryPoint {

    /**
     * Create a remote service proxy to talk to the server-side Greeting
     * service.
     */
    private final PetAdoptionOrganizationServiceAsync paoService = GWT
    .create(PetAdoptionOrganizationService.class);

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        MainView main = new MainView(paoService);
        RootPanel.get("myapp").add(main);
    }
}
