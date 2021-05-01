package gr11review.part1;
import java.io.*;
import java.text.*;

/** 
* Loop and keep taking prices from the user until they enter 0. Add the prices to get the subtotal, multiply by 13% tax, and display the subtotal.
*/

public class Review6{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat numberFormat = new DecimalFormat("#,###.00");
    double itemPrice;
    double itemCount;
    double subTotal = 0;
    double itemTax = 0;
    double finalTotal;

    for(itemCount = 1; itemCount > 0; itemCount++){
      System.out.println("Enter the price for item " + itemCount + ":");
      
      itemPrice = Double.parseDouble(keyboard.readLine());
      subTotal = subTotal + itemPrice;
      if(itemPrice == 0){
        itemCount = -1;
      }
    }
    itemTax = subTotal * 0.13;
    finalTotal = subTotal + itemTax;

    System.out.println("Subtotal: " + numberFormat.format(subTotal));
    System.out.println("Tax: " + numberFormat.format(itemTax));
    System.out.println("Total: " + numberFormat.format(finalTotal));

  }
}