public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean isPositive = (a > 0) && (b > 0) && (c > 0);
        long aSquared = (long) a * a;
        long bSquared = (long) b * b;
        long cSquared = (long) c * c;

        boolean isRightTriangle = isPositive && (
            (aSquared + bSquared == cSquared) ||
            (aSquared + cSquared == bSquared) ||
            (bSquared + cSquared == aSquared)
        );

        System.out.println(isRightTriangle);
    }
}