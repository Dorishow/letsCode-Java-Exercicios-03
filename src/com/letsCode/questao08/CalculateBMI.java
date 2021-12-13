package com.letsCode.questao08;

import com.letsCode.questao08.Person;
import com.letsCode.utils.InputScanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        setPersonFromInputToArray(people);
        showMessageAboutBMI(people);
    }

    public static void setPersonFromInputToArray(Person[] arrayOfPeople){
        for (int i = 0; i < arrayOfPeople.length; i++){
            System.out.println("Digite o nome da  pessoa");
            String name = InputScanner.scan.next();

            System.out.println("Digite a altura da pessoa em metros");
            float height = InputScanner.scan.nextFloat();

            System.out.println("Digite o peso da pessoa em Kg");
            float weight = InputScanner.scan.nextFloat();

            arrayOfPeople[i] = new Person(name, height, weight);
        }
    }

    public static void showMessageAboutBMI(Person[] arrayOfPeople){
        for (Person person: arrayOfPeople){
            double bmi = person.weight / Math.pow(person.height, 2);
            if(bmi < 18.5 || bmi > 25){
                System.out.printf("%s está fora do peso ideal, seu IMC é: %.2f.%n", person.name, bmi);
            }
        }
    }
}
