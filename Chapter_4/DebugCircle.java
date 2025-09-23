public class DebugCircle
{
   private static int radius;
   private static int diameter;
   private static final double PI = 3.14159;
   private static double area;
   private static int r;
   
   public static int DebugCircle(int r)
   {
      radius = r;
      diameter = 2 * r;
      area = PI * r * r;
      return r;
   }
   public static int getRadius(int radius)
   {
      return radius;
   }
   public static int getDiameter(int diameter)
   {
      return diameter;
   }
   public static double getArea(double area)
   {
      return area;
   }
}
