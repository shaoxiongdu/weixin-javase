package work.work3;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 17:25
 * @description: 注册
 */
public class Registered {


    public static void main(String [] args){

        System.out.println("***欢迎进入注册系统***");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("请输入用户名: ");
            String username = scanner.next();
            System.out.print("请输入密码: ");
            String password = scanner.next();
            System.out.print("请再次输入密码: ");
            String againPassword = scanner.next();

            if(username.length() < 3 || password.length() < 6){
                System.out.println("用户名长度不小于3，密码长度不小于6");
                continue;
            }
            if(!password.equals(againPassword)){
                System.out.println("两次输入的密码不同!");
                continue;
            }
            break;
        }
        System.out.println("注册成功，牢记用户名和密码!");



    }

}
