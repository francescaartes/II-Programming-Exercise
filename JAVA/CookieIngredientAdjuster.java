/*
    Artes, Francesca Q.
    BSCpE 1-1
    
    This program calculates the amount of ingredients you need to make cookies.

    JAVA
*/

import java.util.Scanner;

public class CookieIngredientAdjuster
{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double sugar, butter, flour, cookies;
            String name;

            System.out.print("What is your name? ");
                name = in.nextLine();
            
            System.out.print("How many cookies do you want to make? ");
                cookies = in.nextDouble();
            
            sugar = 1.5 * cookies;
            butter = 1 * cookies;
            flour = 2.75 * cookies;

            System.out.println(name + ", you need the following ingredients to make " + cookies + " cookie/s:");
            System.out.println(sugar + " cups of sugar");
            System.out.println(butter + " cups of butter");
            System.out.print(flour + " cups of flour");
        }
    }
}