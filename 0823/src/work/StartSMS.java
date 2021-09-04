package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/23
 * @description:
 */
public class StartSMS {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        StartSMS startSMS = new StartSMS();
        startSMS.loginMenu();

    }

    public void loginMenu(){
        System.out.println("欢迎使用我行我素购物管理系统");
        System.out.println("*********************************");
        System.out.println("1. 登录系统");
        System.out.println("2. 退出");
        System.out.println("*********************************");

        System.out.print("请选择: ");
        int n = scanner.nextInt();

        if(n == 1){
            login();
        }else if(n == 2){
            System.out.println("退出系统!");
            return;
        }
    }

    private void login() {
        System.out.println("*********************************");

        System.out.print("请输入用户名:");
        String username = scanner.next();
        System.out.print("请输入密码:");
        String password = scanner.next();
        if("JadeBird".equals(username) && "0000".equals(password)){
            System.out.println("登陆成功!");
            mainMenu();
        }else {
            System.out.println("@@您没有权限进入系统, 请重新登录@@");
            System.out.println("*********************************");
            loginMenu();
        }

    }

    private void mainMenu() {
        System.out.println("我行我素购物管理系统主菜单");
        System.out.println("*****************************");
        System.out.println("1. 客户信息管理");
        System.out.println("2. 真情回馈");
    }

}
