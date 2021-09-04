package work.work1;

import java.util.Scanner;

/**
 * @作者: 杜少雄 <github.com/shaoxiongdu>
 * @时间: 2021年08月24日 | 16:45
 * @描述:
 */
public class TestMain {

    public static void main(String[] args) {

        System.out.println("欢迎来到宠物店!");
        Dog dog = new Dog();

        Scanner scanner = new Scanner(System.in);


        System.out.print("请输入宠物的名字:");
        dog.setName(scanner.next());

        System.out.print("请输入宠物类型(1.狗狗 2.企鹅):");
        dog.setType(scanner.nextInt());

        System.out.print("请输入宠物的品种(1.拉布拉多 2。雪纳瑞):");
        dog.setVariety(scanner.nextInt());

        System.out.print("请输入宠物健康值:");
        dog.setHealth(scanner.nextInt());

        System.out.print("请输入亲密度:");
        dog.setIntimacy(scanner.nextInt());

        System.out.println(dog);

    }

}
