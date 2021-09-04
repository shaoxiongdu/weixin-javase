package work.work1;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 15:50
 * @description:
 * 2.编写面包类，包含三个方法
 * 	prepare()准备
 * 	bake()烘烤
 * 	box打包
 * 三个子产品：鸡蛋面包，奶油面包，鸡腿面包
 * 面包工厂类：负责生产各种面包
 * 使用简单工厂实现
 */
public class TestMain {


    public static void main(String [] args){

        System.out.println("欢迎来到面包店!");

        BreadEnum[] values = BreadEnum.values();

        //循环面包枚举
        for (int i = 0; i < values.length; i++) {
            System.out.println( i +". " + values[i]);
        }

        System.out.print("请输入您的选择: ");

        int breadInput = new Scanner(System.in).nextInt();

        //调用面包工厂方法 传入指定枚举值
        BreadFactory.makeBread(values[breadInput]);

    }

}
