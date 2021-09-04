package practice;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description:
 */
public class Visitor {

    private String name;
    private int age;

    public void buy(){

        if(age >= 18){
            System.out.println(name + "的年龄是" + age + ",门票价格: 20元");
        }else {
            System.out.println(name + "的年龄是" + age + ",门票免费");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Visitor visitor = new Visitor();
        while (true){
            System.out.print("请输入姓名： ");
            String name = scanner.next();

            if("n".equals(name)) break;
            visitor.name = name;
            System.out.print("请输入年龄: ");
            visitor.age = scanner.nextInt();
            visitor.buy();
        }
        System.out.println("程序退出");

    }

}
