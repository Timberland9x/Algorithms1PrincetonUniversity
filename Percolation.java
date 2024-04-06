
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	// creates n-by-n grid, with all sites initially blocked
	boolean[][] grid;

	public Percolation(int n) {
		boolean[][] grid = new boolean[0][0];
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				grid[row][col] = false;
			}
		}
	}

	// opens the site (row, col) if it is not open already
	public void open(int row, int col) {
		grid[row][col] = true;
	}

	// is the site (row, col) open?
	public boolean isOpen(int row, int col) {
		if(grid[row][col] == true)
			return true;
		return true;
	}

	// is the site (row, col) full?
	public boolean isFull(int row, int col) {
		return true;
	}

	// returns the number of open sites
	public int numberOfOpenSites() {
		return 1;
	}

	// does the system percolate?
	public boolean percolates() {
		return true;

	}

	// test client (optional)
	public static void main(String[] args) {
		Percolation haha = new Percolation(20);
		System.out.println();

		System.out.println("Test Print");
	}
}
