package baitap.bai1;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(4.5,"red",9);

        Circle circle=new Cylinder(1,"red",2);

        Cylinder c=(Cylinder)circle;
        System.out.println("aaa"+ c.tinhthetich());
        System.out.println("diện tích đáy là"+cylinder.tinhdientich());
        System.out.println("thể tích hình trụ là"+cylinder.tinhthetich());
    }
}
