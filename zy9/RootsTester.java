package zy9;

import java.util.Scanner;

public class RootsTester
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      double test = in.nextDouble();
      System.out.println(Roots.roots(test));
   }
}
