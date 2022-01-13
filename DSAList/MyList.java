package DSAList;

import java.util.Arrays;

public class MyList<E> {
	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object elements[];
	public MyList(int capacity) {
		elements = new Object[capacity];
	}

	public MyList() {
		elements = new Object[DEFAULT_CAPACITY];
	}

	private void ensureCapa() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	public void add(E e) {
		if (size == elements.length) {
			ensureCapa();
		}
		elements[size++] = e;
	}
	private void ensureCapacity(int minCapacity) {
		int newSize = elements.length +1;
		elements = Arrays.copyOf(elements, newSize);
	}
	public void add(int index,E e) {
		if(index<0 || index> size) {
			throw new IndexOutOfBoundsException();
		}
		else {
			for(int i=size;i>=index;i++) {
				elements[i]=elements[i-1];
			}
			elements[index]=e;
			size++;
		}
	}

	public E get(int i) {
		if (i >= size || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		return (E) elements[i];
	}
    public Object remove(int index) {
    	 if (index < 0 || index >= size) {
             throw new IndexOutOfBoundsException("index: " + index);
         }
    	 Object tempElement=elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return tempElement;
    }
    public Object clone() {
        try {
            MyList<?> v = (MyList<?>) super.clone();
            v.elements = Arrays.copyOf(elements, size);
           
            return v;
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            throw new InternalError(e);
        }
    }
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i]==null)
                    return i;
        } else {
            for (int i = 0; i < size; i++)
                if (o.equals(elements[i]))
                    return i;
        }
        return -1;
    }
    public int size() {
        return size;
    }
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }
    public void clear() {
        for (int i = 0; i < size; i++)
            elements[i] = null;

        size = 0;
    }

}
