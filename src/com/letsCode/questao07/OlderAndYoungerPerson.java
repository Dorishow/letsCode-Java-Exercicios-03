package com.letsCode.questao07;

import com.letsCode.utils.InputScanner;

public class OlderAndYoungerPerson {
    public static void main(String[] args) {
        Person[] arrayOfPeople = new Person[5];
        setPersonFromInputToArray(arrayOfPeople);

        Person olderOneOnArray = getOlderPersonOfArray(arrayOfPeople);
        Person youngestOneOnArray = getYoungerPersonOfArray(arrayOfPeople);

        int ageMedia = (olderOneOnArray.age + youngestOneOnArray.age) / 2;

        showPerson( olderOneOnArray.name, "velha", olderOneOnArray.age );
        showPerson(youngestOneOnArray.name,"jovem",youngestOneOnArray.age );
        System.out.printf( "A média de idade é %d %n", ageMedia );
    }

    public static void setPersonFromInputToArray(Person[] arrayOfPeople){
        for (int i = 0; i < arrayOfPeople.length; i++){
            System.out.println("Digite o nome da  pessoa");
            String name = InputScanner.scan.next();
            System.out.println("Digite a idade da pessoa");
            int age = InputScanner.scan.nextInt();
            arrayOfPeople[i] = new Person(name, age);
        }
    }

    public static Person getOlderPersonOfArray(Person[] arrayOfPeople){
        Person olderPerson = arrayOfPeople[0];
        for (Person person: arrayOfPeople){
            if(person.age > olderPerson.age){
                olderPerson = person;
            }
        }
        return olderPerson;
    }

    public static Person getYoungerPersonOfArray(Person[] arrayOfPeople){
        Person youngestPerson = arrayOfPeople[0];
        for (Person person: arrayOfPeople){
            if(person.age < youngestPerson.age){
                youngestPerson = person;
            }
        }
        return youngestPerson;
    }

    public static void showPerson(String name, String adjective, int age){
        System.out.printf(
            "%s é a pessoa mais %s da lista com %d anos de idade%n",
            name, adjective, age
        );
    }
}
