package pl.samouczekprogramisty.kursjava.petle.swich;

public class SwitchMain {
    public static void main(String[] args) {
        int temperature = 35;
        switch (temperature) {
            case 35:
                System.out.println("Jesteś osłabiony?");

            case 36:
                System.out.println("Wszystko w normie!");

            case 37:
                System.out.println("Jesteś przeziębiony?");
                break;
            case 38:
                System.out.println("Chyba jesteś chory.");
                break;
            default:
                System.out.println("Nie wiem jak się czujesz :(");
                break;
        }
    }
}
