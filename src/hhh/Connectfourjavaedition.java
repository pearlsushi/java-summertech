package hhh;

import java.util.Scanner;

public class Connectfourjavaedition {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int tie = 0;
		boolean running = true;
		boolean oturn = true;
		String[][] board = genb(6,7);
		prib(board);
		while(running==true) {
			while(oturn == true) {
				pp(board,"o");
				prib(board);
				tie+=1;
				oturn = false;
			}
			while(oturn == false) {
				pp(board,"+");
				prib(board);
				tie+=1;
				oturn = true;
			}
			
			if(wincheckeruwu(board,"+") == true) {
				running = false;
			}
			if(wincheckeruwu(board,"o") == true) {
				running = false;
			}
			else if(tie==42) {
				System.out.println("congrats, you tie!! (somehow...)");
				running = false;
			}
		}
		System.out.println("hey would u like to play again owo????????????? (yes or no)");
		String owo = scan.next();
		if(owo=="no") {
			System.out.println("Alright gbye");
		}
		if(owo=="yes") {
			System.out.println("Alright have fun");
			running = true;
		}
		prib(board);	
	}
	public static String[][] genb(int height, int length) {
		String[][] board = new String[height][length];
		for (int a = 0; a < height; a++) {
			for (int asd = 0; asd < length; asd++)
				board[a][asd] = "| |";
		}
		return board;
	}
	public static void prib(String[][] board) {
		for (int a = 0; a < board.length; a++) {
			for (int asd = 0; asd < board[0].length; asd++)
				System.out.print(board[a][asd]);
			System.out.println();
		}
	}
	public static String[][] pp(String[][] board, String player) {
		int col;
		int tie = 0;
		while(true) {
			System.out.println(player+",what column would you like to put your piece in? pick a number 1-7");
			col = scan.nextInt();
			if(col<0 || col>7) {
				System.out.println("stupiddddd. pick a number between 1-7");
			}
			
			else if(board[0][col-1]!="| |") {
				System.out.println("no dumdum that column is full or something like that");
			}
			else {
				break;
			} 
		}
		tie+=1;
		// board[0][col-1] = player;
		antigravity(board,player,col);
		return board;
	}
	public static String[][] antigravity(String[][] board, String player, int column) {
		int height = board.length;
		
		for(int h = 5; h < height; h--) {
			System.out.println(column);
			
			if(board[h][column-1] == "| |") {
				board[h][column-1] = "|"+player+"|";
				break;
			}
		}
		return board;
	}
	public static boolean wincheckeruwu(String[][] board, String player) {
		for (int a = 0; a < 6; a++) {
			for (int b = 0; b < 5; b++) {
				if(board[a][b]=="|"+player+"|" && board[a][b+1]=="|"+player+"|" && board[a][b+2]=="|"+player+"|" && board[a][b+3]=="|"+player+"|") {
					System.out.println("congrats "+player+"! you win");
					return true;
				}
				
			}
		}
		for (int c = 0; c < 6; c++) { // 7???
			for (int d = 0; d < 3; d++) {
				if(board[c][d]=="|"+player+"|" && board[c+1][d]=="|"+player+"|" && board[c+2][d]=="|"+player+"|" && board[c+3][d]=="|"+player+"|") {
					System.out.println("congrats "+player+"! you win");
					return true;
				}
				
			}
		}
		for (int e = 0; e < 4; e++) {
			for (int f = 0; f < 3; f++) {
				if(board[e][f]=="|"+player+"|" && board[e+1][f+1]=="|"+player+"|" && board[e+2][f+2]=="|"+player+"|" && board[e+3][f+3]=="|"+player+"|") {
					System.out.println("congrats "+player+"! you win");
					return true;
				}
				
			}
		}
		for (int g = 3; g < 6; g++) {
			for (int h = 0; h < 3; h++) {
				if(board[g][h]=="|"+player+"|" && board[g-1][h-1]=="|"+player+"|" && board[g-2][h+2]=="|"+player+"|" && board[g-3][h+3]=="|"+player+"|") {
					System.out.println("congrats "+player+"! you win");
					return true;
				}
				
			}
		}
		return false;
	}
}
