package by.tms;

import java.util.ArrayList;

public class Box extends Shape {

    private ArrayList<Shape> shapes = new ArrayList<>();
    private double value;
    private double volume;

    public Box(double value) {
        this.value = value;
        this.volume = value;
    }

    public boolean add(Shape shape) {
        if (value >= shape.getVolume()) {
            shapes.add(shape);
            value -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
