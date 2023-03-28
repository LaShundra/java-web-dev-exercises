package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Area {
    public static void main(String[] args) {
       double radius;
       double area;
       Scanner answer;

        answer = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = answer.nextDouble();
        try{
            while(radius < 0){
                System.out.println("Please enter a positive number. Try again:");
                radius = answer.nextDouble();

            }
            answer.close();
            area = Circle.getArea(radius);

            System.out.println("The area of a circle with a radius of " + radius + " is " + area);

        } catch (InputMismatchException e){
            System.out.println("Invalid input. Restart program," + e);
        }





    }
}
