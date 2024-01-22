package baitap.bai3;

import baitap.bai2.Point2D;

public class MovablePoint extends Point {
    float xSpeed,ySpeed =0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }
    public void  setSpeed(float x,float y ){
        this.xSpeed=x;
        this.ySpeed=y;
    }
    public MovablePoint move(){
        this.xSpeed= x+=xSpeed;
        this.ySpeed= y+=ySpeed;
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
