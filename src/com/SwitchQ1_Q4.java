package com;

import java.util.Scanner;

public class SwitchQ1_Q4 {
	
	static void isPrime(int num) {
		boolean flag = true;
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Number is prime.");
		else
			System.out.println("Not Prime");
	}
	
	static void isPalin(int num) {
		int n = num,rev=0,d;
		
		while(n != 0) {
			d = n%10;
			rev = rev*10+d;
			n = n/10;
		}
		
		if(rev==num)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	
	static void isEvenOdd(int num) {
		String res = (num%2 == 0) ? "Even" : "Odd";
		System.out.println("Number is " + res);;
	}
	
	static void isArmstrong(int num) {
		int n=num,res=0,mod;
		int count = 0;
		while(n!=0) { //count number of digits
			count++;
			n = n/10;
		}
		
		n=num;
		
		while(n>0) {
			mod = n%10;
			res = (int) (res + Math.pow(mod, count));
			n = n/10;
		}
		
		if(res==num)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}

	public static void main(String[] args) {
		String yes = "y";
		int val = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		while(yes.equalsIgnoreCase("y")) {
			
			System.out.println("Choose an option(1-4):");
			System.out.println("1.Check Prime");
			System.out.println("2. Check Palindrome");
			System.out.println("3. Check Even or Odd");
			System.out.println("4. Check Armstrong");
			//System.out.println("5. Exit");
			val = sc.nextInt();
			switch (val) {
			case 1:
				isPrime(num);
				break;

			case 2:
				isPalin(num);
				break;
				
			case 3:
				isEvenOdd(num);
				break;
				
			case 4: 
				isArmstrong(num);
				break;
				
			default:
				System.out.println("Wrong Choice..!!");
				break;
			}
			
			System.out.println("Do you want to continue (y/n)?");
			yes = sc.next();
		}
		
		System.exit(0);

	}

}
