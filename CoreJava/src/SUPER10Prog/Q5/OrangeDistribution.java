package SUPER10Prog.Q5;
import java.util.*;
public class OrangeDistribution 
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of oranges plucked: ");
        int numOranges = sc.nextInt();
        
        int orangesForOwner = (int) (numOranges * 0.4);
        int remainingOranges = numOranges - orangesForOwner;
        int orangesPerWorker = remainingOranges / 4;
        int balanceForJuice = remainingOranges % 4;
        
        // Output the results
        System.out.println("Total oranges for the owner is " + orangesForOwner);
        System.out.println("Total oranges for each worker is " + orangesPerWorker);
        System.out.println("Balance of oranges to make juice is " + balanceForJuice);

        sc.close();
    }
}
