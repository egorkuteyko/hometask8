package by.tms;

public class Cylinder extends SolidOfRevolution {
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    double getVolume() {
        volume = Math.PI * radius * radius * height;
        return volume;
    }
}
