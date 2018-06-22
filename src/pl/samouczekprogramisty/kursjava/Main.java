package pl.samouczekprogramisty.kursjava;

public class Main {
    public static void main(String[] args) {

        for (int i = 20; i >= 10; i--) {
            System.out.println("to jest wynik petli \"for\" " + i);
        }
        int i = 20;

        while (i > 0) {
            System.out.println("to jest wynik petli \"while\" " + i);
            i--;
        }
        int number = 20;

        while (true) {

            System.out.println(number);
            number--;
            if (number == 10) {
                break;
            }
        }

        for (int j = -10; j < 40; j += 2) {

            System.out.println("nieparzyste " + (j + 1));
        }
        int k = -10;
        while (k < 40) {
            System.out.println("nieparezyste petla \"while\" " + (k + 1));
            k += 2;
        }

        int[][][] numbers = {{1,2,3,4,5,6,7,8,9,},{1,2,3,4,5}};
        System.out.println(sumArray(numbers)+"wynik");
        System.out.println(numbers.length+"dlugosc numbers");

        final int [][] tablica=new int [5][8];
        System.out.println(tablica.length);
        System.out.println(tablica[4].length);
    }



    private static int sumArray(int[][] numbers) {
        int sum = 0;
        for (int[] otherNumbers : numbers) {
            for (int number : otherNumbers) {
                sum += number;
            }
        }
        return sum;        }



}
