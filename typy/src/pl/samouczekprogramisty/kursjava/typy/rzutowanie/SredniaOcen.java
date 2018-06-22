package pl.samouczekprogramisty.kursjava.typy.rzutowanie;

import java.util.Scanner;

public class SredniaOcen {
    /*public static void main(String[] args) {
        double[][] dzienikocen =new double [3][4];

        dzienikocen[0] =new double[]{2,3,5,5};
        dzienikocen[1] =new double[]{3,3,4,3};
        dzienikocen[2] =new double[]{4,4,4,5};


        }
        static double average(double[] oceny){
        int sum1 =0;
        int sum2 =0;
        int sum3 =0;
            for (double i = 0; i<oceny.length; i++ ) {
                for(double numbers : oceny)

            }

            }
        }

    }*/
    private final int numberOfClasses;
    private final int numberOfNotes;
    private int[][] notes;

    public SredniaOcen(int numberOfClasses, int numberOfNotes) {
        this.numberOfClasses = numberOfClasses;
        this.numberOfNotes = numberOfNotes;

        initializeNotes();
    }

    private void initializeNotes() {
        notes = new int[numberOfClasses][];
        for(int classIndex = 0; classIndex < notes.length; classIndex++) {
            notes[classIndex] = new int[numberOfNotes];
        }
    }

    public void getNotesFromUser() {
        Scanner scanner = new Scanner(System.in);
        for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
            for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++) {
                System.out.println("Podaj ocenę numer " + (noteIndex + 1) + " dla przedmiotu numer " + (classIndex + 1) + ": ");
                int check = scanner.nextInt();
                while(check>=6 || check<=0){
                    System.out.println("podano bledna ocene");
                    System.out.println("Podaj ocenę numer " + (noteIndex + 1) + " dla przedmiotu numer " + (classIndex + 1) + ": ");
                    check = scanner.nextInt();

                }
                    notes[classIndex][noteIndex] = check;
            }
        }
    }


    public void printAverate() {
        float totalAverage = 0;
        for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
            float classAverage = 0;
            for (int note : notes[classIndex]) {
                classAverage += note;
            }
            classAverage /= numberOfNotes;
            System.out.println("Średnia dla przedmiotu numer " + (classIndex + 1) + " wynosi: " + classAverage);
            totalAverage += classAverage;
        }
        totalAverage /= numberOfClasses;
        System.out.println("Średnia dla wszystkich przedmiotów wynosi: " + totalAverage);
    }

    public static void main(String[] args) {
        int numberOfClasses = 3;
        int numberOfNotes = 4;
        SredniaOcen excercise = new SredniaOcen(numberOfClasses, numberOfNotes);
        excercise.getNotesFromUser();
        excercise.printAverate();
    }

}



