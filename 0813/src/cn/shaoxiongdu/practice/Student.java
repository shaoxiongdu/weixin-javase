package cn.shaoxiongdu.practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/13
 * @description:
 */
public class Student {

    public static void main(String[] args) {

        double student = 250000;

        int year = 2012;
        while ( student <= 1000000.0){
            student *= 1.25;
            year++;
        }

        System.out.println( year + "年之后到达100万");

    }

}
