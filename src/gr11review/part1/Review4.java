package gr11review.part1;
import java.io.*;
import java.text.*;

/**
*Take the amount of items the user wants to buy. Ask for the prices using a loop that runs the exact amount of times as the number of items the user is buying.
*Display the subtotal, display the 13% tax, and display the total
*/

public class Review4{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat numberFormat = new DecimalFormat("#,###.00");
    int itemCount;
    double itemPrice;
    double subTotal;
    int priceCounter;

    System.out.println("How many items do you want to buy?");
    itemCount = Integer.parseInt(keyboard.readLine());

    for(priceCounter = 1; priceCounter <= itemCount; priceCounter++){
      System.out.println("Enter the price for item " + priceCounter + ":");
      itemPrice = Double.parseDouble(keyboard.readLine());
      System.out.println(numberFormat.format(itemPrice));
    }

  }
}