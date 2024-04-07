
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	// creates n-by-n grid, with all sites initially blocked
	boolean[][] grid;
	WeightedQuickUnionUF g;

	public Percolation(int n) {
		g = new WeightedQuickUnionUF(n);
		boolean[][] grid = new boolean[n][n];
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				grid[row][col] = false;
			}
		}
	}

	// opens the site (row, col) if it is not open already
	public void open(int row, int col) {
		grid[row][col] = true;
		// 4 if statements to union all 4 sides
		if (g.connected(row + 1, col) != true) {
			g.union(row + 1, col);
		}
	}

	// is the site (row, col) open?
	public boolean isOpen(int row, int col) {
		if (grid[row][col] == true)
			return true;
		return false;
	}

	// is the site (row, col) full?
	public boolean isFull(int row, int col) {
		if (grid[row][col] == true)
			return true;
		return false;
	}

	// returns the number of open sites
	public int numberOfOpenSites() {
		return g.count();
	}

	// does the system percolate?
	public boolean percolates() {
		return true;

	}

	// test client (optional)
	public static void main(String[] args) {
		System.out.println("Test Print");
	}
}
