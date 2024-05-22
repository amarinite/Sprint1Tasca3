package n3exercici1;

import java.util.Comparator;

public class PersonComp {
    static Comparator<Person> nameAsc() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
    }

    static Comparator<Person> nameDesc() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.getName().compareTo(p1.getName());
            }
        };
    }

    static Comparator<Person> surnameAsc() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getSurname().compareTo(p2.getSurname());
            }
        };
    }

    static Comparator<Person> surnameDesc() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.getSurname().compareTo(p1.getSurname());
            }
        };
    }

    static Comparator<Person> dniAsc() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getDni().compareTo(p2.getDni());
            }
        };
    }

    static Comparator<Person> dniDesc() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.getDni().compareTo(p1.getDni());
            }
        };
    }
}
