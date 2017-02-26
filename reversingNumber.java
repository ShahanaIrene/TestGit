/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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