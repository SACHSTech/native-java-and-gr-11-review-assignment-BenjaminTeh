package gr11review.part1;
import java.io.*;

/**
*One loop will print odd numbers from 20-100 first. Then, the second loop will start and will print the numbers from 29-2, counting down.
@author Benjamin Teh
*/

public class Review3{
  public static void main(String[] args) throws IOException{
    int counterOdd;
    int counterDown;
    int displayNum = 21

    for(counterOdd = 0; counterOdd < 39; counterOdd++){
      System.out.println(displayNum + 2);
      displayNum = displayNum + 2;
    }

  }
}