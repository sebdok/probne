package pl.samouczekprogramisty.kursjava.petle.loopfor;

public class LoopForMain {
    public static void main(String[] args) {
        for (int number = 0; number <= 10; number++) {
            System.out.println(number);
        }

        int[] primeNumbers = new int[]{2, 3, 5, 7};
        for (int index = 0; index < primeNumbers.length; index++) {
            System.out.println(primeNumbers[index]);
        }
        for (int numbers : primeNumbers) {
            System.out.println("to jest kolejna pozycja tablicy numbers " + numbers);
        }
    }
}
