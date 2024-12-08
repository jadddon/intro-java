package Z9;

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class LineWriterTester
{
   public static void main(String[] args)
   {
      // This tests that the method throws a FileNotFoundException
      String[] array = {"mary", "had", "a", "little", "lamb"};
      try
      {
         LineWriter.writeAll(array, "nodir/nofile.txt");
         System.out.println("Should have throw an exeption, but did not.");
      }
      catch (Throwable e)
      {
         if (e.getClass().getSimpleName().equals("FileNotFoundException"))
            System.out.println("FileNotFoundException thrown");
         else
            System.out.println("Throws " + e.getClass().getSimpleName());
      }
      System.out.println("Expected: FileNotFoundException thrown\n");
   
      try
      {
         LineWriter.writeAll(array, "output.txt");
         System.out.println("Throws no exceptions");
      }
      catch (Exception e)
      {
         System.out.println("Throws " + e.getClass().getSimpleName() + ", but should not");
      }
      System.out.println("Expected: Throws no exceptions\n");

      // This version tests to see what happens when the input String contains a null.
      array = new String[] {"mary", "had", null, "little", "lamb"};
      String[] copy = {"MARY", "HAD"};

      try
      {
         LineWriter.writeAll(array, "output.txt");
         // Should throw a NullPointerException. If it does not, we have a problem
         System.out.println("Should throw an exception.");
      }
      catch (Exception e)
      {
         if (e.getClass().getSimpleName().equals("NullPointerException"))
         {
            List<String> lines = null;
            try
            {
               lines = Files.readAllLines(Paths.get("output.txt"));
               System.out.println("Actual: " + Arrays.toString(lines.toArray()));
            }
            catch (IOException ioe)
            {
               System.out.println("Actual: data not saved to file.");
            }
         }
         else
         {
            System.out.println("Throws " + e.getClass().getSimpleName() + ", but should not.");
         }
      }
      System.out.println("Expected: " + Arrays.toString(copy));
   }
}