package gr11review.part1;
import java.io.*;

/**
* One loop will print odd numbers from 20-100 first. Then, the second loop will start and will print the numbers from 29-2, counting down.
@author Benjamin Teh
*/

public class Review3{
  public static void main(String[] args) throws IOException{
    int counterOdd;
    int counterDown;
    int displayNum = 21;

    for(counterOdd = 0; counterOdd < 40; counterOdd++){
      System.out.println(displayNum);
      displayNum = displayNum + 2;
    }

    System.out.println("");
    displayNum = 29;

    for(counterDown = 29; counterDown >= 2; counterDown--){
      System.out.println(displayNum);
      displayNum = displayNum - 1;
    }
    
  }
}