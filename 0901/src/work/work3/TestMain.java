package work.work3;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月01日 | 16:49
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {
        System.out.print("请输入1~3:");
        try {

            switch (new Scanner(System.in).nextInt()){
                case 1:
                    System.out.println("java");break;
                case 2:
                    System.out.println("php");break;
                case 3:
                    System.out.println("C#");break;
                default:
                    throw new NumberFormatException("输入数字不合法!");
            }
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("欢迎提出建议!");
        }

    }

}
