package n3exercici1;

public class Person {
    private String name;
    private String surname;
    private String dni;

    public Person(String name, String surname, String dni) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDni() {
        return dni;
    }
}
