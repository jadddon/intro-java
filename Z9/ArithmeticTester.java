package Z9;

public class ArithmeticTester
{
   public static void main(String[] args)
   {
      call(3, "+", 4, "7");
      call(3, "-", 4, "-1");
      call(3, "*", 4, "12");
      call(3, "@", 4, "java.lang.IllegalArgumentException");
      call(13, "/", 4, "3");
      call(13, "/", 0, "java.lang.IllegalArgumentException");
   }

   public static void call(int a, String op, int b, String expected)
   {
      try
      {
         System.out.print("compute(" + a + " " + op + " " + b + "): ");
         System.out.flush();
         System.out.println(Arithmetic.compute(a, op, b));
      }
      catch (Throwable ex)
      {
         System.out.println(ex.getClass().getName());
      }
      System.out.println("Expected: " + expected + "\n");
   }
}