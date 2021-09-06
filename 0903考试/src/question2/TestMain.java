package question2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月03日 | 14:21
 * @description:
 *
 * 2.编写一个计算N个整数平均值的程序。程序应该提示用户输入N的值，如何必须输入所有N个数。
 * 如果用户输入的值是一个负数，则应该抛出一个异常并捕获，提示“N必须是正数或者0”。
 * 并提示用户再次输入该数
 *
 */
public class TestMain {

    public static void main(String[] args) {

        //输入流
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入n:");

        //n
        int n = scanner.nextInt();

        //存储值的数组
        int [] numbers = new int[n];

        for (int i = 0; i < n;) {

            int x = 0;
            try {
                System.out.print("请输入第" + (i+1) + "个数:");
                x = scanner.nextInt();
                if(x < 0) throw new Exception("N必须是正数或者0, 请重新输入!");
            }catch (Exception e){
                System.out.println(e.getMessage());
                continue;
            }
            numbers[i] = x;
            i++;
        }

        System.out.println("这些数的平均值为: " + average(numbers));


    }

    /**
     * 平均值
     * @param numbers 数组
     * @return 算好的平均值
     */
    public static double average(int [] numbers){

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }

}
