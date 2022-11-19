package firstproject;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
//5!
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the factorial input : ");
		int a=n.nextInt();
		
		//int a=5;
		int rev =0;
		int rem;
		while (a!=0)
		{
			rem=a%10;//3,2,1
			rev=(rev*10)+rem;//3,32,321
			a=a/10;//12,1,0
		}
		System.out.println(rev);
	}

}
