package design.pattern.observable;

import java.util.ArrayList;
import java.util.List;

public class Groupe implements Observable {

    private String name;
    private String etat;
    private List<Membre> relations = new ArrayList<>();

    public Groupe(String name) {
        this.name = name;
    }



    @Override
    public void addPerson(Membre me) {
       this.relations.add(me);
        
    }

    @Override
    public void removePerson(Membre me) {
        this.relations.remove(me);
        
    }

    @Override
    public void notifyPerson() {
        for (Membre me : relations) {
            me.update(this.getState());
        }
        
    }

    public String getName(){
        return name;
    }

  public String getState(){
      return etat;
  }


}