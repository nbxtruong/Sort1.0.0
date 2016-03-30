package sort;

public abstract class InsertionSort {
	
	protected abstract int compare(Object o1, Object o2);
	
	private void insert(int i, Object[] data) {
		if (i < data.length - 1) {
			if (compare(data[i], data[i + 1]) > 0) {
				Object tmp = data[i];
				data[i] = data[i + 1];
				data[i + 1] = tmp;
				insert(i + 1, data);
			}
		}
	}

	public void doSort(Object[] a) {
		for (int i = a.length - 2; i >= 0; --i) {
			insert(i, a);
		}
	}
}