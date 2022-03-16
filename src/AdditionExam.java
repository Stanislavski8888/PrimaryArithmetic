import java.util.Scanner;

/**
 * 加法
 */
public class AdditionExam {

    public static void main(String[] args) {
        addition();
    }

    static void addition() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Utils.MAX_COUNT; i++) {
            StringBuilder sb = new StringBuilder();
            int a = Utils.getInt(Utils.MAX);
            int b = Utils.getInt(Utils.MAX - a + 1);

            sb.append(String.format("%d %c %d = ", a, Utils.PLUS, b));
            sb = new StringBuilder(String.format("%13s", sb.toString()));
            System.out.print(sb.toString());
            int result = a + b;
            Utils.calculate(scanner, result, sb);
        }
    }
}
