import java.util.Scanner;

/**
 * 加减混合
 */
public class AddAndSubExam {
    static final int MAX = Utils.MAX;

    public static void main(String[] args) {
        additionAndSubtraction();
    }

    static void additionAndSubtraction() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.MAX_COUNT; i++) {
            StringBuilder sb = new StringBuilder();
            int a, b, c, result = 0;
            int addOrSub = (int) (Math.random() * 6);
            switch (addOrSub) {
                case 0: // a + b + c
                    a = Utils.getIntIncludeZero(MAX);
                    b = Utils.getIntIncludeZero(MAX - a);
                    c = Utils.getIntIncludeZero(MAX - a - b);
                    sb.append(String.format(" %d %c %d %c %d = ", a, Utils.PLUS, b, Utils.PLUS, c));
                    result = a + b + c;
                    break;
                case 1: // a - b - c
                    a = Utils.getIntIncludeZero(MAX);
                    b = Utils.getIntIncludeZero(a);
                    c = Utils.getIntIncludeZero(a - b);
                    sb.append(String.format(" %d %c %d %c %d = ", a, Utils.MINUS, b, Utils.MINUS, c));
                    result = a - b - c;
                    break;
                case 2: // a + b - c
                    a = Utils.getIntIncludeZero(MAX);
                    b = Utils.getIntIncludeZero(MAX - a);
                    c = Utils.getIntIncludeZero(a + b);
                    sb.append(String.format(" %d %c %d %c %d = ", a, Utils.PLUS, b, Utils.MINUS, c));
                    result = a + b - c;
                    break;
                case 3: // a - b + c
                    a = Utils.getIntIncludeZero(MAX);
                    b = Utils.getIntIncludeZero(a);
                    c = Utils.getIntIncludeZero(MAX - a + b);
                    sb.append(String.format(" %d %c %d %c %d = ", a, Utils.MINUS, b, Utils.PLUS, c));
                    result = a - b + c;
                    break;
                case 4: // a + b
                    a = Utils.getInt(Utils.MAX);
                    b = Utils.getInt(Utils.MAX - a + 1);

                    sb.append(String.format("%d %c %d = ", a, Utils.PLUS, b));
                    result = a + b;
                    break;
                case 5: // a - b
                    a = Utils.getInt(Utils.MAX);
                    b = Utils.getInt(a);

                    sb.append(String.format("%d %c %d = ", a, Utils.MINUS, b));
                    result = a - b;
                    break;
                default:

            }

            sb = new StringBuilder(String.format("%20s", sb.toString()));
            System.out.print(sb.toString());

            Utils.calculate(scanner, result, sb);
        }
    }
}
