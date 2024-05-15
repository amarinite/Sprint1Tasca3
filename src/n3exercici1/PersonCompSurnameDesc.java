package n3exercici1;

import java.util.Comparator;

public class PersonCompSurnameDesc implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p2.getSurname().compareTo(p1.getSurname());
    }
}

