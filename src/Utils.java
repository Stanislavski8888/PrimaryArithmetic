import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Utils {
    public static char MULTIPLY = 0x00D7;
    public static char DIVISION = 0x00F7;
    public static char PLUS = 0x002B;
    public static char MINUS = 0x002D;

    public static char LEFT_BRACKET = 0x0028;
    public static char RIGHT_BRACKET = 0x0029;

    /**
     * 最大题目数量
     */
    public static final int MAX_COUNT = 50;

    /**
     * MAX以内的加减法
     */
    public static final int MAX = 1000;

    public static void main(String[] args) {
        costTime(System.currentTimeMillis() - 360100l);
    }

    public static void error(CharSequence sb) {
        System.out.println("  Error!");
        System.out.print(sb.toString());
    }

    public static int getInt(int max) {
        int a = 0;
        while (a == 0) {
            a = (int) (Math.random() * max);
        }
        return a;
    }

    public static int getIntIncludeZero(int max) {
        return (int) (Math.random() * max);
    }


    /**
     * 计算输入结果
     *
     * @param scanner
     * @param result
     * @param arithmetic
     */
    public static void calculate(Scanner scanner, int result, CharSequence arithmetic) {
        int res;
//        System.out.println("scanner.hasNext = " + scanner.hasNext());
        while (scanner.hasNextLine()) {
            if (scanner.hasNextInt()) {
                res = scanner.nextInt();
                if (res != result) {
                    Utils.error(arithmetic);
                    continue;
                } else {
                    break;
                }
            } else {
                Utils.error(arithmetic);
                scanner.next();
                continue;
            }
        }
    }

    public static void costTime(long start) {
        long end = System.currentTimeMillis();
        long time = end - start;
        long hour = TimeUnit.MILLISECONDS.toHours(time);
        long minute = TimeUnit.MILLISECONDS.toMinutes(time);
        long second = TimeUnit.MILLISECONDS.toSeconds(time);
        System.out.println(time);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(TimeUnit.HOURS.name());


        /*long end = System.currentTimeMillis();
        SimpleDateFormat formater = new SimpleDateFormat("HH小时MM分ss秒");
        try {
            System.out.println(formater.format((end - start) - TimeZone.getDefault().getRawOffset()));
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
