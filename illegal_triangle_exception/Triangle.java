package illegal_triangle_exception;

import java.util.Scanner;

import NumberFormatException.CalculationExample;

public class Triangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
   		System.out.println("Hãy nhập cạnh A: ");
  		 int a = scanner.nextInt();
   		System.out.println("Hãy nhập cạnh B: ");
   		int b = scanner.nextInt();
   		System.out.println("Hãy nhập cạnh C: ");
 		 int c = scanner.nextInt();
 		try {
            if (a + b <= c || b + c <= a || a + c <= b || a < 0 || b < 0 || c < 0) {
                throw new IllegalTriangleException("Not a triangle");
            } else {
                System.out.println("Cạnh A="+ a);
                System.out.println("Cạnh B="+ b);
                System.out.println("Cạnh C="+ c);
            }

        } catch (IllegalTriangleException e) {
            System.out.println(e.getString());
        }

	}

}
