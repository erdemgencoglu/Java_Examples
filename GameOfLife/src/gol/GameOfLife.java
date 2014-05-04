package gol;

import java.util.Scanner;

public class GameOfLife {

	private boolean[][] array;

	public static void main(String[] args) {
		GameOfLife generation = new GameOfLife();
		Scanner scn = new Scanner(System.in);
		int adet;
		System.out.println("İlk nesil\n ");
		System.out.println(generation);
		System.out.print("\n Kaç adet nesil görüntülemek istersiniz?");
		adet=scn.nextInt();		
		for (int i = 0; i < adet; i++) {
			generation.next();
			System.out.println(generation);			
		}
	}
	// Constructors
	public void next() {
		int SIZE;
		SIZE = array.length;
		boolean[][] tempCells = new boolean[SIZE][SIZE];

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				tempCells[i][j] = array[i][j];
			}
		}
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (neighbours(row, col) > 3 || neighbours(row, col) < 2) {
					tempCells[row][col] = false;
				} else if (neighbours(row, col) == 3) {
					tempCells[row][col] = true;
				}

			}

		}
		array = tempCells;
	}
	public int neighbours(int row, int col) {
		int acc = 0;
		for (int i = row - 1; i <= row + 1; i++) {
			for (int j = col - 1; j <= col + 1; j++) {
				try {
					if (array[i][j] == true && (i != row || j != col)) {
						acc++;
					}
				} catch (ArrayIndexOutOfBoundsException f) {
					continue;
				}
			}
		}
		return acc;
	}
	
	public GameOfLife() {
		int SIZE = 8;		
		int[][] pairs = { { 2, 4 }, { 3, 3 }, { 1, 2 }, { 2, 2 },
				{ 3, 2 } };
		array = new boolean[SIZE][];
		for (int row = 0; row < SIZE; row++) {
			array[row] = new boolean[SIZE];
		}
		for (int pair = 0; pair < pairs.length; pair++) {
			final int row = pairs[pair][0];
			final int col = pairs[pair][1];
			array[row][col] = true;
		}
	}
	@Override
	public String toString() {
		String result = "";
		for (int row = 0; row < array.length; row++) {
			boolean[] column = array[row];
			for (int col = 0; col < column.length; col++) {
				result = result + (column[col] ? "x" : ".");
			}
			result = result + "\n";
		}
		return result;
	}
}
