//package practiceapplications;

import java.util.Scanner;

/**
 *
 * @author Asif
 */
public class reversingNumber {

    public static void main (String[] args){
     int number, hold, newNumber;
     newNumber = 0;

      Scanner input = new Scanner(System.in);

      number = input.nextInt();
      while (number>0)
      {
          hold = number%10;
          newNumber = newNumber*10 + hold;
          number = number/10;
      }

      System.out.print(newNumber);
    }
}
