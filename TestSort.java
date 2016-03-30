import sort.InsertionSort;

public class TestSort {

	public static void printArray(Object[] a) {
		for (Object o : a) {
			System.out.print(o + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort() {
			public int compare(Object o1, Object o2) {
				return ((String) o1).compareTo((String)o2);
			}
		};
		sort.doSort(args);
		printArray(args);
	}
}