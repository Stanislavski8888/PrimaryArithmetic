import java.util.Scanner;

public class MultiplicationAndDivision {
    private static final int MAX = 20;
    private static final int MIN = 10;

    public static void main(String[] args) {
        mix();
    }

    static void mix() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.MAX_COUNT; i++) {
            int a, b, c, result = 0;

            int mulOrDiv = (int) (Math.random() * 4);
            StringBuilder sb = new StringBuilder();

            switch (mulOrDiv) {
                case 0: // multiply
                    a = Utils.getInt(MAX);
                    b = Utils.getInt(a > MIN ? MIN : MAX);

                    sb.append(String.format("%d %c %d = ",a, Utils.MULTIPLY, b));
                    result = a * b;
                    break;
                case 1: // division
                    a = Utils.getInt(MAX);
                    b = Utils.getInt(a > MIN ? MIN : MAX);
                    sb.append(String.format("%d %c %d = ",a * b, Utils.DIVISION, b));

                    result = a * b / b;
                    break;
                case 2: // a * b / c
                    a = Utils.getInt(MAX);
                    b = Utils.getInt(a > MIN ? MIN : MAX);
                    c = Utils.getInt(MAX);
                    while (a * b % c != 0) {
                        c = Utils.getInt(MAX);
                    }
                    sb.append(String.format("%d %c %d %c %d = ", a, Utils.MULTIPLY, b, Utils.DIVISION, c));

                    result = a * b / c;
                    break;
                case 3: // a / b * c
                    a = Utils.getInt(MAX);
                    b = Utils.getInt(a > MIN ? MIN : MAX);
                    a = a * b;
                    c = Utils.getInt(MAX);
                    sb.append(String.format("%d %c %d %c %d = ", a, Utils.DIVISION, b, Utils.MULTIPLY, c));

                    result = a / b * c;
                    break;
                default:
            }
            sb = new StringBuilder(String.format("%16s", sb.toString()));
            System.out.print(sb.toString());

            Utils.calculate(scanner, result, sb);

        }
    }
}
