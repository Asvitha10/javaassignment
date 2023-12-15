package classjava;

import java.util.Scanner;

public class AgeVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.print("Enter your Age ");
		Scanner r=new Scanner(System.in);
		age=r.nextInt();
		if(age>=18)
		{
			System.out.print("Eligible for votes ");
		}
		else
		{
			System.out.print("Not Eligible for votes ");
		
				
		}
	}

}
