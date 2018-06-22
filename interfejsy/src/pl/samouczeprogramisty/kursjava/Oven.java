package pl.samouczeprogramisty.kursjava;

public class Oven implements BakingOven,RostingOven {
    int temperature;
    int time;
    @Override
    public void bakingcookies() {
        temperature = 180;
        time = 120;
        turOn();
    }

    @Override
    public void bakingbread() {
        temperature = 160;
        time = 180;
        turOn();
    }

    @Override
    public void roustingchiken() {
        temperature = 200;
        time = 190;
        turOn();
    }

    private void turOn(){
        System.out.println(String.format("Start. Heat up to %s and work for %d minutes.",temperature,time));
    }

    public static void main(String[] args) {
        Oven oven = new Oven();
        BakingOven bakingOven = new Oven();
        RostingOven rostingOven = new Oven();

        bakingOven.bakingcookies();
        bakingOven.bakingbread();
        rostingOven.roustingchiken();

    }
}
