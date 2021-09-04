package work.work2;


import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/23
 * @description:
 */
public class UserTestMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserList userList = new UserList();

        //循环输入客户姓名
        while (true){
            System.out.print("请输入客户姓名(n结束): ");
            String name = scanner.next();
            if("n".equals(name)) break;
            userList.addUser(name);
        }

        System.out.println("*************** 排 序 前 *******************");
        //打印全部客户姓名
        userList.printUserList();

        //排序
        userList.sort();

        System.out.println("\n***************** 排 序 之 后 ********************");

        //打印
        userList.printUserList();
    }

}
