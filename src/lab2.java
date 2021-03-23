public class lab2 {
    public static float error_rate (float x, float a) {
        return Math.abs(x-a)/x;
    }

    public static float s(float x) {
        float s = 1, a = x;
        int n = 1;
        while (s + a != s) {
            s = s + a;
            n = n + 1;
            a = a * x / n;
        }
        return s;
    }

    public static void main (String[] args) {
        System.out.println("x - (алгоритм) - (встроенная) - относительная погрешность\n");
        float x = -25;
        String s;
        for (int i = 1; i < 14; i++) {
            if (x <= 25) {
                if ((x == 1) | (x == -5)) {
                    s = x + " - " + s(x) + " - " + (float) Math.exp(x) +
                            " - " + error_rate(s(x), (float) Math.exp(x));
                    System.out.println(s);
                    x = x + 4;

                } else if ((x == -1) | (x == 0)) {
                    s = x + " - " + s(x) + " - " + (float) Math.exp(x) +
                            " - " + error_rate(s(x), (float) Math.exp(x));
                    System.out.println(s);
                    x = x + 1;

                } else {
                    s = x + " - " + s(x) + " - " + (float) Math.exp(x) +
                            " - " + error_rate(s(x), (float) Math.exp(x));
                    System.out.println(s);
                    x = x + 5;
                }
            }
        }
    }
}
