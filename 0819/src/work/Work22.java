package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description:
 */
public class Work22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            int count = 0;

            System.out.println("请输入第" + (i+1) + "个人所购买的三件商品的价格: ");

            for (int j = 0; j < 3; j++) {
                System.out.print("请输入第" + (j+1) + "件商品价格: ");
                double price = scanner.nextDouble();
                if(price < 300){
                    continue;
                }
                count++;

            }
            System.out.println("第" + (i+1) + "个人共有"+count+"件商品享受8折优惠 ");

        }

    }

}
