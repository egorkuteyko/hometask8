package by.tms;

public class SolidOfRevolution extends Shape {
    double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    double getVolume() {
        return 0;
    }

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }
}
