package Z9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class LineWriter
{
   public static void writeAll(String[] lines, String filename) throws FileNotFoundException
   {
      PrintWriter out = new PrintWriter(filename);
      try {
         for (String line : lines)
         {
            if (line == null) {
               out.close();
               throw new NullPointerException();
            }
            out.println(line.toUpperCase());
         }
      } finally {
         out.close();
      }
   }
}