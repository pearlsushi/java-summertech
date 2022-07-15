package hhh;

public class arraay {

	public static void main(String[] args) {
		String[] hsa = new String[6];
		hsa[0]="zucchini";
		hsa[1]="watermelon";
		hsa[2]="peaches";
		hsa[3]="cucumber";
		hsa[4]="joe mama";
		hsa[5]="steven";
		
		printlist(hsa);
	}

	public static void printlist(String[] ada) {
		for (int e = 0; e < 6; e++) {
			System.out.println(ada[e]);
		}
	}
}
