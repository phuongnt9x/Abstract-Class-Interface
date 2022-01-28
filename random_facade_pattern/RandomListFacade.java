package random_facade_pattern;

import java.util.List;

public class RandomListFacade {
	private RandomList randomList;
	private ListFilter listFilter;
	private ListPrinter listPrinter;

	public RandomListFacade() {
		this.randomList = new RandomList();
		this.listFilter = new ListFilter();
		this.listPrinter = new ListPrinter();
	}

	public void printRandomEvenList() {
		List<Integer> list = randomList.generateList(20, 0, 100);
		System.out.println("List before filter:");
		listPrinter.printList(list);
		System.out.println("List after filter:");
		listPrinter.printList(listFilter.filterOdd(list));
		

	}

}
