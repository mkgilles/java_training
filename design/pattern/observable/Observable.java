package design.pattern.observable;

public interface Observable {
    public void addPerson(Membre me);

    public void removePerson(Membre me);

    public void notifyPerson();

}
