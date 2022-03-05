package pl.sdaacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert weight in kg: ");
        float weight = scanner.nextFloat();

        System.out.print("Please insert height in cm: ");
        int height = scanner.nextInt();

        bmiCheck(weight, height);

                    }
                    private static float bmiCheck(float weight, int height) {
        float heightInM = height / 100F;
        float BMI = weight / (heightInM * heightInM);
        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("BMI is correct: " + BMI);
        } else
            System.out.println("BMI is not correct: " + BMI);
        return BMI;
                    }
}
