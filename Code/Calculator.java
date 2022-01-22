package com.company;

import java.util.Collections;
import java.util.Scanner;

public class Calculator {

    public static void intro() {
        System.out.println("Welcome to the Arbitrary Unit Calculator...\n" +
                "Created by: Daniel Cedano & Andy Woodard January 22, 2022\n");
    }
    private static Scanner scanner = new Scanner(System.in);

    public static void unitofMeasurement() {
        System.out.println("Please enter your unit of measurement (cm, in, ft): ");
        String choice = scanner.next();
        switch (choice) {
            case "cm":
                System.out.println("Enter the number of centimeters here: ");
                double chosen = scanner.nextDouble();
                scanner.nextLine();
                if (chosen <= 0) {
                    System.out.println("Please enter a valid value");
                    break;
                } else if (chosen > 0) {
                    System.out.println("Please enter the unit of measurement you would like to calculate to(ft, in, yard, meter, mm, mile): ");
                    String nextChoice = scanner.next();
                    switch (nextChoice) {
                        case "ft":
                            double numberofcmInFOOT = 30.48;
                            double calculation = (float) (chosen / numberofcmInFOOT);
                            System.out.println(chosen + " cm is equal to " + calculation + " feet");
                            break;
                        case "in":
                            double numberofcminInch = 2.54;
                            calculation = (float) (chosen / numberofcminInch);
                            System.out.println(chosen + " cm is equal to " + calculation + " inches");
                            break;
                        case "yard":
                            double numberofcminYard = 91.44;
                            calculation = (float) (chosen / numberofcminYard);
                            System.out.println(chosen + " cm is equal to " + calculation + " yards");
                            break;
                        case "meter":
                            double numberofcminMeter = 100;
                            calculation = (float) (chosen / numberofcminMeter);
                            System.out.println(chosen + " cm is equal to " + calculation + " meters");
                            break;
                        case "mm":
                            double numberofcminmm = 0.1;
                            calculation = (float) (chosen / numberofcminmm);
                            System.out.println(chosen + " cm is equal to " + calculation + " millimeters");
                            break;
                        case "mile":
                            double numberofcminmile = 160934;
                            calculation = (float) (chosen / numberofcminmile);
                            System.out.println(chosen + " cm is equal to " + calculation + " miles");
                            break;
                        default:
                            System.out.println("Please type ft, in, yard, meter, mm, or mile");
                            unitofMeasurement();
                    }
                }
                break;
            case "in":
                System.out.println("Enter the number of inches here: ");
                chosen = scanner.nextDouble();
                scanner.nextLine();
                if (chosen <= 0) {
                    System.out.println("Please enter a valid value");
                    break;
                } else if (chosen > 0) {
                    System.out.println("Please enter the unit of measurement you would like to calculate to(ft, in, yard, meter, mm, mile): ");
                    String nextChoice = scanner.next();
                    switch (nextChoice) {
                        case "ft":
                            double numberofInchesInFOOT = 12;
                            double calculation = (float) (chosen / numberofInchesInFOOT);
                            System.out.println(chosen + " in is equal to " + calculation + " feet");
                            break;
                        case "cm":
                            double numberofInchesincm = 0.393701;
                            calculation = (float) (chosen / numberofInchesincm);
                            System.out.println(chosen + " in is equal to " + calculation + " cm");
                            break;
                        case "yard":
                            double numberofInchesinYard = 36;
                            calculation = (float) (chosen / numberofInchesinYard);
                            System.out.println(chosen + " in is equal to " + calculation + " yards");
                            break;
                        case "meter":
                            double numberofInchesinMeter = 39.3701;
                            calculation = (float) (chosen / numberofInchesinMeter);
                            System.out.println(chosen + " in is equal to " + calculation + " meters");
                            break;
                        case "mm":
                            double numberofInchesinmm = 0.0393701;
                            calculation = (float) (chosen / numberofInchesinmm);
                            System.out.println(chosen + " in is equal to " + calculation + " millimeters");
                            break;
                        case "mile":
                            double numberofInchesinmile = 63360;
                            calculation = (float) (chosen / numberofInchesinmile);
                            System.out.println(chosen + " in is equal to " + calculation + " miles");
                            break;
                        default:
                            System.out.println("Please type ft, in, yard, meter, mm, or mile");
                            unitofMeasurement();
                    }
                }
                break;
            case "ft":
                System.out.println("Enter the number of feet here: ");
                chosen = scanner.nextDouble();
                scanner.nextLine();
                if (chosen <= 0) {
                    System.out.println("Please enter a valid value");
                    break;
                } else if (chosen > 0) {
                    System.out.println("Please enter the unit of measurement you would like to calculate to(ft, in, yard, meter, mm, mile): ");
                    String nextChoice = scanner.next();
                    switch (nextChoice) {
                        case "ft":
                            double numberoffeettoInches = 0.0833333;
                            double calculation = (float) (chosen / numberoffeettoInches);
                            System.out.println(chosen + " feet is equal to " + calculation + " inches");
                            break;
                        case "cm":
                            double feettoCM = 0.0328084;
                            calculation = (float) (chosen / feettoCM);
                            System.out.println(chosen + " feet is equal to " + calculation + " cm");
                            break;
                        case "yard":
                            double feetToYard = 3;
                            calculation = (float) (chosen / feetToYard);
                            System.out.println(chosen + " feet is equal to " + calculation + " yards");
                            break;
                        case "meter":
                            double FeettoMeter = 3.28084;
                            calculation = (float) (chosen / FeettoMeter);
                            System.out.println(chosen + " feet is equal to " + calculation + " meters");
                            break;
                        case "mm":
                            double FeettoMM = 0.00328084;
                            calculation = (float) (chosen / FeettoMM);
                            System.out.println(chosen + " feet is equal to " + calculation + " millimeters");
                            break;
                        case "mile":
                            double feetToMile = 5280;
                            calculation = (float) (chosen / feetToMile);
                            System.out.println(chosen + " feet is equal to " + calculation + " miles");
                            break;
                        default:
                            System.out.println("Please type ft, in, yard, meter, mm, or mile");
                            unitofMeasurement();
                    }
                }
                break;
        }
    }

}
