package pl.sdaacademy.java.basic.exercises.day1;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please insert r");
        float diameter = scanner1.nextFloat();
        double pi = 3.14;
        double pi2 = Math.PI;

        float circumference = (float) (2 * pi*diameter/2);
        System.out.println("circumference: " + circumference);
        double area = pi*(diameter/2)* (diameter/2);
        System.out.println("Area: " +area);


    }

    }





