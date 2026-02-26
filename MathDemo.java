public class MathDemo {

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int sum(int[] args) {
        int s = 0;
        for (int i = 0; i < args.length; i++) {
            s = s + args[i];
        }
        return s;
    }
}