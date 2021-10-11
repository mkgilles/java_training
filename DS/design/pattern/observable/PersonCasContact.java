package design.pattern.observable;

import java.util.ArrayList;

import design.patter.strategy.IStrategyCasContact;

public class PersonCasContact extends Personne implements Context {

	public PersonCasContact(String pseudo) {
		this.pseudo = pseudo;
		this.etat = "cascontact";
		this.formes = new ArrayList<Observateur>();
		this.strategy = new IStrategyCasContact();
	}

	@Override
	public void addObservateur(Observateur o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObservateur(Observateur o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyOberservateur() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void affichageEtat() {
		// TODO Auto-generated method stub
		
	}

}
