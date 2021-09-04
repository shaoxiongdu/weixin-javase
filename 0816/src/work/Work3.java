package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/16
 * @description:
 */
public class Work3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = "zhangsan";
        String password = "123456";

        for (int i = 1; i <= 3; i++) {

            System.out.print("请输入用户名: ");
            String inputUsername = scanner.next();
            System.out.print("请输入密码: ");
            String inputPassword = scanner.next();

            if(inputUsername.equals(username) && inputPassword.equals(password)){
                System.out.println("欢迎登录Shopping系统");
                break;
            }else if(i ==3){
                System.out.println("对不起，您3次都输入错误!");
            } else {
                System.out.println("输入错误，宁还有" + (3 - i) + "次机会");
            }

        }


    }

}
