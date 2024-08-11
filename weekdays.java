import java.util.Scanner;

class weekdays
{
    public static void main(String[] args)
    {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        try
        {

            System.out.print("Enter day position (0 for Sunday, 6 for Saturday): ");
            int dayIndex = scanner.nextInt();

            System.out.println("Day at position " + dayIndex + " is: " + weekdays[dayIndex]);

        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Invalid day index. Please enter a value between 0 and 6.");
        }
        finally
        {
            scanner.close();
        }
    }
}
