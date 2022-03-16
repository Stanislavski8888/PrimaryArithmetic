import java.util.Scanner;

/**
 * 乘法
 */
public class MultiplicationExam {

    private static final int MAX = 20;

    public static void main(String[] args) {
        MultiplicationExam.multiply();
    }

    static void multiply() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.MAX_COUNT; i++) {
            int a = Utils.getInt(MAX);
            int b = Utils.getInt(MAX);

            StringBuilder sb = new StringBuilder(String.format("%11s", String.format("%d %c %d = ", a, Utils.MULTIPLY, b)));
            System.out.print(sb.toString());
            int result = a * b;
            Utils.calculate(scanner, result, sb);
        }
    }

}
