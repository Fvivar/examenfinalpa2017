package gt.edu.url.problema2;

public class ImplArrayManipulator<E> implements ArrayManipulator<E> {
	
	private int permutations = 0;

	@Override
	public int subsets(List<E> set) {
		this.permute(set, set.size());
		return permutations;
	}
	
	private void swap(List<E> v, int i, int j) {
		E obj = v.get(i);
		v.set(i, v.get(j));
		v.set(j, obj);
	}

	public void permute(List<E> v, int n) {
		if (n == 1) {
			System.out.println(v.toString());
			permutations++;
		} else {
			for (int i = 0; i < n; i++) {
				permute(v, n-1);
				if (n % 2 == 1) {
					swap(v, 0, n-1);
				} else {
					swap(v, i, n-1);
				}
			}
		}
	}


}
