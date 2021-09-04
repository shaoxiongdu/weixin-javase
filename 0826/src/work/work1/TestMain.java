package work.work1;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 17:13
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        System.out.println("欢迎来到宠物领养店!");
        System.out.print("请输入领养的宠物 (1.狗狗 2.企鹅): ");
        int type = new Scanner(System.in).nextInt();

        Owner owner = new Owner("张三");

        //根据编号领养宠物
        Pet pet = owner.getPet(type);

        //玩耍
        owner.play(pet);



    }

}
