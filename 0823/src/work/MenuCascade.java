package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/23
 * @description: 菜单的级联效果
 */
public class MenuCascade {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //创建菜单对象
        MenuCascade menuCascade = new MenuCascade();

        //启动
        menuCascade.run();

    }


    public void run(){

        loginMenu();

    }

    //登录
    public void loginMenu(){

        System.out.println("\t欢迎使用我行我素购物管理系统");
        System.out.println("\t1.登陆系统");
        System.out.println("\t2.退出");
        System.out.print("请输入数字: ");
        int n = scanner.nextInt();
        switch (n){
            case 1 : mainMenu();
            break;
            case 2 : return;
        }

    }

    //主菜单
    public void mainMenu(){

        System.out.println("\t我行我素购物管理系统主菜单");
        System.out.println("\t1.客户信息管理");
        System.out.println("\t2.真情回馈");
        System.out.print("请输入数字（0回到上一级）: ");
        int n = scanner.nextInt();
        switch (n){
            case 0 :
                loginMenu();
                break;
            case 1 :
                showCustMenu();
                break;
            case 2 : showSendMenu();
        }

    }

    // 真情回馈
    private void showSendMenu() {

        System.out.println("\t我行我素购物管理系统 > 真情回馈");
        System.out.println("\t1.幸运大放送");
        System.out.println("\t2.幸运抽奖");
        System.out.println("\t3.生日问候");
        System.out.print("请输入数字（0回到上一级）: ");
        int n = scanner.nextInt();
        switch (n){
            case 0 :
                mainMenu();
                break;
            case 1 :
                System.out.println("执行幸运大放送");
                break;
            case 2 :
                System.out.println("执行幸运抽奖");
                break;
            case 3 :
                System.out.println("执行生日问候");
                break;
        }

    }

    //客户信息管理
    private void showCustMenu() {
    }

}
