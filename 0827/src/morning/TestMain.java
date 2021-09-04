package morning;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 9:18
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请选择饮料（1、咖啡 2、矿泉水 3、可乐）");
        int type = scanner.nextInt();

        System.out.println("请输入购买容量: ");
        int capacity = scanner.nextInt();

        //父类引用
        Beverage beverage = null;

        switch (type){
            case 1 :
                //造 咖啡
                beverage = new Coffee("咖啡",capacity);
                break;
            case 2 :
                //造 矿泉水
                beverage = new MineralWater("矿泉水",capacity);
                break;
            case 3 :
                //造可乐
                beverage = new Cola("可乐",capacity);
                break;
        }

        //添加配料
        beverage.addIngredients();

        //打印订单
        beverage.printOrder();

    }

}
