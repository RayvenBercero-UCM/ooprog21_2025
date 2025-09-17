import javax.swing.*;
      class DemoGrossPay {
         public static void main(String[] args) {
            double hour1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hours worked: "));
            double hour2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hours worked: "));
            double hour3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter hours worked: "));
            
            calculateGross(hour1,hour2,hour3);
         }
         public static double calculateGross(double hour1, double hour2, double hour3) {
            final double HOURLY_RATE = 22.75;
            double totalGrossPay1 = hour1 * HOURLY_RATE;
            double totalGrossPay2 = hour2 * HOURLY_RATE;
            double totalGrossPay3 = hour3 * HOURLY_RATE;
            
            System.out.printf("%.1f hours at $%.2f per hour is $%.1f%n", hour1, HOURLY_RATE, totalGrossPay1);
            System.out.printf("%.1f hours at $%.2f per hour is $%.2f%n", hour2, HOURLY_RATE, totalGrossPay2);
            System.out.printf("%.1f hours at $%.2f per hour is $%.3f%n", hour3, HOURLY_RATE, totalGrossPay3);
            return totalGrossPay3;
      }
   }