//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rtriangle rtriangle = RtriangleProvider.getRtriangle();
        System.out.println("Треугольник с вершинами: ");
        System.out.println("(" + rtriangle.getApexX1() + ", " + rtriangle.getApexY1() + ")");
        System.out.println("(" + rtriangle.getApexX2() + ", " + rtriangle.getApexY2() + ")");
        System.out.println("(" + rtriangle.getApexX3() + ", " + rtriangle.getApexY3() + ")");

    }
}