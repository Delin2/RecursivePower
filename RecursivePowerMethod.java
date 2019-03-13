//Dennis Lin
//CSI 310
//Programming Assignment 4 -- Chapter 15(RecursivePowerMethod)

import java.util.Scanner;
public class RecursivePowerMethod
{
  public static void main(String[] args)
  {
    int base, exp;
    int answer;
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the power program! ");
    //get base
    System.out.print("Enter the base you would like raised to a power: ");
    base = scan.nextInt();
    //get exponent
    System.out.print("Enter the power you would like it raised to: ");
    exp = scan.nextInt();
    answer = pow(base,exp);
    System.out.println(base + " raised to the " + exp + " is " + answer);
  }
  // ----------------------------------------------
  // Computes and returns base^exp
  // ----------------------------------------------
  public static int pow(int base, int exp)
  {
    int pow;
    //if the exponent is 0, set pow to 1
    if (exp == 0)
      return 1;
    //otherwise compute pow recursively
    return base * pow(base,exp-1);
  }
}
