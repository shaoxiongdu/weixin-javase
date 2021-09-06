package question1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月03日 | 14:21
 * @description: 接收从键盘输入的字符串格式的年龄，分数和入学时间，转换为整数、浮点数、日期类型，并在控制台输出。
 */
public class TestMain {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入年龄: ");
        String age = scanner.next();

        System.out.println("请输入分数: ");
        String score = scanner.next();

        System.out.println("请输入入学时间(格式：yyyy-MM-dd): ");
        String date = scanner.next();

        //转整数
        System.out.println("年龄" + Integer.parseInt(age));

        //转小数
        System.out.println("分数" + Double.parseDouble(score));

        //转日期类型
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("入学日期:" + simpleDateFormat.parse(date));



    }

}
