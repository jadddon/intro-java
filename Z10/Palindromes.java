package Z10;

public class Palindromes{
   public static void main(String[] args)
   {
      String sentence1 = "Madam, I'm Adam!";      
      System.out.println(sentence1);
      System.out.println("Palindrome: " + isPalindrome(sentence1));
      String sentence2 = "Sir, I'm Eve!";      
      System.out.println(sentence2);
      System.out.println("Palindrome: " + isPalindrome(sentence2));
   }

   /**
      Tests whether a text is a palindrome.
      @param text a string that is being checked
      @return true if text is a palindrome, false otherwise
   */
   public static boolean isPalindrome(String text)
   {
      int length = text.length();

      // Base case: shortest strings are always palindromes
      if (length <= 1) { return true; }
      else
      {
         // Get first and last characters, converted to lowercase. 
         char first = Character.toLowerCase(text.charAt(0));
         char last = Character.toLowerCase(text.charAt(length - 1));

         // Check if both first and last characters are letters
         if (Character.isLetter(first) && Character.isLetter(last))
         {
            // If both are letters and match, recursively check the substring without first and last characters
            if (first == last)
            {
               String shorter = text.substring(1, length - 1);
               return isPalindrome(shorter);
            }
            else
            {
               // If the characters do not match, it's not a palindrome
               return false;
            }
         }
         // If the last character is not a letter, recursively check the substring without the last character
         else if (!Character.isLetter(last))
         {
            String shorter = text.substring(0, length - 1); 
            return isPalindrome(shorter);
         }
         // If the first character is not a letter, recursively check the substring without the first character
         else
         {
            String shorter = text.substring(1); 
            return isPalindrome(shorter);
         }
      }
   }   
}
