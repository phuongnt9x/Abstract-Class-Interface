package SelectionSort;

public class SelectionSortByStep {
	static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5,6,11,22};
	 public static void selectionSort(double[] list) {
	     for (int i = 0; i < list.length - 1; i++) {
	         /* Find the minimum in the list[i..list.length-1] */
	         double currentMin = list[i];
	         int currentMinIndex = i;
	 
	         for (int j = i + 1; j < list.length; j++) {
	             if (currentMin > list[j]) {
	                 currentMin = list[j];
	                 currentMinIndex = j;
	             }
	         }
	         System.out.println("Current Min:" +currentMin);
	 
	         /* Swap list[i] with list[currentMinIndex] if necessary */
	         if (currentMinIndex != i) {
	        	  System.out.println("Swap " + list[i] + " with " + currentMin);
	             list[currentMinIndex] = list[i];
	             list[i] = currentMin;
	         }else {
	        	 System.out.println("No change:"+currentMin);
	         }
	         System.out.print("List after the  " + (i+1) + "' sort: ");
	         for (int j = 0; j < list.length; j++) {
	             System.out.print(list[j] + "\t");
	         }
	         System.out.println();
	     }
	 }
	 public static void main(String[] args) {
		 System.out.println("List before sort:");
		 for (int i = 0; i < list.length; i++)
	         System.out.print(list[i] + "\t");
		 System.out.println();
	     selectionSort(list);
	     System.out.print("-----------List after sorted -----------------\n");
	     for (int i = 0; i < list.length; i++)
	         System.out.print(list[i] + "\t");
	 }

}
