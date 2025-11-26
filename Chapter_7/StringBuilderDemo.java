class StringBuilderDemo {
   public static void main(String[] args) {
   
      StringBuilder nameString = new StringBuilder("Barbara");
      
      System.out.println("(String Builder 1) nameString: " + nameString);
      System.out.println("The capacity of nameString is: " + nameString.capacity());
      
      StringBuilder addressString = new StringBuilder("6311 Hickory Nut Grove Road");

      System.out.println("\n(String Builder 2) addressString: " + addressString);
      System.out.println("The capacity of nameString is: " + addressString.capacity());
      
      nameString.setLength(20);
      addressString.setLength(20);
      
      System.out.println("\n(Length set to 20 for String Builder 1) The name is " + nameString + "end");
      System.out.println("(Length set to 20 for String Builder 2) The address is " + addressString);
      
   }
}
