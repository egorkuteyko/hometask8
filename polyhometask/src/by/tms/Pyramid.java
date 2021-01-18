package by.tms;

public class Pyramid extends Shape {
    private double s;
    private double h;

    public void setS(double s) {
        this.s = s;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getS() {
        return s;
    }

    public double getH() {
        return h;
    }

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    @Override
    double getVolume() {
        volume = h*s*0.33;
        return volume;
    }
}
