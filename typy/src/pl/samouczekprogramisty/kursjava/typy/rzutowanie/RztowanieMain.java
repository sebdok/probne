package pl.samouczekprogramisty.kursjava.typy.rzutowanie;

public class RztowanieMain {
    public static void main(String[] args) {
        int somesmalint = 365;
        short daysInYear = (short)somesmalint;
        short othershort = (short)123146457;
        System.out.println(daysInYear);
        System.out.println(othershort);
    }
}
