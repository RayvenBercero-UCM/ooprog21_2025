import java.util.*;
public class ArraysDemo {
   public static void main(String[] args) {
      int[] array = new int[5];
      String message = "";
      
      display("Original array:             ", array);
      
      Arrays.fill(array, 8);
      display("\nAfter filling with 8s:      ", array);
      
      array[2] = 6;
      array[4] = 3;
      display("\nAfter changing two values:  ",array);
      
      Arrays.sort(array);
      display("\nAfter sorting:              ",array);
   }
   public static void display(String message, int array[]) {
      System.out.print(message + " ");
      
      for (int arrays : array) {
         System.out.print(arrays + " ");
      }
   }
}