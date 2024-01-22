package baitap.bai2;

public class Runbai2 {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(2,3);
        Point3D point3D=new Point3D(45,6,55);
        System.out.println(point2D);
        point3D.setXY(56,4);
        System.out.println("new 3D"+point3D);
    }
}
