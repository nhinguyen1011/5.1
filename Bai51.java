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
        float testpremiter= rectangle.Premiter;
        System.out.println( "perimeter: "+testpremiter);
        float testquare=rectangle.Square;
        System.out.println("square: "+testquare);
        boolean test =rectangle.testsquare;
        if (test == true){
             System.out.println("square");
        }else{
            System.out.println("not square");
        }


    }

}







