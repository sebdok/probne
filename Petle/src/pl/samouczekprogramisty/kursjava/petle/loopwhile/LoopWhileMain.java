package pl.samouczekprogramisty.kursjava.petle.loopwhile;

public class LoopWhileMain {
    public static void main(String[] args) {
        int number = 0;
       // while (number < 10) {
         //   System.out.println(number);
          //  number++;
        //}

        while (true) {
            System.out.println(number);
            number++;
            if (number == 10) {
                break;
            }
        }
    }
}