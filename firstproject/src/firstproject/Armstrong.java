package firstproject;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
// 1 5 3
		//Scanner c = new Scanner(System.in);
		//System.out.println("Enter the number");
	//int num = c.nextInt(); //153  
		
		
		int temp; 
		int num1,num2,num3;
		int result;
		
		for (int num=100;num<=999;num++)
		{
		temp=num;	
	
		num3=temp%10; // 0
		temp=temp/10; // 10
		
		num2=temp%10; // 0
		temp=temp/10; // 1
		
		num1=temp%10; //1
		temp=temp/10; //0
		result=(num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3); //1+125+27=153
		if (num==result)
		{
			System.out.println("given number is armstrong : " + num);
		}
		
	}
	}
}
