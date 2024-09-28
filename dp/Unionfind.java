package dp;

public class Unionfind {
	static int root[];
	int index[];

	public void uf(int n) {
		root = new int[n];
		for (int i = 0; i < n; i++) {
			root[i] = i;
			index[i] = 0;

		}
		for (int i = 0; i < n; i++) {
			System.out.println(root[i]);

		}
	}

	public static int find(int p) {
		System.out.println("\nfind is running!\n");
		if (root[p] != p) {
			root[p] = find(root[p]); // path compression: set parent to the root
		}
		return root[p];
	}

	public void union(int u) {

	}

}
