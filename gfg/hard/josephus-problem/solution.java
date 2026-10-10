class Solution {
	public int josephus(int n, int k) {
		// code here
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i<=n; i++) {
			al.add(i); }
			int j = 0;
			while (al.size()>1) {
				j = (j + k-1)%al.size();
				al.remove(j);
			}
			return al.get(0);
		}
	}
