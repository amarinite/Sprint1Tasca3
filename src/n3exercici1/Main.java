package n3exercici1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        int option = 0;
        String answer = "";

        csvToPersonsArray(persons,"test.csv");

        do {
            System.out.println("1.- Add person.\n" +
                    "2.- Show persons sorted by name (A-Z).\n" +
                    "3.- Show persons sorted by name (Z-A).\n" +
                    "4.- Show persons sorted by surname (A-Z).\n" +
                    "5.- Show persons sorted by surname (Z-A).\n" +
                    "6.- Show persons sorted by DNI (1-9).\n" +
                    "7.- Show persons sorted by DNI (9-1).\n" +
                    "0.- Exit.");
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    addPerson(persons);
                    answer = "Person added successfully";
                    break;
                case 2:
                    persons.sort(new PersonCompNameAsc());
                    answer = printPersons(persons);
                    break;
                case 3:
                    persons.sort(new PersonCompNameDesc());
                    answer = printPersons(persons);
                    break;
                case 4:
                    persons.sort(new PersonCompSurnameAsc());
                    answer = printPersons(persons);
                    break;
                case 5:
                    persons.sort(new PersonCompSurnameDesc());
                    answer = printPersons(persons);
                    break;
                case 6:
                    persons.sort(new PersonCompDniAsc());
                    answer = printPersons(persons);
                    break;
                case 7:
                    persons.sort(new PersonCompDniDesc());
                    answer = printPersons(persons);
                    break;
                case 0:
                    answer = "Closing program. Thank you.";
            }
            System.out.println(answer);
        } while (option != 0);
    }

    public static void csvToPersonsArray(ArrayList<Person> persons, String file) {
        String line = "";
        BufferedReader reader = null;

          try {
              reader = new BufferedReader(new FileReader(file));
              while((line = reader.readLine()) != null) {
                  String[] row = line.split(",");
                  Person anotherPerson = new Person(row[0], row[1], row[2]);
                  persons.add(anotherPerson);
              }
          } catch (IOException e) {
              e.printStackTrace();
          }
    }

    public static String printPersons(ArrayList<Person> persons) {
        String personsString = "___Name___ ____Surnamme___ __NIF__ \n";
        for (Person p : persons) {
            personsString += p.getName() + "     " + p.getSurname() + "     " + p.getDni() + "\n";
        }
        return personsString;
    }

    public static void addPerson(ArrayList<Person> persons) {
        String name = "";
        String surname = "";
        String dni = "";

        System.out.println("Name: ");
        name = scanner.next();
        System.out.println("Surname: ");
        surname = scanner.next();
        System.out.println("DNI: ");
        dni = scanner.next();

        Person newPerson = new Person(name, surname, dni);
        persons.add(newPerson);
    }
}
