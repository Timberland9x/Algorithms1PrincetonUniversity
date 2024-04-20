public class Unionfind {
	int root[];
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

	public int find(int p) {
		if (root[p] != p) {
			root[p] = find(root[p]); // path compression: set parent to the root
		}
		return root[p];
	}

	public void union(int u) {

	}


}


