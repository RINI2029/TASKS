import java.util.Scanner;
public class task_two_product
{
    private int PID;
    private double prize;
    private int quantity;

    public task_two_product(int PID, double prize, int quantity)
    {
        this.PID = PID;
        this.prize = prize;
        this.quantity = quantity;
    }
    public int getPID()
    {
        return PID;
    }
    public void setPID(int PID)
    {
        this.PID = PID;
    }
    public double getPrize()
    {
        return prize;
    }
    public void setPrize(double prize)
    {
        this.prize = prize;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}



 class XYZ
 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        task_two_product[] products = new task_two_product[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter PID, prize, and quantity for product " + (i + 1) + ":");
            int PID = scanner.nextInt();
            double prize = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = new task_two_product(PID, prize, quantity);
        }

        int highestPID = findHighestPrizePID(products);
        System.out.println("PID of the product with highest prize: " + highestPID);

        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on the products: " + totalAmount);
    }

    static int findHighestPrizePID(task_two_product[] products)
    {
        int highestPID = products[0].getPID();
        double highestPrize = products[0].getPrize();
        for (task_two_product product : products)
        {
            if (product.getPrize() > highestPrize)
            {
                highestPID = product.getPID();
                highestPrize = product.getPrize();
            }
        }
        return highestPID;
    }

     static double calculateTotalAmount(task_two_product[] products)
     {
        double totalAmount = 0;
        for (task_two_product product : products)
        {
            totalAmount += product.getPrize() * product.getQuantity();
        }
        return totalAmount;
    }
}

