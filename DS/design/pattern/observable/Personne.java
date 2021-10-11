package design.pattern.observable;

import java.util.List;

import design.patter.strategy.IStrategy;

public abstract class Personne {
	
	protected String pseudo;
	protected String etat;
	protected List <Observateur> formes;
	protected IStrategy strategy;
	
	public abstract void affichageEtat();

}
