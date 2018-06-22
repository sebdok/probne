package pl.samouczeprogramisty.kursjava.exercies;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        Computation computation;

        if (main.shouldMultiplay()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę

        } else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);

    }

    private boolean shouldMultiplay() {
        System.out.println("jakie działanie chcesz wykonac\nMnożenie?\nczy\nDodawanie?");
        Scanner scanner = new Scanner(System.in);
        String whatCompute = scanner.next();
        whatCompute.toUpperCase();

        return whatCompute.equals("mnozenie");// tutaj zapytaj użytkownika co chce zrobić (mnożenie czy dodawanie)
    }

    private double getArgument() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        double argument = scanner.nextDouble();
        return argument; // tutaj pobierz liczbę od użytkownika
    }
}
