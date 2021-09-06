package work.work2;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 16:44
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("请输入用户名: ");
            String userName = scanner.next();
            System.out.print("请输入密码: ");
            String password = scanner.next();

            //校验
            if(userName.equals("admin") && password.equals("123")){
                break;
            }
            System.out.println("用户名或者密码错误! 请重试!");
        }
        System.out.println("登录成功!");

        //显示数据
        Show.show();

        System.out.print("请输入批发的商品编号 :");
        int id = scanner.nextInt();
        System.out.print("请输入批发数量: ");
        int count = scanner.nextInt();

        double price = Show.getPriceById(id);

        String totalPrice = Utils.change(price * count);

        System.out.println("您需要付款: " + totalPrice);


    }

}
