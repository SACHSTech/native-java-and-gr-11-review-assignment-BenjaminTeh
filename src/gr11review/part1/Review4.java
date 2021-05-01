package gr11review.part1;
import java.io.*;

/**
*Take the amount of items the user wants to buy. Ask for the prices using a loop that runs the exact amount of times as the number of items the user is buying.
*Display the subtotal, display the 13% tax, and display the total
*/

public class Review4{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    int itemCount;
    int subTotal;
    int priceCounter;

    System.out.println("How many items do you want to buy?");
    itemCount = Integer.parseInt(keyboard.readLine());

    for(priceCounter = 0; priceCounter < itemCount; priceCounter++){
      
    }

  }
}