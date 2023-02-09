import java.util.*;
class Atm
{
	//static int anum=10110010,balance=0;
	public static void main(String[] args)
	{
		String name1;
		int pinno,apinno,i,choice,trans=0;
		int balance=0;
		String trans_history="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to ATM interface");
		System.out.println("-------------------------------------");
		System.out.println("Enter your name");
		name1=sc.nextLine();
		System.out.println("Welcome "+name1+"...\n");
		System.out.println("Enter 4 digit pin");
		pinno=sc.nextInt();
		/*if(pin>1000&&pin<9999)
			System.out.println("Your pin is created successfully");
		else
			System.out.println("please enter correct pin");*/
		System.out.println("name is:"+name1);
		//System.out.println("account number is:"+anum);
		System.out.println("ATM pin is:"+pinno);
		System.out.println("*************************");
		System.out.println("proceed with ATM pin");
		System.out.println("pin is entered more than 3 times then account is locked");
		for(i=0;i<4;i++)
		{
			System.out.println("Enter ATM pin");
			apinno=sc.nextInt();
			if(apinno==pinno)
			{
				System.out.println("pin is correct");
				while(true)
				{
					System.out.println("1:Deposit");
					System.out.println("2:Withdraw");
					System.out.println("3:Check balance");
					System.out.println("4:Transfer");
					System.out.println("5:Transaction history");
					System.out.println("0:exit");
					System.out.println("Enter your choice");
					choice=sc.nextInt();
					switch(choice)
					{
						case 1:System.out.println("Enter money to be deposited");
							int deposit=sc.nextInt();
							balance=balance+deposit;
							trans++;
							System.out.println("Deposited successfully");
							String str=deposit+" deposited\n";
							trans_history=trans_history.concat(str);
							break;
						case 2:System.out.println("Enter money to withdraw");
							int with=sc.nextInt();
							if(with%100==0&&with<balance)
							{
								balance=balance-with;
								trans++;
								System.out.println("Withdraw successfully");
								String str1=with+" withdrawn\n";
								trans_history=trans_history.concat(str1);
							}
							else
							{
								System.out.println("Insufficient balance");
							}
							break;
						case 3:System.out.println("your name is:"+name1);
							System.out.println("Balance is:"+balance);
							break;
						case 4:System.out.println("Enter recepient name");
							String sname=sc.next();
							System.out.println("Enter money to transfer");
							int trans_amount=sc.nextInt();
							if(trans_amount<balance)
							{
								balance=balance-trans_amount;
								trans++;
								System.out.println("Transferred successfully");
								String str2=trans_amount+" transferred\n";
								trans_history=trans_history.concat(str2);
							}
							else
							{
								System.out.println("cannot transfer amount");
							}
							break;
						case 5:if(trans==0)
							{
								System.out.println("Empty");
							}
							else
							{
								System.out.println("\n"+trans_history);
							}
							break;
						case 0:System.out.println("Thank you for visiting our bank");
							System.exit(0);
							break;
				
					}
					
				}
				
			}
			else 
			{
				System.out.println("invalid pin");

			}
			

		}
		if(i>3)
			{
				System.out.println("your account is unlocked after 24 hours");
			}



	}
}