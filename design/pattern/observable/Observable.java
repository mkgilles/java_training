package design.pattern.observable;

import design.pattern.observer.Contact;

public interface Observable {
    public void addPerson(Contact c);

    public void removePerson(Contact c);

    public void notifyPerson();

}
