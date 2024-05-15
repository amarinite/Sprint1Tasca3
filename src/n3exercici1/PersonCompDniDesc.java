package n3exercici1;

import java.util.Comparator;

public class PersonCompDniDesc implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p2.getDni().compareTo(p1.getDni());
    }
}

