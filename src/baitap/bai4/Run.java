package baitap.bai4;

public class Run {
    public static void main(String[] args) {

        Shape s =new Shape(3,4,5,"red");

        System.out.println(s.toString());
        System.out.println(s.getPerimeter());
        System.out.println(s.getArea());
    }
}
