package com.company;

import java.util.Scanner;

public class LegalMovesInGo {

	private static final int NOT_EMPTY = 0;
	private static final int LEGAL_ADJACENT_LIBERTY = 1;
	private static final int LEGAL_THROUGH_CAPTURE = 2;
	private static final int ILLEGAL = 3;

	private static int checkLegality(String[] board, char c, int pos_x, int pos_y) {

		/* ------------------- INSERT CODE HERE ---------------------
		 *
		 * board[] gives us the current state of the board. 
		 *
		 * pos_x = 0, pos_y = 0, refers to the top-left intersection of the board. 
		 * pos_x = 1, pos_y = 0, refers to the next intersection to the right (i.e., x increases horizontally).
		 *
		 * We have to decide if the proposed move is legal or not.
		 *
		 * */

		/* -------------------- END OF INSERTION --------------------*/
		return ILLEGAL;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for(int i = 0; i < numCases; i++)
		{
			int boardSize = sc.nextInt();
			char c = sc.next().charAt(0);
			int pos_x = sc.nextInt();
			int pos_y = sc.nextInt();

			// Read the current state of the as an array of String -- all the Strings will have the same length = boardSize
			String[] board = new String[boardSize];

			for(int j = 0; j < boardSize; j++)
				board[j] = sc.next();

			int ret = checkLegality(board, c, pos_x, pos_y);
			System.out.print("Move " + c + " in position (" + pos_x + ", " + pos_y + ") is ");
			switch(ret) {
				case NOT_EMPTY:
					System.out.println("illegal - the position is not empty.");
					break;
				case LEGAL_THROUGH_CAPTURE:
					System.out.println("legal through capture of opponent's stones.");
					break;
				case LEGAL_ADJACENT_LIBERTY:
					System.out.println("legal - there is an adjacent (shared) liberty.");
					break;
				default:
					System.out.println("illegal.");
					break;
			}
		}

		sc.close();
	}
}
