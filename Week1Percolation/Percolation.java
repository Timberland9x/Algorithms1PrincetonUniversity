
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	// creates n-by-n grid, with all sites initially blocked
	boolean[][] openSites;
	WeightedQuickUnionUF g;
	int len;
	private final int virtualTop;
	private final int virtualBottom;
	int openSiteCount;

	public Percolation(int n) {
		if (n <= 0)
			throw new IllegalArgumentException("n must be greater than 0");

		len = n;
		openSites = new boolean[n][n];
		g = new WeightedQuickUnionUF(n * n + 2);
		virtualTop = n * n;
		virtualBottom = n * n + 1;
		openSiteCount = 0;
	}

	// opens the site (row, col) if it is not open already
	public void open(int row, int col) {

		if(checkIndex(row, col))
			throw new IllegalArgumentException("row & col must be within the grid range");

		int index = (row - 1) * len + (col - 1);

		if (!openSites[row-1][col-1])
			openSites[row - 1][col - 1] = true;
			openSiteCount++;
		// 4 if statements to union all 4 sides
		if(row == 1){
			g.union(index, virtualTop);
		}
		if (row == len) {
			g.union(index, virtualBottom);
		}
		if (row > 1 && isOpen(row - 1, col)) {
            g.union(index, (row - 2) * len + (col - 1));
        }
        if (row < len && isOpen(row + 1, col)) {
            g.union(index, row * len + (col - 1));
        }
        if (col > 1 && isOpen(row, col - 1)) {
            g.union(index, (row - 1) * len + (col - 2));
        }
        if (col < len && isOpen(row, col + 1)) {
            g.union(index, (row - 1) * len + col);
        }
	}

	// is the site (row, col) open?
	public boolean isOpen(int row, int col) {
		if(checkIndex(row, col)){
			throw new IllegalArgumentException("row and col must be within the grid range");
		}
		return openSites[row - 1][col - 1];
	}

	// is the site (row, col) full?
	public boolean isFull(int row, int col) {
		if (checkIndex(row, col))
			throw new IllegalArgumentException("row and col must be within the grid range");
		int index = (row - 1) * len + (col - 1);
		return g.connected(index, virtualTop);
	}

	// returns the number of open sites
	public int numberOfOpenSites() {
		return openSiteCount;
	}

	// does the system percolate?
	public boolean percolates() {
		return g.connected(virtualTop, virtualBottom);

	}

	private boolean checkIndex(int i, int j) {
		if (i < 1 || i > len || j < 1 || j > len)
			return false;
		return true;
	}

	// test client (optional)
	public static void main(String[] args) {
		System.out.println("Test Print");
	}
}
