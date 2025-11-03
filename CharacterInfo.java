import java.util.*;
public class CharacterInfo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      char aChar;
      
      System.out.print("The character is: ");
      aChar = input.next().charAt(0);
      
      if (Character.isUpperCase(aChar)) {
         System.out.println(aChar + " is upper case");
      } else if (Character.isLowerCase(aChar)) {
         System.out.println(aChar + " is not upper case");
      } else {
         System.out.println(aChar + " is not a letter");
      }
      
      if (Character.isLowerCase(aChar)) {
         System.out.println(aChar + " is lower case");
      } else if (Character.isUpperCase(aChar)){
         System.out.println(aChar + " is not lower case");
      } else {
         System.out.println(aChar + " is not a letter");
      }
      
      System.out.println("After toLowerCase(), aChar is " + Character.toLowerCase(aChar));
      System.out.println("After toUpperCase(), aChar is " + Character.toUpperCase(aChar));
      
      if (Character.isLetterOrDigit(aChar)) {
         System.out.println(aChar + " is a letter or a digit");
      } else {
         System.out.println(aChar + " is not a letter or a digit");
      }
      
      if (Character.isWhitespace(aChar)) {
         System.out.println(aChar + " is a whitespace");
      } else {
         System.out.println(aChar + " is not a whitespace");
      }
      
   }
}
