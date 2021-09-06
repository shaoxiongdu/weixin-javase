package work.work5;

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
            System.out.print("请输入身份证: ");
            String id = scanner.next();
            System.out.print("请输入手机号: ");
            String phone = scanner.next();
            System.out.print("请输入座机号: ");
            String landlineNumber = scanner.next();

            if(id.length() != 16 && id.length() != 18 ){
                System.out.println("身份证号必须是16或者18位");
                continue;
            }
            if(phone.length() != 11){
                System.out.println("手机号必须11位!");
                continue;
            }
            String[] split = landlineNumber.split("-");
            if( split[0].length()!=4 || split[1].length()!=11 ){
                System.out.println("座机号码区号必须为4位，电话号码必须为7位");
                continue;
            }
            break;
        }
        System.out.println("注册成功!");



    }

}
