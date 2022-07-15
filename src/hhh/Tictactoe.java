package hhh;

import java.util.Scanner;

public class Tictactoe {

	public static void main(String[] args) {
		boolean xturn = true;
		boolean running = true;
		boolean uwu = true;
		System.out.println("Hellooo, Welcome to Tic Tac Toe!");
		String[][] board = new String[3][3];
		for (int a = 0; a <3; a++) {
			for (int asd = 0; asd <3; asd++)
				board[a][asd] = "[_]";
			System.out.println();
		}
		String x = "x";
		String o = "o";
		namenpr(x);
		namenpr(o);
		System.out.println("let's begin, x is first");
		System.out.println();
		prib(board);
		Scanner scan = new Scanner(System.in);
		int GAMETIEORNOTwillweeverknow = 0;
		while(running = true) {
			while(uwu == true) {
				System.out.print("heyy pick your row, 0-2 (top0 to bottom2) ");
				int place1 = scan.nextInt();
				System.out.print("heyy pick your column, 0-2 (left0 to right2) ");
				int place2 = scan.nextInt();
				int spotil1 = place1;
				int spotil2 = place2;
				if(spotil1 > 2 || spotil2 > 2) {
					System.out.println("nope... try again. CAN YOU COUNT??#2/24?324?@5 pick numbers from 0-2");
					prib(board);
				}
				else {
					while(true) {
						if(board[spotil1][spotil2] == "[_]") {
							if(xturn==true) {
								board[spotil1][spotil2] = "[x]";
								prib(board);
								xturn = false;
								GAMETIEORNOTwillweeverknow += 1;
								break;
							}
							else if(xturn == false) {
								board[spotil1][spotil2] = "[o]";
								prib(board);
								xturn = true;
								GAMETIEORNOTwillweeverknow += 1;
								break;
							}
						}
						else if(board[spotil1][spotil2] != "[_]") {
							System.out.println();
							System.out.println("TRY AGAIN LOSER ARE YOU BLIND????// That spot is taken :)");
							System.out.println();
							break;
						}
					}
				}
				if(wibby("[x]",board) == true) {
					running = false;
					uwu = false;
				}
				if(wibby("[o]",board) == true) {
					running = false;
					uwu = false;
				}
				if(GAMETIEORNOTwillweeverknow == 9) {
					System.out.println("well I guess you losers TIE????? Have a nice day.");
					running = false;
					uwu = false;
				}
			}
		}
	}
	public static void namenpr(String player) {  //name and print 0-0
		System.out.println("Player " + player + ", what is your name?");
		Scanner scann = new Scanner(System.in);
		String name = scann.next();
		System.out.println("well hello, " + name + ", nice to meet you!");
	}
	public static void prib(String[][] hsa) {   //print board 0-0
		for (int e = 0; e <3; e++) {
			for (int i = 0; i <3; i++)
				System.out.print(hsa[e][i]);
			System.out.println();
		}
	}
	public static boolean wibby(String whatthisdoesisitdoesjoemama, String[][] board) {
		boolean wig = false;
		for(int j = 0; j < 3 ; j++) {
			if(board[j][0] == whatthisdoesisitdoesjoemama && board[j][1] == whatthisdoesisitdoesjoemama && board[j][2] == whatthisdoesisitdoesjoemama) {
				System.out.println(whatthisdoesisitdoesjoemama + " WINS AYYEAYE CAPITAN");
				return true;
			}
			if(board[0][j] == whatthisdoesisitdoesjoemama && board[1][j] == whatthisdoesisitdoesjoemama && board[2][j] == whatthisdoesisitdoesjoemama) {
				System.out.println(whatthisdoesisitdoesjoemama + " WINS AYYEAYE CAPITAN");
				return true;
			}
		}
		if(board[0][0] == whatthisdoesisitdoesjoemama && board[1][1] == whatthisdoesisitdoesjoemama && board[2][2] == whatthisdoesisitdoesjoemama) {
			System.out.println(whatthisdoesisitdoesjoemama + " WINS AYYEAYE CAPITAN");
			return true;
		}
		if(board[2][0] == whatthisdoesisitdoesjoemama && board[1][1] == whatthisdoesisitdoesjoemama && board[0][2] == whatthisdoesisitdoesjoemama) {
			System.out.println(whatthisdoesisitdoesjoemama + " WINS AYYEAYE CAPITAN");
			return true;
		}
		else {
			return false;
		}
		
	}
}
