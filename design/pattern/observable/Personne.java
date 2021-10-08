package design.pattern.observable;

public class Personne implements Membre {

    private String pseudo;
    private String state;

    Personne(String pseudo) {
        this.pseudo = pseudo;
    }

   /**
    * public void etatContamtination(String etat)){
     *   this.etat = etat;
        notifyPerson();
    *}

    *  */ 
    private void notifyPerson() {

    }

    public void addRelation(Groupe g) {
        g.addPerson(this);
        System.out.println("Le membre " + this.pseudo + "a été ajouté au groupe " + g.getName() + "\n");
      

    }

    public void removeRelation(Groupe g) {
        g.removePerson(this);
        System.out.println("Le membre " + this.pseudo + "a été supprimé du groupe " + g.getName() + "\n");

    }
    
    @Override
    public void update(String state) {
        this.state = state;
            System.out.println("\n"+ this.pseudo +" est contaminé.\n");

    }


}