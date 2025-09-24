public class DebugBox
{
   private int width;
   private int length;
   private int height;
   
   public static void main(String[] args) {
      DebugBox box = new DebugBox();
      
      System.out.println("Length: " + box.length);
      System.out.println("Width: " + box.width);
      System.out.println("Height: " + box.height);
   }
   public DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public int DebugBox(int width, int length, int height)
   {
      this.width = width;
      this.length = length;
      this.height = height;
      return width;
   }
   public void showData()
   {
      System.out.println("Width: "  + width + "  Length: " +
        length + "  Height: " + height);
   }
   public double getVolume()
   { 
      double vol = length * width * height;
      return vol;
   }
}
