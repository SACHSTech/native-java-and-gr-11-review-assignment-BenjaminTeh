package gr11review.part1;
import java.io.*;

/**
* Randomly generate 3 numbers between 0-8. Print the result. Do this in a loop 1000 times, and at the end, display how many times all 3 numbers were the same.
To generate random number, use (Math.random() * (Maximum - Minimum + 1)) + minimum.
@author Benjamin Teh
*/

public class Review8{
  public static void main(String[] args) throws IOException{
    int randomOne;
    int randomTwo;
    int randomThree;
    int simCounter;
    int tripletCounter = 0;
    
    for (simCounter = 0; simCounter < 1000; simCounter++){
      randomOne = (int)(Math.random() * 9);
      randomTwo = (int)(Math.random() * 9);
      randomThree = (int)(Math.random() * 9);
      System.out.println(randomOne + " " + randomTwo + " " + randomThree);
      if(randomOne == randomTwo && randomOne == randomThree){
        tripletCounter++;
      }
    }

    System.out.println(tripletCounter);
    
  }
}