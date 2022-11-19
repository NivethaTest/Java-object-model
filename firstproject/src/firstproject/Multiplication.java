package firstproject;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("enter the table : ");
		int table = a.nextInt(); //2

		System.out.println("enter the limit : ");
		int limit= a.nextInt(); //10
		
		
		
		for(int i=1;i<=limit;i++) 
		{
			System.out.println(i+" x "+table + " = " + (table*i));
		}
	}

}
