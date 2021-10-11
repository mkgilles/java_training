package design.pattern.observable;

public interface Context {
	 void addObservateur(Observateur o);
	 void removeObservateur(Observateur o);
	 void notifyOberservateur();

}
