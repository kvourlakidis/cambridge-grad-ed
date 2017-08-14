// First medium difficulty problem.
// In the number grid, find the greatest product of four
// adjacent numbers in the same direction (up, down, left, right,
// diagonally).

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class Problem011 {
	public static void main(String[] args) throws IOException {
		int gridSize = 20;
		/* [row] [column] */
		int[][] grid = new int[gridSize][gridSize];
		String[] gridLine = new String[gridSize];
		String filePath = "Problem011.txt";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		String currentLine = "";
		for (int i=0;i<gridSize;i++) {
			currentLine = br.readLine();
			gridLine = currentLine.split(" ");
			for (int j=0;j<gridSize;j++) {
				grid[i][j] = Integer.parseInt(gridLine[j]);
			} 
		}
		br.close();
		fr.close();
		Kirill.main(grid);
	}
}

class Kirill {

	private static final int GRID_SIZE = 20;

	static void main(int[][] grid) {

		// check all the horizontals
		for (int i=0;i<GRID_SIZE;i++) {
			// maxInRow(grid[i]);
			break;
		}

		// flip the grid
		int[][] flippedGrid = flip(grid);

		// check all the verticals
		for (int i=0;i<GRID_SIZE;i++) {
			// maxInRow(flippedGrid[i]);
			break;
		}

		// check all the diagonals

		// check the positively sloping diagonals
		for (int i=0;i<GRID_SIZE;i++) {
			ArrayList<int> intList = new ArrayList<>();
			try {
				for(int x=i,y=0;true;x--,y++) {
					intList.add(grid[x][y]);
				}
			} catch (ArrayIndexOutOfBoundsException ex) {
				maxInRow(intList.toArray());
				break;
 				
			}
		}

		// check the negatively sloping diagonals
	}

	static int maxInRow(int[] row) {
		final int numDigits = 4;
		int maxProduct = 0;
		for (int i=0;i<=(row.length-numDigits);i++) {
			System.out.println(row[i] + " " + row[i+1] + " " + row[i+2] + " " + row[i+3]);
		}
		return 0;
	}

	static int[][] flip(int[][] grid) {
		int height = grid.length;
		int width  = grid[0].length;
		int[][] newGrid = new int[width][height];
		for (int i=0;i<height;i++)
			for (int j=0;j<width;j++)
				newGrid[j][i] = grid[i][j];
		return newGrid;
	}
}
