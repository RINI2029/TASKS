import java.util.Scanner;
public class task_one_smallest_num
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = scanner.nextInt();

            int smallest = findSmallest(num1, num2, num3);
            System.out.println("The smallest number is: " + smallest);
            scanner.close();
        }

        public static int findSmallest(int a, int b, int c)
        {
            int smallest = a;
            if (b < smallest)
            {
                smallest = b;
            }
            if (c < smallest)
            {
                smallest = c;
            }
            return smallest;

        }
    }