package design.pattern.observable;

import java.util.ArrayList;
import java.util.List;

import design.pattern.observer.Contact;

public class Personnes {

    private String pseudo;
    private boolean contamine;
    private List<Contact> relations;

    protected Personnes(String pseudo){
        this.pseudo = pseudo;
        this.contamine = false;
        this.relations = new ArrayList<>();
        
    }


}