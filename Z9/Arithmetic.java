package Z9;

public class Arithmetic
{
   /**
      Computes the value of an arithmetic expression
      @param value1 the first operand
      @param operator a string that should contain an operator + - * or /
      @param value2 the second operand
      @return the result of the operation
   */
   public static int compute(int value1, String operator, int value2)
   {
      if (operator.equals("+")) { return value1 + value2; }
      else if (operator.equals("-")) { return value1 - value2; }
      else if (operator.equals("*")) { return value1 * value2; }
      else if (operator.equals("/"))
      {
         if (value2 == 0) {
            throw new IllegalArgumentException();
         }
         return value1 / value2;
      }
      else
      {
         throw new IllegalArgumentException();
      }
   }
}