public class Employee {
    private int employeeNumber;
     int payRate;
     int maxEmployeeNumber = 9999;
     double overtime = 1.5;
     
    public Employee() {
    
    }
    
    public Employee(int employeeNumber, int payRate) {
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
    }

    public double calculateRegularPay(int hoursWorked) {
        if (hoursWorked <= 40) {
        return hoursWorked * payRate;
        } else {
         return 40 * payRate;
        }
    }

    public double calculateOvertimePay(int hoursWorked) {
        if (hoursWorked <= 40) {
            return 0;
        } else {
        return (hoursWorked - 40) * payRate * overtime;
        }
    }
}