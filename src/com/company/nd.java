package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class nd {
    public static void main(String govind[]) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            display();
            int  choice=sc.nextInt();
            if(choice==1){
                //add
                System.out.print("Enter the integers for your list");
                numbers.add(sc.nextInt());
                System.out.println("Added");

            }
            else if(choice==2)
            {
                //remove
                System.out.println("Enter the element want to remove");
                int removeElement= sc.nextInt();
                if(numbers.contains(removeElement))
                {
                    numbers.remove(Integer.valueOf(removeElement));
                    System.out.println("Removed");
                }
                else
                {
                    System.out.println("The number is not present in the list");
                }
            }
            else if(choice==3){
                System.out.println("Your list: "+ numbers);
                //display
            }
            if (choice==4){
                System.out.println("Bye");
                break;
                //exit
            }
        }
    }
    private static void display()
    {
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Enter your choice ");
    }

}
