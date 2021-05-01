package gr11review.part1;
import java.io.*;

/** Ask for a yearly amount to be invested.
*Ask for a compound interest rate
*Ask for a end goal
*Run a loop that adds yearly amount to current amount, and multiplies by the compound interest rate until it goes over the end goal. Output the amount of times the loop ran as years
@author Benjamin Teh
*/

public class Review5{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    double yearInvest;
    double compoundRate;
    double targetAmount;
    double currentAmount;
    int yearCount;

    System.out.println("Enter the yearly invested amount: ");
    yearInvest = Double.parseDouble(keyboard.readLine());
    System.out.println("Enter the compound interest rate: ");
    compoundRate = Double.parseDouble(keyboard.readLine());
    System.out.println("Enter the target amount: ");
    targetAmount = Double.parseDouble(keyboard.readLine());
    
    for(yearCount = 1; currentAmount < targetAmount; yearCount++){
      
    }

  }
}