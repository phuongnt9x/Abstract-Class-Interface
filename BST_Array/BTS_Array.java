package BST_Array;

import java.util.ArrayList;
import java.util.List;

public class BTS_Array<T extends Comparable<T>> {
	ArrayList<T> tree;
	public BTS_Array(int size) {
		System.out.println(size);
		tree = new ArrayList<T>(size);
		while(size>0) {
			tree.add(null);
			size--;
		}
		System.out.println(tree.size());
	}

	public void insert(T data) {
		int i = 0;
		while (i < tree.size() && tree.get(i) != null) {
			if (data.compareTo(tree.get(i)) < 0) {
				i = left(i);
			} else
				i = right(i);
		}
		tree.add(i, data);
	}

	/**
	 * 
	 * @param data
	 * @param index
	 * @return
	 */
	public int insertRecursive(T data, int index) {

		if (tree.get(index) == null) {
			tree.set(index, data);
			return index;
		} else {
			if (data.compareTo(tree.get(index)) < 0) {
				index = left(index);
			} else
				index = right(index);

		}
		return insertRecursive(data, index);
	}

	public int find(T d) {
		int i = 0;
		boolean found = false;
		while (i < tree.size() && tree.get(i)!=null) {
			if (d.compareTo(tree.get(i)) < 0)
				i = left(i);
			else if (d.compareTo(tree.get(i)) > 0)
				i = right(i);
			else {
				found = true;
				break;
			}
		}
		if (found)
			return i;
		else
			return -1;
	}

	public void delNoChild(int child_index) {
		tree.remove(child_index);
	}

	public void delNoLeftChild(int child_index, int left, int right) {
		tree.set(child_index, tree.get(right));
		int right_temp = right(right);
		int left_temp = left(right);
		while (right_temp < tree.size() && left_temp < tree.size()) {
			tree.set(left, tree.get(left_temp));
			left = left_temp;
			tree.set(right, tree.get(right_temp));
			right = right_temp;
			right_temp =right(right);
			left_temp = left(left);
		}
		// sau khi xoa
		tree.remove(left);
		tree.remove(right);

	}

	public void delete(T data) {
		int findToDel = find(data);
		if (findToDel == -1) {
			System.out.printf("\nNot found\n");
			return;
		} else {
			int childIndex = findToDel;
			int leftChild =left(childIndex);
			int rightChild = right(childIndex);
			System.out.printf("\nDeleting " + tree.get(childIndex)+ "\n");
			if ((rightChild > tree.size() || leftChild > tree.size())
					|| (tree.get(leftChild)== null && tree.get(rightChild) == null)) {
				delNoChild(childIndex);
			} else if ((tree.get(rightChild) != null && tree.get(leftChild) == null)) {
				delNoLeftChild(childIndex, leftChild, rightChild);
			} else {
				int leftChildRight =right(leftChild);
				if (tree.get(leftChildRight)== null) {
					tree.set(childIndex,tree.get(leftChild));
					tree.remove(leftChild);
				} else {
					while (tree.get(leftChildRight)!= null) {
						leftChildRight =right(leftChildRight);
					}
					leftChildRight = (leftChildRight - 2) / 2;
					tree.set(childIndex, tree.get(leftChildRight));
					tree.remove(leftChildRight);
				}
			}
		}
	}

	public void traverse(int i,List<T> list) {
		if (i < tree.size() && tree.get(i) != null) {
			traverse(left(i),list);
			list.add(tree.get(i));
			System.out.print(tree.get(i) + " ");
			traverse(right(i),list);
		}
	}

	/**
	 * Return the index of left children
	 * 
	 * @param i
	 * @return
	 */
	public static int left(int i) {
		return (2 * i) + 1;
	}

	public static int right(int i) {
		return (2 * i) + 2;
	}
}