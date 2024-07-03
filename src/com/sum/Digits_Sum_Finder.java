package com.sum;

import java.util.Scanner;

public class Digits_Sum_Finder {
	
	public static void sumFinder(int number) {
		int originalnumber = number;
		
		int sum=0;
		while(originalnumber != 0) {
			int digit = originalnumber % 10;
			sum += digit;
			originalnumber /= 10;
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		Digits_Sum_Finder.sumFinder(number);
		
		

	}

}
