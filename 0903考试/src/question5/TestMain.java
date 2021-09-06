package question5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestMain{

    public static void main(String[] args) {
        // 从控制台输入
        Scanner scanner = new Scanner(System.in);
        // 提示用户
        System.out.println("请输入日期(如：2008-09-20)：");
        // 获取输入的日期
        String date = scanner.nextLine();
        try {
            // 日期格式化类
            DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
            // 把字符串类型的日期转换为date类型的
            Date parse = dFormat.parse(date);
            // 创建一个公历类的实例
            Calendar calendar = new GregorianCalendar();
            // 把格式化好的日期对象放进Calendar
            calendar.setTime(parse);
            // 获取今天是几号
            int day = calendar.get(Calendar.DATE);
            // DATE设置成这个月的一号
            calendar.set(Calendar.DATE, 1);
            // 获取这个月的第一天是周几
            int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
            // 获取每个月最大的天数
            int maxDay = calendar.getActualMaximum(Calendar.DATE);

            System.out.println("日\t一\t二\t三\t四\t五\t六");

            // 循环打印 空格
            for (int i = 1; i < weekDay; i++) {
                System.out.print("\t");
            }
            // 循环打印天数
            for (int i = 1; i <= maxDay; i++) {

                // 打印 天数
                System.out.print(i + "\t");
                // 获取今天是周几
                int w = calendar.get(Calendar.DAY_OF_WEEK);
                // 如果今天是周六就让其换行
                if (w == Calendar.SATURDAY) {
                    System.out.println();
                }
                // 天数自增
                calendar.add(Calendar.DATE, 1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}

