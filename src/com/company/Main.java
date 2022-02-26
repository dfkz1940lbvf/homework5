package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Задача 1");
        int[] future = new int[3];
        future[0] = 1;
        future[1] = 2;
        future[2] = 3;

        float[] fractions = {1.57f, 7.654f, 9.986f};

        double[] random = {2.86, 4.69, 7.06};

        System.out.println(" Задача 2");

        for (int i = 0; i < future.length; i++) {
            if (i == future.length - 1) {
                System.out.print(future[i]);
                break;
            }
            System.out.print(future[i] + ",");
        }
        System.out.println(" ");


        for (int i = 0; i < fractions.length; i++) {
            if (i == fractions.length - 1) {
                System.out.print(fractions[i]);
                break;
            }
        }

        System.out.println(" ");
        for (int i = 0; i < random.length; i++) {
            if (i == random.length - 1) {
                System.out.print(random[i]);
                break;
            }
        }
        System.out.println(" ");

        System.out.println(" Задача 3");
        for (int i = future.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(future[i]);
                break;
            }
            System.out.print(future[i] + ", ");
        }
        System.out.println(" ");


        System.out.print(fractions[2]);
        for (int i = 1; i >= 0; i--) {
            System.out.print(", " + fractions[i]);
        }
        System.out.println(" ");
        System.out.print(random[2]);
        for (int i = 1; i >= 0; i--) {
            System.out.print(", " + random[i]);
        }
        System.out.println(" ");

        System.out.println("Задача 4");
        for (int i = 0; i < future.length; i++) {
            if (future[i] % 2 != 0) {
                future[i]++;
            }
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(future[i]);
        }
    }
}


