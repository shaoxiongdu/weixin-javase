package cn.shaoxiongdu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description:
 */
public class Application {

    public void run() {

        int userTotal = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入用户的个数: ");

        userTotal = scanner.nextInt();

        User [] users = new User[userTotal];

        for (int i = 0; i < userTotal; i++) {
            users[i] = new User();

            System.out.print("请输入第" + ( i + 1) + "个用户的姓名: ");

            String name = scanner.next();

            users[i].setName(name);

            System.out.print("请输入第" + ( i + 1) + "个用户的年龄: ");

            Integer age = scanner.nextInt();
            users[i].setAge(age);

        }

        Arrays.sort(users);

        System.out.println("\n按照年龄排序:");

        for (int i = 0; i < users.length; i++) {

            System.out.println("序号: " + (i + 1) + "\t" + users[i]);

        }

    }



}
