import java.util.Scanner;

/**
 * 减法
 */
public class SubtractionExam {
//    private static final int MAX = 1000;


    public static void main(String[] args) {
        subtraction();
    }

    static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.MAX_COUNT; i++) {
            int a = Utils.getInt(Utils.MAX);
            int b = Utils.getInt(a);

            StringBuilder sb = new StringBuilder(String.format("%13s", String.format("%d %c %d = ", a, Utils.MINUS, b)));
            System.out.print(sb.toString());
            int result = a - b;
            Utils.calculate(scanner, result, sb);
        }
    }
}
