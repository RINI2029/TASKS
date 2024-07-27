import java.util.Scanner;

class task_two_person
{
    protected String name;
    protected int age;

    public task_two_person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void displayPersonDetails()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person
{
    private int employeeID;
    private double salary;

    public Employee(String name, int age, int employeeID, double salary)
    {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

     void displayEmployeeDetails()
     {
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }
}

class Main
{
    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Enter employee ID: ");
        int employeeID = scanner.nextInt();
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();


        Employee employee = new Employee(name, age, employeeID, salary);

        employee.displayEmployeeDetails();
    }
}

