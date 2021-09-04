package work.work1;

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

        //打印全部客户姓名
        userList.printUserList();

        //修改姓名
        System.out.print("请输入要修改的客户姓名: ");
        String oldName = scanner.next();
        System.out.print("请输入新的客户姓名: ");
        String newName = scanner.next();

        userList.updateUserName(newName,oldName);

        //打印
        userList.printUserList();
    }

}
