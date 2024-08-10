import java.util.Scanner;

public class task_three_tax
{
    public interface Taxable
    {
    double SALES_TAX = 0.07;
    double INCOME_TAX = 0.105;

    double calcTax();
}

    public class Employee implements Taxable
    {
        private int empID;
        private String name;
        private double salary;

        public Employee(int empID, String name, double salary) {
            this.empID = empID;
            this.name = name;
            this.salary = salary;
        }

        public int getEmpID()
        {
            return empID;
        }

        public void setEmpID(int empID)
        {
            this.empID = empID;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary)
        {
            this.salary = salary;
        }

        @Override
        public double calcTax() {
            return salary * INCOME_TAX;
        }
    }

    public class Product implements Taxable
    {
        private int pid;
        private double price;
        private int quantity;
        
        public Product(int pid, double price, int quantity)
        {
            this.pid = pid;
            this.price = price;
            this.quantity = quantity;
        }

        // Getters and Setters
        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        // Implement calcTax to calculate sales tax on unit price
        @Override
        public double calcTax() {
            return price * SALES_TAX * quantity;
        }
    }


    public class DriverMain {
        public void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input Employee information
            System.out.print("Enter Employee ID: ");
            int empID = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(empID, name, salary);
            double incomeTax = employee.calcTax();
            System.out.printf("Income Tax for Employee %s (ID: %d) is: %.2f%n", name, empID, incomeTax);

            // Input Product information
            System.out.print("Enter Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Product Quantity: ");
            int quantity = scanner.nextInt();

            Product product = new Product(pid, price, quantity);
            double salesTax = product.calcTax();
            System.out.printf("Sales Tax for Product ID %d is: %.2f%n", pid, salesTax);

            scanner.close();
        }
    }
}
