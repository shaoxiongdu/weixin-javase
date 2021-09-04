package work.work2;

import work.work1.Dog;

import java.util.Scanner;

/**
 * @作者: 杜少雄 <github.com/shaoxiongdu>
 * @时间: 2021年08月24日 | 16:56
 * @描述:
 */
public class TestMain {

    public static void main(String[] args) {

        System.out.println("欢迎来到宠物店!");
        Penguin penguin = new Penguin();

        Scanner scanner = new Scanner(System.in);


        System.out.print("请输入宠物的名字:");
        penguin.setName(scanner.next());

        System.out.print("请输入宠物类型(1.狗狗 2.企鹅):");
        penguin.setType(scanner.nextInt());

        System.out.print("请输入宠物的性别(1.Q仔 2。Q妹):");
        penguin.setSex(scanner.nextInt());

        System.out.print("请输入宠物健康值:");
        penguin.setHealth(scanner.nextInt());

        System.out.print("请输入亲密度:");
        penguin.setIntimacy(scanner.nextInt());

        System.out.println(penguin);

    }

}
