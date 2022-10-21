package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {


    //todo Task 1
    public static void oneMonthCalendar(int days, int firstDay) {
        int number = 1;
        int DaysInAWeek = 7;
        int DayOne = (DaysInAWeek - firstDay);
        int way = (31 / 7);

        for (int i = 1; i < firstDay; i++) {
            System.out.print("   ");
        }

        for (int i = 0; i <= DayOne; i++) {
            System.out.print(String.format("%2d", number) + " ");
            number++;
        }
        System.out.println();

        for (int i = 0; i < way; i++) {
            for (int k = 0; k < 7; k++) {
                if (number <= days) {
                    System.out.print(String.format("%2d", number) + " ");
                    number++;
                } else {
                    break;
                }
            }
            System.out.println();

        }
    }

    //todo Task 2
    public static long[] lcg(long seed) {

        long m = (long) Math.pow(2, 31);
        long a = 1103515245;
        long c = 12345;
        long nextSeed;
        long[] seeds = new long[10];


        for (int i = 0; i < 10; i++) {
            nextSeed = (a * seed + c) % m;
            seeds[i] = nextSeed;
            seed = nextSeed;

        }

        return seeds;
    }

    //todo Task 3
    public static void guessingGame(int numberToGuess) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.print("Guess number " + (i + 1) + ": ");
            int number = sc.nextInt();

            if ((i == 9) && (number > numberToGuess || number < numberToGuess)) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            } else if (number == numberToGuess) {
                System.out.println("You won wisenheimer!");
                return;
            } else if (number > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");
            } else if (number < numberToGuess) {
                System.out.println("The number AI picked is higher than your guess.");
            }

        }

    }

    public static int randomNumberBetweenOneAndHundred() {
        Random random = new Random();
        int RandomNumber = random.nextInt(100) + 1;

        return RandomNumber;
    }

    //todo Task 4
    public static boolean swapArrays(int[] x, int[] y) {
        int[] z = new int[x.length];

        if (x.length == y.length) {
            for (int i = 0; i < x.length; i++) {
                z[i] = y[i];
                y[i] = x[i];
                x[i] = z[i];
            }
            return true;
        } else {
            return false;
        }
    }

    //todo Task 5



    //todo Task 6
    public static int checkDigit(int[] x) {
        int[] y = new int[x.length];
        int[] z = new int[x.length];
        int a = 0;
        int b;
        int c;

        //y = Gewichtung
        for (int i = 0; i < x.length; i++) {
            y[i] = i + 2;
        }

        //z = Produkt
        for (int i = 0; i < x.length; i++) {
            z[i] = x[i] * y[i];
        }

        //a = Summe
        for (int i = 0; i < x.length; i++) {
            a += z[i];
        }

        //b = Summe Modulo 11
        b = a % 11;

        //c = Prüfziffer
        c = 11 - b;
        if (c == 10) {
            c = 0;
        } else if (c == 11) {
            c = 5;
        }

        return c;
    }


    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.

        System.out.println("1: ");
        App.oneMonthCalendar(31,3);
        System.out.println("2: ");
        App.lcg(0);


    }
}