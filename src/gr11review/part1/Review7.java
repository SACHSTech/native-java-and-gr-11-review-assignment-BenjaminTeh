package gr11review.part1;
import java.io.*;

/**
* Use command charAt() and if statements and loops to scan the strings for spaces, the letter "a", and to collect odd numbered characters and print them out.
@author Benjamin Teh
*/

public class Review7{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    String theSentence;
    int counter;
    int spaceCounter = 0;
    int aCounter = 0;
    int oddCounter;

    theSentence = keyboard.readLine();

    for (counter = 0; counter < theSentence.length(); counter++){
      if (theSentence.charAt(counter) == ' '){
        spaceCounter++;
      }
      else if (theSentence.charAt(counter) == 'a'){
        aCounter++;
      }
    }

    counter = 0;
    
    System.out.println("There are " + theSentence.length() + " characters in the sentence.");
    System.out.println("There are " + spaceCounter + " spaces in the sentence.");
    System.out.println("There are " + aCounter + " letter a in the sentence.");
    
    for (counter = 0; counter < theSentence.length(); counter++){
      if (counter % 2 != 0){
        System.out.print(theSentence.charAt(counter));
      }
    }
  }
}