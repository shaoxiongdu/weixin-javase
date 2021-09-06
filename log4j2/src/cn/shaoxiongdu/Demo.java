package cn.shaoxiongdu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月02日 | 11:23
 * @description:
 */
public class Demo {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        div();
    }

    public static void div(){

        Scanner scanner = new Scanner(System.in);

        int result = 0,num1 = 0,num2 = 0;

        try {
            System.out.println("请输入一个被除数:");
            num1 = scanner.nextInt();
            System.out.println("请输入一个除数:");
            num2 = scanner.nextInt();
            result = num1 / num2;
            logger.info("成功执行: \t被除数:" + num1 + "\t" + "除数:" + num2 + "\t结果" + result);
        }catch (InputMismatchException e){
            logger.error("发生错误\t输入格式错误,",e.getStackTrace());
            e.printStackTrace();
        }catch (ArithmeticException e){
            logger.error("发生错误\t算数运算错误",e.getStackTrace());
            e.printStackTrace();
        } finally {
            logger.info("记录\t感谢使用!");
        }

    }

}
