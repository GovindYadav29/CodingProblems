package com.company;

import java.util.Scanner;

public class RectangleAcces {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Do want the width and height? (y/n)");
            char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                System.out.println("enter the width and height ");
                rectangles[i] =
                        new Rectangle(scanner.nextDouble(), scanner.nextDouble());
            } else {
                rectangles[i] = new Rectangle();
            }
        }

        for (int j = 0; j < rectangles.length; j++) {
            System.out.println("Rectangle " + (j + 1) +
                    " ,width: " + rectangles[j].getWidth() +
                    " ,height: " + rectangles[j].getHeight());
            System.out.println("Area of " + (j + 1) + " is " + rectangles[j].getArea());
            System.out.println("Area of " + (j + 1) + " is " + rectangles[j].getPerimeter());
            System.out.println();
        }
    }
}
