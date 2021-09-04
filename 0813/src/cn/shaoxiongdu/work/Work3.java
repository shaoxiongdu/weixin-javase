package cn.shaoxiongdu.work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/13
 * @description:
 */
public class Work3 {

    public static void main(String[] args) {

        System.out.println("******************************************************");
        System.out.println("1.T 恤 ￥245.0\t\t2.网球鞋 ￥129.0\t\t3.网球拍 ￥29.0");
        System.out.println("******************************************************");

        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0.0;
        String input = null;

        do{
            System.out.print("输入商品编号: ");
            int productId = scanner.nextInt();
            System.out.print("输入购买数量: ");
            int productCount = scanner.nextInt();

            switch (productId){
                case 1 :
                    totalPrice += 245.0 * productCount;
                    System.out.println("T 恤 ￥245.0\t\t\t" + "数量: " + productCount + "\t\t\t" + "合计: " + (245.0 * productCount));
                    break;
                case 2 :
                    totalPrice += 129.0 * productCount;
                    System.out.println("网球鞋 ￥129.0\t\t\t" + "数量: " + productCount + "\t\t\t" + "合计: " + (129.0 * productCount));
                    break;
                case 3 :
                    totalPrice += 29.0 * productCount;
                    System.out.println("网球拍 ￥29.0\t\t\t" + "数量: " + productCount + "\t\t\t" + "合计: " + (29.0 * productCount));
                    break;
                default:
                    System.out.println("输入错误！");
            }

            System.out.print("是否继续(y/n) :");
            input = scanner.next();

        }while (!"n".equals(input));

        System.out.println("折扣: 0.8");
        System.out.printf("应付金额: %.2f\n",totalPrice * 0.8);
        System.out.print("实付金额: ");
        double actuallyPaid = scanner.nextDouble();
        System.out.printf("找钱: %.2f\n",(actuallyPaid - totalPrice * 0.8));


        System.out.println("程序结束!");


    }

}
