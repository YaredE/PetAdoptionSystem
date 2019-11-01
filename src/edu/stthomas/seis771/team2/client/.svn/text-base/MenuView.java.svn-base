package edu.stthomas.seis771.team2.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;

public class MenuView extends Composite {
    private HorizontalPanel hPanel = new HorizontalPanel();
    private MainView main;

    public MenuView(MainView main) {
        initWidget(this.hPanel);
        this.main = main;

        Button Btn1 = new Button("Login");
        Btn1.addClickHandler(new Btn1ClickHandler());
        Button Btn2 = new Button("Register");
        Btn2.addClickHandler(new Btn2ClickHandler());
        Button Btn3 = new Button("Check In");
        Btn3.addClickHandler(new Btn3ClickHandler());
        Button Btn4 = new Button("Check Out");
        Btn4.addClickHandler(new Btn4ClickHandler());
        Button Btn5 = new Button("Transfer");
        Btn5.addClickHandler(new Btn5ClickHandler());
        Button Btn6 = new Button("Rescue");
        Btn6.addClickHandler(new Btn6ClickHandler());
        Button Btn7 = new Button("Follow Up");
        Btn7.addClickHandler(new Btn7ClickHandler());
        Button Btn9 = new Button("Match");
        Btn9.addClickHandler(new Btn9ClickHandler());
        Button Btn8 = new Button("Donate");
        Btn8.addClickHandler(new Btn8ClickHandler());
        this.hPanel.add(Btn1);
        this.hPanel.add(Btn2);
        this.hPanel.add(Btn3);
        this.hPanel.add(Btn4);
        this.hPanel.add(Btn5);
        this.hPanel.add(Btn6);
        this.hPanel.add(Btn7);
        this.hPanel.add(Btn9);
        this.hPanel.add(Btn8);
    }

    private class Btn1ClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            main.openpage1();
        }
    }

    private class Btn2ClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            main.openpage2();
        }
    }

    private class Btn3ClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            main.openpage3();
        }
    }

    private class Btn4ClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            main.openpage4();
        }
    }

    private class Btn5ClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            main.openpage5();
        }
    }

    private class Btn6ClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            main.openpage6();
        }
    }

    private class Btn7ClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            main.openpage7();
        }
    }

    private class Btn8ClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            main.openpage8();
        }
    }
    
    private class Btn9ClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            main.openpage9();
        }
    }

}
