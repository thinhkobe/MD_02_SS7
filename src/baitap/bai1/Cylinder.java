package baitap.bai1;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double tinhthetich(){
        return super.tinhdientich()*this.height;
    }
}
