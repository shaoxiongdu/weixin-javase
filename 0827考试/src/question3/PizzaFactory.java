package question3;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:20
 * @description:
 */
public class PizzaFactory {

    /**
     * 创建指定的披萨
     * @param type 1创建培根披萨  2创建海鲜披萨
     * @return 返回创建好的披萨
     */
    public Pizza getPizza(int type){

        Scanner scanner = new Scanner(System.in);

        Pizza pizza = null;

        //公用信息
        System.out.print("请输入披萨大小:");
        int size = scanner.nextInt();
        System.out.print("请输入披萨价格:");
        double price = scanner.nextDouble();
        switch (type){
                //培根
            case 1:
                System.out.print("请输入培根克数: ");
                int n = scanner.nextInt();
                pizza = new BaconPizza(price,size,n);
                break;
                //海鲜
            case 2:
                System.out.print("请输入配料信息: ");
                String burden = scanner.next();
                pizza = new SeafoodPizza(price,size,burden);
                break;

        }
        return pizza;

    }

}
