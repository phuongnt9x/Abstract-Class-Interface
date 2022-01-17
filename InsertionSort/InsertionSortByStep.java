package InsertionSort;

public class InsertionSortByStep {

	static int[] list = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12, 4 };

	public static void insertionSort(int[] array) {
		int pos, x;
		for (int i = 1; i < array.length; i++) {
			x = array[i];
			pos = i;
			System.out.println("Insert " + "a[" + i + "] " + "to a[0] ... a[" + i + "]");
			while (pos > 0 && x < array[pos - 1]) {
				array[pos] = array[pos - 1];
				pos--;
			}
			array[pos] = x;
			System.out.print("List after the  " + (i + 1) + "' sort: \n");
			for (int j : list) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Before:");
		for (int i : list) {
			System.out.print(i + "\t");
		}
		System.out.println();
		insertionSort(list);
		System.out.println();
		System.out.println("After:");
		for (int i : list) {
			System.out.print(i + "\t");
		}

	}

}
