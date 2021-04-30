package gr11review.part1;
import java.io.*;

/**
* Using a switch statement, create 4 joke options and a default error message
@author Benjamin Teh
*/

public class Review2{
  public static void main(String[] args) throws IOException{
    BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
    int numJoke;
    
    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");
    System.out.println("Choose a menu option: ");
    numJoke = Integer.parseInt(keyboard.readLine());

    switch(numJoke){
      case 0:
        System.out.println("Your hair is so short they call you one punch man.");
        break;
      case 1:
        System.out.println("Why do you only have 4 toes? haha made you look");
        break;
      case 2:
        System.out.println("You're still in pajamas.");
        break;
      case 3:
        System.out.println("Mr Fabroa more like mr salmon roe.. ah?");
        break;
      default:
        System.out.println("Invalid menu option");
    }


  }

}