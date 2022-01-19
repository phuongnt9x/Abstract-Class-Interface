package BST_Array;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BTS_ArrayTest {

	@Test
	void testBTS_Array() {
		int[] a= {20,10,8,40};
		BTS_Array<Integer> bts=new BTS_Array<Integer>(200);
		for(int i:a) {
			bts.insertRecursive(i,0);
		}
		List<Integer> expected=new ArrayList<Integer>();
		expected.add(8);
		expected.add(10);
		expected.add(20);
		expected.add(40);
		List<Integer> rs=new ArrayList<Integer>();
		bts.traverse(0,rs);
			
		assertEquals(expected, rs);
	}
	@Test
	void testBTS_Array1() {
		int[] a= {20,10,8,40,16,30,80,27,50,90,11,18,17,81,29};
		BTS_Array<Integer> bts=new BTS_Array<Integer>(200);
		for(int i:a) {
			bts.insertRecursive(i,0);
		}
		int expected=-1;
			
		assertEquals(expected, bts.find(200));
	}
	@Test
	void testBTS_add() {
		int[] a= {20,10,6};
		BTS_Array<Integer> bts=new BTS_Array<Integer>(200);
		for(int i:a) {
			bts.insertRecursive(i,0);
		}
		int expected=6;
			
		assertEquals(expected, bts.tree.get(3));
	}
	@Test
	void testBTS_add1() {
		int[] a= {20,10,6};
		BTS_Array<Integer> bts=new BTS_Array<Integer>(200);
		for(int i:a) {
			bts.insertRecursive(i,0);
		}
//		int expected=0;
			
		assertEquals(null, bts.tree.get(4));
	}
	@Test
	void testBTS_add2() {
		int[] a= {20,10,6};
		BTS_Array<Integer> bts=new BTS_Array<Integer>(200);
		for(int i:a) {
			bts.insertRecursive(i,0);
		}
		int expected=20;
			
		assertEquals(expected, bts.tree.get(0));
	}

}
