package practice;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/16
 * @description:
 */
public class AgeAvg {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入顾客总人数: ");

        int totalPeople = scanner.nextInt();
        Thread.sleep(1000000);
        int lt30 = 0;
        for (int i = 0; i < totalPeople; i++) {

            System.out.print("请输入第" + (i+1) + "位顾客的年龄: ");
            int age = scanner.nextInt();
            if(age < 30){
                lt30++;
            }

        }
        System.out.printf("30岁以下的比例是: %.2f%%\n",(lt30 / (double)totalPeople) * 100);
        System.out.printf("30岁以上的比例是: %.2f%%\n",((totalPeople - lt30) / (double)totalPeople) * 100);


    }

}
