package oop;

public class Rectangle {
    public float width;
    public float height;
    public float p;
    public float s;
    public boolean testsquare;



    public Rectangle(float width,float height) {
        this.width = width;
        this.height = height;
        this.p = p;
    }



    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float getP() {
        float p=(width+height)*2;
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getS() {
        return s;
    }

    public void setS(float s) {
        this.s = s;
    }

    public boolean isTestsquare() {
        if (width == height)
        {
            System.out.println("square");
        }
        else
            System.out.println("not square");
        return testsquare;
    }

    public void setTestsquare(boolean testsquare) {
        this.testsquare = testsquare;
    }
}