package pl.samouczeprogramisty.kursjava.exercies;

public class Addition implements Computation {
    double x;
    double y;

    @Override
    public double compute(double arg1, double arg2) {
        x = arg1;
        y = arg2;
        return x+y;
    }
}
