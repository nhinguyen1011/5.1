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

   
    

    

    public boolean isTestsquare() {
        if (width == height)
        {
            return true ;
        }
        else
            return false;
    }

    
}
