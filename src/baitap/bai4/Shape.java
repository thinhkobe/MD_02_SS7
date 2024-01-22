package baitap.bai4;

public class Shape extends Triangle {
    String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public Shape(double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
