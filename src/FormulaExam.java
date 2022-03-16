import java.util.Scanner;

/**
 * 加减竖式
 */
public class FormulaExam {
//    private static final int DEFAULT_MAX = 100;

    private static final String ADDITION = "-a";
    private static final String SUBTRACTION = "-s";

    // 0: +, 1: -
    private static final int TYPE_ADDITION = 0;
    private static final int TYPE_SUBTRACTION = 1;

    public static void main(String[] args) {
        formula();
    }

    private static void formula() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.MAX_COUNT; i++) {
            StringBuilder sb = new StringBuilder();
            int type = (int) (Math.random() * 2);
            sb.append("\n");
            int a = Utils.getInt(Utils.MAX);
            int b = Utils.getInt(a);

            sb.append(String.format("% 7d%n", a));
            if (type == TYPE_ADDITION) {
                sb.append(String.format(" %c% 5d%n", Utils.PLUS, b));
            } else if (type == TYPE_SUBTRACTION) {
                sb.append(String.format(" %c% 5d%n", Utils.MINUS, b));
            }
            sb.append("--------\n");

            int result = type == TYPE_ADDITION ? a + b : a - b;
            calPlace(sb, result, 7);
            System.out.print(sb.toString());
            Utils.calculate(scanner, result, sb);
        }
    }

    /**
     * 给得数前面加空格
     * @param sb
     * @param result
     * @param total
     */
    private static void calPlace(StringBuilder sb, int result, int total) {
        int place = 0;
        do {
            place++;
            result /= 10;
        } while (result > 0);

        for (int i = total - place; i > 0; i--) {
            sb.append(' ');
        }
    }
}
