
/***************************************************************
Name of the Lab/Assignment: Dispenser Operator Lab

Preconditions: Input only a two digit integer.
Postconditions: Change is printed into the console.

****************************************************************/
import java.util.Scanner;

public class Dispenser {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // user must enter the cost of the item purchased, in cents
    int quarter = 25;
    int dime = 10;
    int nickel = 5;
    int penny = 1;
    int dollar = 100;
    boolean ten = false;

    System.out.print("Enter price of item (in cents): ");
    int cost = in.nextInt(); // cost of item user is buying, in cents

    if (cost <= 0) {
      System.out.println("INVALID!");
      System.exit(0);
    }

    if (cost > 0) {
      System.out.println("You bought an item for " + cost + " cent(s) and gave me a dollar, so your change is: ");

      dollar = dollar - cost;

      quarter = dollar / quarter;
      dollar = dollar - quarter * 25;
      dime = dollar / dime;
      dollar = dollar - dime * 10;
      nickel = dollar / nickel;
      dollar = dollar - nickel * 5;
      penny = dollar / penny;
    System.out.println();
      System.out.println(quarter + " quarter(s), " + dime + " dime(s), " + nickel + " nickel(s), " + penny + " penny(ies)");

    }

    // TBD complete the code to output change amounts

  } // end main
} // end class
