import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description:
 *
 *  3.题目：输入某年某月某日，判断这一天是这一年的第几天？
 *  分析：以3月5日为例，先把前两个月的加起来，然后再加上5天即本年第几天，
 *  特殊情况，闰年且输入月份大于3需考虑多加一天。可定义数组存储1-12月各月天数。
 *
 */
public class Question3 {

    public static void main(String[] args) {

        //月份天数
        int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份: ");
        int year = scanner.nextInt();

        System.out.print("请输入月份: ");
        int month = scanner.nextInt();

        System.out.print("请输入日: ");
        int day = scanner.nextInt();

        //总和
        int daySum = 0;

        //累加月份
        for (int i = 0; i < month; i++) {

            day += days[i];

        }

        //累加日
        daySum += day;

        //闰年多加一天
        if(isLeapYear(year)){
            daySum++;
        }

        System.out.println("第" + daySum + "天");

    }

    /**
     * 判断是否是闰年
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ;
    }

}
