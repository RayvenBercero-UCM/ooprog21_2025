import javax.swing.*;

class Payroll {
    public static void main(String[] args) {
        int employeeNumber = getEmployeeNumber();
        int hoursWorked = getPayrollHoursWorked();
        int payRate = getPayrollPayRate();
        
        Employee employee = new Employee(employeeNumber, payRate);
        double regularPay = employee.calculateRegularPay(hoursWorked);
        double overtimePay = employee.calculateOvertimePay(hoursWorked);

        displayPayroll(employeeNumber, hoursWorked, payRate, regularPay, overtimePay);
    }

    public static void displayPayroll(int employeeNumber, int hoursWorked, int payRate, double regularPay, double overtimePay) {
        String output = "\nEmployee Payroll\n"
                + "Employee Number: " + employeeNumber + "\n"
                + "\nHow many hours did you work this week: " + hoursWorked
                + "\nWhat is your regular pay rate? " + payRate
                + "\nRegular Pay is " + regularPay
                + "\nOvertime Pay is " + overtimePay;

        System.out.print(output);
    }

    public static int getEmployeeNumber() {
        String employeeNumberRawValue = JOptionPane.showInputDialog(null, "Enter employee number: ");
        try {
            int employeeNumber = Integer.parseInt(employeeNumberRawValue);
            if (employeeNumber < 1 || employeeNumber > 9999) {
                JOptionPane.showMessageDialog(null, "Employee number must be between 1 and 9999.");
                System.exit(0);
            }
            return employeeNumber;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input");
            System.exit(0);
        }
        return 0;
    }

    public static int getPayrollHoursWorked() {
        String hoursWorkedRawValue = JOptionPane.showInputDialog(null, "Enter hours worked: ");
        try {
            return Integer.parseInt(hoursWorkedRawValue);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input");
            System.exit(0);
        }
        return 0;
    }

    public static int getPayrollPayRate() {
        String payRateRawValue = JOptionPane.showInputDialog(null, "Enter pay rate: ");
        try {
            return Integer.parseInt(payRateRawValue);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid input");
            System.exit(0);
        }
        return 0;
    }
}