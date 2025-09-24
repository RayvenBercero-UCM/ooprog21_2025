public class DebugPen
{
   private String color;
   private String point;
   public static void main(String[] args) {
      DebugPen pen = new DebugPen();
      System.out.println("Color: " + pen.getColor());
      System.out.println("Point: " + pen.getPoint());
   }
   public DebugPen()
   {
      color = "black";
      point = "fine";
   }
   public String DebugPen(String color, String point)
   {
      color = color;
      point = point;
      return color;
   }
   public String getColor()
   {
      return color;
   }
   public String getPoint()
   {
      return point;
   }
}
