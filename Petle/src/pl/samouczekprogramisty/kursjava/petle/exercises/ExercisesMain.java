package pl.samouczekprogramisty.kursjava.petle.exercises;

      //       Poza poznanym dzisiaj operatorem ++ istnieje też jego
     //      odpowiednik zmniejszający wartość zmiennej o 1. Jest nim --. Napisz program
    //    który wypisze na ekranie malejąco wszystkie liczby od 20 do 10.

public class ExercisesMain {
    public static void main(String[] args) {

        //zad1
        for (int i = 10; i <= 20; i++) {
            System.out.println(i);
        }
        System.out.println("koniec zad 1");

        //zad2
        //Napisz pętlę while, która wypisze na
        //ekranie wszystkie liczby od 10 do 20 włącznie.
        int numbers = 10;
        while (true) {
            System.out.println(numbers);
            numbers++;
            if (numbers == 21) {
                System.out.println("koniec zad 2");
                break;
            }
        }
        //zad3

        //Napisz pętlę for, która wypisze na ekranie
        //wszystkie liczby nieparzyste od -10 do 40
        for (int i = -10; i <= 40; i++) {
            System.out.println(i);
        }
        System.out.println("to jest koniec zad 3");

        //zad4

        //Przerób pętlę z zadania trzeciego na pętlę while.
        int num = -10;
        while (true) {
            System.out.println(num);
            num++;
            if (num == 41) {
                System.out.println("to jest koniec zad 4");
                break;
            }
        }

        //zad 5

        //Napisz metodę, która jako jedyny argument przyjmie
        //zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.
        int[] array = {1, 12, 3, 4, 5};
        System.out.println(sumArray(array) + " to jest koniec zadania 5");

        //zad 6

        //
        int[][] arrays = {{10,20,30},{10,20,30,40},{10,20,30,40,50}};
        System.out.println(sumArrays(arrays)+ " koniec zad 6");

    }

    //zad 5 metoda
    static int sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    //zad 6 metoda
    static int sumArrays(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int othernumber : numbers[i]) {
                sum += othernumber;

            }
        }
        return sum;
    }
}
