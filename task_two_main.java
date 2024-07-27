import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name)
    {
        this(name, 18);
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void displayDetails()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

public class task_two_main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter age (or press enter for default age 18): ");
        String ageInput = scanner.nextLine();
        int age = ageInput.isEmpty() ? 18 : Integer.parseInt(ageInput);

        Person person = new Person(name, age);
        person.displayDetails();
    }
}