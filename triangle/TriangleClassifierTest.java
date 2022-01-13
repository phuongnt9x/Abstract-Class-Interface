package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleClassifierTest {

	@Test
    void testGetTypeTriangle1() {
        int edgeA = 2;
        int edgeB = 2;
        int edgeC = 2;

        String expected = "tam giac deu";
        String actual = TriangleClassifier.getTypeTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected,actual);
    }

    @Test
    void testGetTypeTriangle2() {
        int edgeA = 2;
        int edgeB = 2;
        int edgeC = 3;

        String expected = "tam giac can";
        String actual = TriangleClassifier.getTypeTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected,actual);
    }

    @Test
    void testGetTypeTriangle3() {
        int edgeA = 3;
        int edgeB = 4;
        int edgeC = 5;
        String expected = "tam giac thuong";
        String actual = TriangleClassifier.getTypeTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected,actual);
    }

    @Test
    void testGetTypeTriangle4() {
        int edgeA = 8;
        int edgeB = 2;
        int edgeC = 3;
        String expected = "khong phai tam giac";
        String actual = TriangleClassifier.getTypeTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected,actual);
    }

    @Test
    void testGetTypeTriangle5() {
        int edgeA = -1;
        int edgeB = 2;
        int edgeC = 1;
        String expected = "khong phai tam giac";
        String actual = TriangleClassifier.getTypeTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected,actual);
    }

    @Test
    void testGetTypeTriangle6() {
        int edgeA = 0;
        int edgeB = 1;
        int edgeC = 1;
        String expected = "khong phai tam giac";
        String actual = TriangleClassifier.getTypeTriangle(edgeA,edgeB,edgeC);
        assertEquals(expected,actual);
    }

}
