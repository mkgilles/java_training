package design.pattern.observable;

import java.util.ArrayList;
import java.util.List;

import design.pattern.observer.Contact;

public class Personsaines extends Personnes {
    private String pseudo;
    private boolean contamine;
    private List<Contact> relations = new ArrayList<>();

  
    @Override
    public void addPerson(Contact c) {
        this.relations.add(c);
        
    }

    public boolean isContamine() {
        return contamine;
    }

    public void setContamine(boolean contamine) {
        this.contamine = contamine;
        //this.notif
    }

    public String getPseudo() {
        return pseudo;
    }

    @Override
    public void removePerson(Contact c) {
      for Contact c : relations
    
    }

    public Personsaines() {
    }

 
    @Override
    public void notifyPerson() {
       for Contact c : relations{
            c.update(this);
       }
        
    }

    @Override
    public void update(Personnes person) {
        
        
    }

      
}
