import java.util.Scanner;
import java.util.*;
 class Tutorial1 {

	public static void main(String[] args) {
		int[]arr= {0,0,0,0,0};
		boolean finalexit=false;
		boolean av1=false;
		boolean av2=false;
		boolean av3=false;
		boolean av4=false;
		boolean av5=false;
		System.out.println("Welcome.");
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		while(finalexit==false)
		{
			boolean alltrue=false;
			int num;
			int numerase;
			boolean exit=false;
			int exit2;
			
			int selection;
			System.out.println("1: Input");
			System.out.println("2: Erase");
			System.out.println("3: Exit");
			selection=scanner.nextInt();
			if(arr[0]!=0&&arr[1]!=0&&arr[2]!=0&&arr[3]!=0&&arr[4]!=0)
				alltrue=true;
			switch(selection)
			{
			// case 1=input 2=erase 3=end
			case 1:
				
					if(alltrue==true)
						System.out.println("All numbers are full. Please erase a number or exit the program.");
					else
					{
						while(true)
						{
							System.out.println("Please enter the number you wish to enter. The number must be a positive integer.");
							num=scanner.nextInt();
							if(num<1)
								System.out.println("You have entered a negative integer or 0. Please enter again.");
							for(int a=0;a<5;a++)
							{
								if(arr[a]==0)
								{
									arr[a]=num;
									exit=true;
									break;
								}
							}
							if(exit==true)
								break;
						}
					}
					
					break;
				
			case 2:
				System.out.println("Slot 1: "+arr[0]);
				System.out.println("Slot 2: "+arr[1]);
				System.out.println("Slot 3: "+arr[2]);
				System.out.println("Slot 4: "+arr[3]);
				System.out.println("Slot 5: "+arr[4]);
				System.out.println("Please enter the number of the slot you wish to erase:");
				numerase=scanner.nextInt();
				arr[numerase-1]=0;
				break;
			case 3:
				System.out.println("Would you like to exit? Exiting will result in all the numbers being added and shown.");
				System.out.println("1: Add and Exit");
				System.out.println("2: Stay");
				exit2=scanner.nextInt();
				if(exit2==1)
				{
					int numnum=0;
					for(int b=0;b<5;b++)
						numnum=numnum+arr[b];
					System.out.println("Slot 1: "+arr[0]);
					System.out.println("Slot 2: "+arr[1]);
					System.out.println("Slot 3: "+arr[2]);
					System.out.println("Slot 4: "+arr[3]);
					System.out.println("Slot 5: "+arr[4]);
					System.out.println("SUM OF ALL 5 SLOTS: "+numnum);
					finalexit=true;
					break;
				}
				break;
			}
		}
	}

}
