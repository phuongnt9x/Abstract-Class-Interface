package DSAList;

public class MyLinkedList {
	private  Node head;
    private  int numNodes=0;
    public MyLinkedList() {
    }
    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
       holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public void addLast(Object data) {
    	Node temp = head;
        while(temp.next!=null) {
        	temp=temp.next;
        }
        temp.next = new Node(data);
        temp.next.next = null;
        numNodes++;
    }
    public void remove(int index) {
        Node temp = head;
        Node holder;

        for(int i=0; i < index-2 && temp.next != null; i++) {
            temp = temp.next;
        }
       holder = temp.next.next;
        temp.next = holder;
        numNodes--;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    } 
    public int size() {
    	return numNodes;
    }
    public void clear() {
        for (Node x = head; x != null; ) {
            Node next = x.next;
            x.data = null;
            x.next = null;
            x = next;
        }
        head = null;
        numNodes = 0;
    }
    public Node getFirst(){
        return head;
    }
    public Node getLast(){
        Node temp=head;
        while(temp.next!=null) {
        	temp=temp.next;
        }
        return temp;
    }
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (o.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
    }
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

}
