package pl.samouczekprogramisty.kursjava.petle;

public class Main {
    public static void main(String[] args) {
        int temperature = 36;
        if (temperature < 36) {
            System.out.println("Jesteś osłabiony?");
        }
        else if (temperature < 37) {
            System.out.println("Wszystko w normie!");
        }
        else if (temperature < 38) {
            System.out.println("Jesteś przeziębiony?");
        }
        else {
            System.out.println("Masz co najmniej 38 stopni! Biegiem do lekarza!");
        }
    }
}
