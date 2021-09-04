package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description:
 */
public class Work1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();
        user.userName = "admin";
        user.password = "admin";
        System.out.println("\n---登录---\n");
        while (true){
            System.out.print("用户名: ");
            String username = scanner.next();
            System.out.print("密码: ");
            String password = scanner.next();

            if(!user.check(username,password)){
                System.out.println("\n用户名或密码错误，您没有权限更新管理员信息。");
                System.out.println("-\n--请重新登录---\n");
                continue;
            }
            System.out.println("\n---登录成功---\n");
            System.out.print("请输入新密码: ");
            String newPassword = scanner.next();
            user.updatePassword(newPassword);
            System.out.println("\n---请重新登录---\n");
        }

    }

    static class User{

        public String userName;

        public String password;

        /**
         * 校验用户身份
         * @param userName 用户名
         * @param password 密码
         * @return 校验结果 true-合法 false-不合法
         */
        public boolean check(String userName, String password){
            return userName.equals(this.userName) && password.equals(this.password);
        }

        public void updatePassword(String newPassword){
            password = newPassword;
            System.out.println("修改密码成功，您的新密码为： " + newPassword);
        }
    }


}
