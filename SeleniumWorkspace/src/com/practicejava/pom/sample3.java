package com.practicejava.pom;

public class sample3 {
public static void main(String[] args) {
	int row=5,k=0;
	for (int i=1; i<=row; i++ ,k=0) {
		for (int j = 1; j<=i-1; j++) {
			System.out.println();
		}
		while(k!=2*i-1)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
