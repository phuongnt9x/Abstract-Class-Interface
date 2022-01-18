package BST_Array;

import java.util.ArrayList;
import java.util.List;

public class BTSTest {

	public static void main(String[] args) {
		int[] a= {20,10,8,40,16,30,80,27,50,90,11,18,17,81,29};
		BTS_Array<Integer> bts=new BTS_Array<Integer>(200);
		for(int i:a) {
			bts.insertRecursive(i,0);
		}
		List<Integer> ls=new ArrayList<Integer>();
		bts.traverse(0,ls);
		System.out.println();
		int x=200;
		System.out.println("index x= "+bts.find(x));

	}

}
