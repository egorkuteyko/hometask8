package by.tms;

public class Main {
    public static void main(String[] args) {
        Shape pyramid = new Pyramid(20.0, 10.0);
        Shape cylinder = new Cylinder(10.0, 5.0);
        Shape ball = new Ball(5.0);
        Box box = new Box(2000.0);
        System.out.println(box.add(pyramid));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(ball));
    }
}
