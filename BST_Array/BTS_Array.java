package BST_Array;

import java.util.List;

public class BTS_Array<T extends Comparable<T>> {
	T[] tree;
	static int size=0;

	public BTS_Array(int size) {
		tree =(T[]) new Comparable[size];
	}

	public void insert(T data) {
		int i = 0;
		while (i < tree.length && tree[i] != null) {
			if (data.compareTo(tree[i]) < 0) {
				i = left(i);
			} else
				i = right(i);
		}
		tree[i]=data;
		size++;
	}

	/**
	 * 
	 * @param data
	 * @param index
	 * @return
	 */
	public int insertRecursive(T data, int index) {
		if (tree[index] == null) {
			tree[index]=data;
			return index;
		} else {
			if (data.compareTo(tree[index]) < 0) {
				index = left(index);
			} else
				index = right(index);

		}
		return insertRecursive(data, index);
	}

	public int find(T d) {
		int i = 0;
		boolean found = false;
		while (i < tree.length && tree[i]!=null) {
			if (d.compareTo(tree[i]) < 0)
				i = left(i);
			else if (d.compareTo(tree[i]) > 0)
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
		tree[child_index] = null;
	}

	public void delNoLeftChild(int child_index, int left, int right) {
		tree[child_index] = tree[right];
		int right_temp = right(right);
		int left_temp = left(right);
		while (right_temp < tree.length && left_temp < tree.length) {
			tree[left] = tree[left_temp];
			left = left_temp;
			tree[right] = tree[right_temp];
			right = right_temp;
			right_temp =right(right);
			left_temp = left(left);
		}
		// sau khi xoa
		tree[left] = null;
		tree[right] = null;

	}

	public void delete(T data) {
		int findToDel = find(data);
		if (findToDel == -1) {
			System.out.printf("\nKey not found, can't delete.\nThe list remains unchanged\n");
			return;
		} else {
			int childIndex = findToDel;
			int leftChild =left(childIndex);
			int rightChild = right(childIndex);
			System.out.printf("\nDeleting " + tree[childIndex] + "\n");
			if ((rightChild > tree.length || leftChild > tree.length)
					|| (tree[leftChild] == null && tree[rightChild] == null)) {
				delNoChild(childIndex);
			} else if ((tree[rightChild] != null && tree[leftChild] == null)) {
				delNoLeftChild(childIndex, leftChild, rightChild);
			} else {
				int leftChildRight =right(leftChild);
				if (tree[leftChildRight] == null) {
					tree[childIndex] = tree[leftChild];
					tree[leftChild] = null;
				} else {
					while (tree[leftChildRight] != null) {
						leftChildRight =right(leftChildRight);
					}
					leftChildRight = (leftChildRight - 2) / 2;
					tree[childIndex] = tree[leftChildRight];
					tree[leftChildRight] = null;
				}
			}
		}
	}

	public void traverse(int i,List<T> list) {
		if (i < tree.length && tree[i] != null) {
			traverse(left(i),list);
			list.add(tree[i]);
			System.out.print(tree[i] + " ");
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