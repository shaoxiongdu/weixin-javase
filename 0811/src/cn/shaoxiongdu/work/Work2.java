package cn.shaoxiongdu.work;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/11
 * @description: 已知圆的半径1.5 求面积
 */
public class Work2 {

    //常量PI
    private static final double PI = Math.PI;

    public static void main(String[] args) {

        //半径
        double radius = 1.5;

        //计算面积
        double area = PI * Math.pow(radius,2);

        //打印
        System.out.printf("半径为%.2f的面积是%.2f",radius,area); //半径为1.50的面积是7.07


    }

}
