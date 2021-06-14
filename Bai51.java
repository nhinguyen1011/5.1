package oop;

import java.util.Scanner;

public class Bai51{
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        float width= scanner.nextFloat();
        float height= scanner.nextFloat();;
        System.out.println("width: "+width);
        System.out.println("height: "+height);
        Rectangle rectangle =new Rectangle (  height , width);
        float p= rectangle.p;
        System.out.println( "perimeter: "+p);
        float s=rectangle.s;
        System.out.println("square: "+s);
        boolean test =rectangle.testsquare;


    }

}







