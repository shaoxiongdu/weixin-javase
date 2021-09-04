package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/16
 * @description:
 */
public class Work2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {

            int number = 0,score = 0;
            String birthday = null;
            System.out.print("请输入第"+i+"个会员的会员号: ");
            number = scanner.nextInt();
            if(number < 0 || number > 9999){
                System.out.println("录入失败!");
                break;
            }
            System.out.print("请输入第"+i+"个会员的生日: ");
            birthday = scanner.next();
            System.out.print("请输入第"+i+"个会员的会员积分: ");
            score = scanner.nextInt();
            System.out.println("您录入的信息是: " + number + "\t" + birthday + "\t" + score);
        }
        System.out.println("程序结束!");


    }

}
