package java_lab02;

import java.util.Scanner;
import java.lang.Math;

public class Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your height: ");
        double userHeight = scanner.nextDouble();
        System.out.print("Please input your weight: ");
        double userWeight = scanner.nextDouble();

        double userBMI = userWeight / (userHeight * 2);

        double minNormalBMI = 18.6;
        double maxNormalBMI = 24.9;
        double minNormalWeight = minNormalBMI * userHeight * 2;
        double maxNormalWeight = maxNormalBMI * userHeight * 2;


        System.out.println("Your BMI is: " + userBMI);

        if (userBMI <= 18.5) {
            System.out.println("You are underweight!");
            System.out.println("You should increase " + (Math.round(minNormalWeight) - userWeight) + " to " + (Math.round(maxNormalWeight) - userWeight) + " kg!");
        } else if (userBMI < 24.9) {
            System.out.println("You are normal weight!");
        } else if (userBMI < 29.9) {
            System.out.println("You are overweight!");
            System.out.println("You should decrease " + (userWeight - Math.round(maxNormalWeight)) + " to " + (userWeight - Math.round(minNormalWeight)) + " kg!");
        } else {
            System.out.println("You are obesity!");
            System.out.println("You should decrease " + (userWeight - Math.round(maxNormalWeight)) + " to " + (userWeight - Math.round(minNormalWeight)) + " kg!");
        }


    }
}
