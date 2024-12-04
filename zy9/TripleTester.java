package zy9;

import java.awt.Color;

public class TripleTester
{
   public static void main(String[] args)
   {
      Triple t1 = new Triple<>(3, 4.5, "Bob");
      System.out.println(t1);
      System.out.println("Expected: (3, 4.5, Bob)");
      System.out.println(t1.getThird());
      System.out.println("Expected: Bob");
      Triple<String, Double, Color> t2 
         = new Triple<>("red", Math.PI, Color.MAGENTA);
      System.out.println(t2);
      System.out.println(
         "Expected: (red, 3.141592653589793, java.awt.Color[r=255,g=0,b=255])");
      System.out.println(t2.getFirst().length());
      System.out.println("Expected: 3");
      System.out.println(t2.getSecond() * 4.0);
      System.out.println("Expected: 12.566370614359172");
      System.out.println(t2.getThird().getRGB());
      System.out.println("Expected: -65281");

   }
}