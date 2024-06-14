package SUPER10Prog.Q1;
import java.util.*;
public class AccountMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        Account Acc [] = new Account [100];
        int ch=0;
        do
        {
        	   System.out.println("1)Create Account");
        	   System.out.println("2)Display Account By Id");
        	   System.out.println("3)Deposit");
        	   System.out.println("4)withdraw");
        	   System.out.println("5)Transfer");
        	   System.out.println("6)Display All Account");
        	   System.out.println("7)Display Account By City");
        	   System.out.print("Enter your choice:");
        	   ch=sc.nextInt();
        	switch(ch)
        	{
        	case 1:
        	       Acc[Account.cnt]=new Account();
          	       Acc[Account.cnt-1].accept();
               		break;
        	case 2:
				System.out.println("Enter Account Id:");
				int acno = sc.nextInt();
				int flag = 0;
				for (int i = 0; i < Account.cnt; i++) 
				{
					if (Acc[i].ano == acno) 
					{
						Acc[i].display();
						flag = 1;
						break;
					}
				}
				if (flag == 0) 
				{
					System.out.println("Invalid Account number....!");
				}
        		break;
        	case 3:
        		System.out.println("Enter Account Id:");
        		acno = sc.nextInt();
        		System.out.print("Enter amount to deposit: ");
        		int depositAmount = sc.nextInt();
        		flag = 0;
        		for (int i = 0; i < Account.cnt; i++)
        		{
                    if (Acc[i].ano == acno) 
                    {
                        Acc[i].deposit(depositAmount);
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) 
                {
                    System.out.println("Invalid Account number....!");
                }
        		break;
        	case 4:
        		System.out.print("Enter Account Id: ");
                acno = sc.nextInt();
                System.out.print("Enter amount to withdraw: ");
                int withdrawAmount = sc.nextInt();
                flag = 0;
                for (int i = 0; i < Account.cnt; i++) {
                    if (Acc[i].ano == acno) {
                        Acc[i].withdraw(withdrawAmount);
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println("Invalid Account number....!");
                }
                break;
        	case 5:
        		System.out.print("Enter sender Account Id: ");
                int senderAcno = sc.nextInt();
                System.out.print("Enter receiver Account Id: ");
                int receiverAcno = sc.nextInt();
                System.out.print("Enter amount to transfer: ");
                int transferAmount = sc.nextInt();
                Account sender = null, receiver = null;
                for (int i = 0; i < Account.cnt; i++) {
                    if (Acc[i].ano == senderAcno) {
                        sender = Acc[i];
                    } else if (Acc[i].ano == receiverAcno) {
                        receiver = Acc[i];
                    }
                }
                if (sender != null && receiver != null) {
                    sender.transfer(receiver, transferAmount);
                } else {
                    System.out.println("Invalid Account numbers....!");
                }
        		break;
        	case 6:
        		for (int i = 0; i < Account.cnt; i++) {
                    Acc[i].display();
                }
        		break;
        	case 7:
        		System.out.print("Enter city: ");
                String city = sc.next();
                for (int i = 0; i < Account.cnt; i++) {
                    if (Acc[i].city.equalsIgnoreCase(city)) {
                        Acc[i].display();
                    }
                }
        		break;

        		
        	}
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }while(ch!=10);
	}//end main

}//end class
