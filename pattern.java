import java.util.Scanner;

public class task_one_pattern{

    public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for k: ");
        int k = scanner.nextInt();
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                if (i > j) {
                    System.out.print(k);
                } else {
                    System.out.print(j);
                }
            }
            k--;
            System.out.println();
        }

        scanner.close();
    }
}

