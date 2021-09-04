package cn.shaoxiongdu.work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/12
 * @description:
 */
public class Work3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入百米赛跑时间: ");
        int time = scanner.nextInt();
        System.out.println("请输入性别: ");
        String sex = scanner.next();

        if(time < 10){
            System.out.print("进入决赛，进入的是");

            if(sex.equals("男")){
                System.out.println("男子组");
            }else if(sex.equals("女")){
                System.out.println("女子组");
            }else {
                System.out.println("其他组");
            }

        }else {
            System.out.println("没有进入决赛");
        }

    }

}
