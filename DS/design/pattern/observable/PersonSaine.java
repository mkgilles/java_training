package design.pattern.observable;

import java.util.ArrayList;

import design.patter.strategy.IStrategySaine;

public class PersonSaine extends Personne implements Context {
	

	public PersonSaine(String pseudo) {
		this.pseudo = pseudo;
		this.etat = "sain";
		this.formes = new ArrayList<Observateur>();
		this.strategy = new IStrategySaine();
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
