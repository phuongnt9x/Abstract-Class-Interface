package collection_adapter_pattern;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		CollectionOperations collOperations = new CollectionUtilsAdapter();
		Set<Integer> s = new HashSet<Integer>();
		s.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
		Client cl = new Client(collOperations);
		cl.printMaxValue(s);

	}

}
