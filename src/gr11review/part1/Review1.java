package gr11review.part1;
import java.io.*;

/** 
* Program that takes the month, converts it to the number of days from the start of the year to the end of the month before it, and adds the to the day of the month the user entered.
@author Benjamin Teh
*/
public class Review1{
    public static void main(String[] args) throws IOException{
      BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

      int numMonth = 1;
      int numDay = 2;
      int numTotalDay;
      
      System.out.println("Enter the month:");
      numMonth = Integer.parseInt(keyboard.readLine());

      System.out.println("Enter the day:");
      numDay = Integer.parseInt(keyboard.readLine());
      
      if(numMonth == 1 && numDay >= 1 && numDay <= 31){
        numTotalDay = numDay;
        System.out.println(numTotalDay);
      }
      else if(numMonth == 2 && numDay >= 1 && numDay <= 28){
        numTotalDay = 31 + numDay;
        System.out.println(numTotalDay);
      }
      else if(numMonth == 3 && numDay >= 1 && numDay <= 31){
        numTotalDay = 59 + numDay;
        System.out.println(numTotalDay);
      }
      else if(numMonth == 4 && numDay >= 1 && numDay <= 30){
        numTotalDay = 90 + numDay;
        System.out.println(numTotalDay);
      }
      




    }
}