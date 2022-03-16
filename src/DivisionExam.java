import java.util.Scanner;

/**
 * 除法
 */
public class DivisionExam {
    private static final int MAX = 20;
    private static final int MIN = 10;

    public static void main(String[] args) {
        division();
    }

    static void division() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.MAX_COUNT; i++) {
            int a = Utils.getInt(MAX);
            int b = Utils.getInt(MAX);
            StringBuilder sb = new StringBuilder();

            sb.append(String.format("%d %c %d = ", a * b, Utils.DIVISION, b));
            sb = new StringBuilder(String.format("%13s", sb.toString()));
            System.out.print(sb.toString());

            int result = a * b / b;
            Utils.calculate(scanner, result, sb);

        }

    }
}
