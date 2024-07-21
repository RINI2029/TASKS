import java.util.Scanner;
public class task_one_discount
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        float Amount = scanner.nextFloat();
        float finalAmount;

        if (Amount<500)
        {
            finalAmount=Amount;
        }
        else if (Amount>=500 && Amount<=1000)
        {
            finalAmount = (float)(Amount-(Amount * 0.10));
        }
        else
        {
            finalAmount = (float)(Amount-(Amount * 0.20));
        }

        System.out.println("Final amount with discount: Rs. " + finalAmount);
        scanner.close();
    }
}


