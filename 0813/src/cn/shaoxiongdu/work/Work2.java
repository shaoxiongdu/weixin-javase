package cn.shaoxiongdu.work;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/13
 * @description:
 */
public class Work2 {

    private static Map <Integer,String > products = new HashMap<Integer,String >();
    //初始化数据
    static {
        products.put(1,"T 恤 ￥245.0");
        products.put(2,"网球鞋 ￥129.0");
        products.put(3,"网球拍 ￥29.0");
    }

    public static void main(String[] args) {

        System.out.println("******************************************************");
        Set<Map.Entry<Integer, String>> entries = products.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.print(entry.getKey() + ". " + entry.getValue() + "\t\t");
        }
        System.out.println("\n******************************************************");

        //商品编号
        int productId = -1;

        //用户选择
        String input = null;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("输入商品编号: ");
            productId = scanner.nextInt();
            if(products.containsKey(productId)){
                System.out.println(products.get(productId));
            }else {
                System.out.println("输入有误");
            }
            System.out.print("是否继续(y/n) :");
            input = scanner.next();
        }while (!"n".equals(input));

        System.out.println("程序结束!");

    }

}
