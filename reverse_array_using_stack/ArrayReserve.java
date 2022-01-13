package reverse_array_using_stack;

import java.util.Stack;

public class ArrayReserve {

	public static void main(String[] args) {
		reserveInteger();
		System.out.println();
		reserveString();

	}

	public static void reserveString() {
		String s="The List interface provides a way to store the ordered collection. It is a child interface of Collection";
		String mWord[]=s.split(" ");
		String outp="";
		Stack<String> stackString = new Stack<String>();
		for(int i=0;i<mWord.length;i++) {
			stackString.push(mWord[i]);
		}
		for(int i=0;i<mWord.length;i++) {
			outp+=stackString.pop()+" ";
		}
		System.out.println(outp);
	}

	public static void reserveInteger() {
		int a[]= {2,6,8,2,84,1,5,7};
		Stack<Integer> stackInteger = new Stack<Integer>();
		for(int i=0;i<a.length;i++) {
			stackInteger.push(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			a[i]=stackInteger.pop();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
