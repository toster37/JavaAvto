public class Triangle {
    public static Double areaOfTriangle(int a, int b, int c) {
        double pp = (a + b + c)/2.0;
        Double s = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        return s;
    }
    public static boolean isTriangle(int a, int b, int c) {
        return ((a + b > c) && (b + c > a) && (c + a > b));
    }

}
