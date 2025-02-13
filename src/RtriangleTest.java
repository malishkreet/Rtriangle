import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RtriangleTest {
    @Test
    public void test() {
        Rtriangle rtriangle = RtriangleProvider.getRtriangle();

        int x1 = rtriangle.getApexX1();
        int y1 = rtriangle.getApexY1();
        int x2 = rtriangle.getApexX2();
        int y2 = rtriangle.getApexY2();
        int x3 = rtriangle.getApexX3();
        int y3 = rtriangle.getApexY3();

        int a2 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        int b2 = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
        int c2 = (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1);

        boolean isRightTriangle = (a2 + b2 == c2) || (b2 + c2 == a2) || (c2 + a2 == b2);

        assertTrue(isRightTriangle, "Треугольник не является прямоугольным!");
    }
}
