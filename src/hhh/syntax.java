package hhh;

import java.util.Scanner;

public class syntax {

	public static void main(String[] args) {
		System.out.println("Heyy");
		int ahah = 6;
		String awow = "value";
		Scanner scan = new Scanner(System.in);
		// String name = scan.next();
		//System.out.println(name);
		//if(name.equals("pearl")) {
			//System.out.println("heyy2.0");
		//}
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) 
				System.out.print(" + ");
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) 
				System.out.print(" + ");
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 4-i; j++) 
				System.out.print(" up ");
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 4-i; j++) 
				System.out.print(" + ");
			for(int j = 0; j < i; j++) 
				System.out.print(" + ");
			for(int j = 0; j < i-1; j++) 
				System.out.print(" + ");
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) 
				System.out.print("   ");
			for(int j = 0; j < 4-i-1; j++) 
				System.out.print(" + ");
			for(int j = 0; j < 4-i-2; j++) 
				System.out.print(" + ");
			System.out.println();
		}
	}
}


