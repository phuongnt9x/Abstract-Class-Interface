package triangle;

public class TriangleClassifier {
	public static String getTypeTriangle(int edgeA,int edgeB, int edgeC) {
		if (edgeA > 0 && edgeB > 0 && edgeC > 0) {
            if (edgeA==edgeB && edgeB==edgeC) {
                return "tam giac deu";
            } else if (edgeA==edgeB || edgeA==edgeC || edgeB==edgeC) {
                return "tam giac can";
            } else if (edgeA+edgeB < edgeC || edgeA+edgeB < edgeB || edgeC+edgeB < edgeA) {
                return "khong phai tam giac";
            }
            return "tam giac thuong";
        } else {
            return "khong phai tam giac";
        }
	}

}
