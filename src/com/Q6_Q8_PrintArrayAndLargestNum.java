package com;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_Q8_PrintArrayAndLargestNum {
	
	public static void main(String[] ar) {
		/*int[] arr = {10, 50, 45, 90, 230};
		int max = Arrays.stream(arr).max().getAsInt();*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int n = sc.nextInt();
		
		int[] max_arr = new int[n];
		System.out.println("Enter elements:");
		for(int i=0; i<n ; i++) {
			max_arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements of Array:" + Arrays.toString(max_arr));
		
		
		int max = Arrays.stream(max_arr).max().getAsInt();
		
		System.out.println("Largest element in Array : "+max);
	}
}