package practice;
/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/17
 * @description:
 */public class MultiplicationTable {

    public static void main(String[] args) throws Exception {

        System.out.println(8 << 1);

    }


    /**
     * 输出到指定数字的乘法表
     * @param n 指定数字
     * @throws Exception 传入的n小于0或者大于1000，报出此异常
     */
    public static void printMultiplicationTable( int n ) throws Exception{

        if( n > 1000 || n < 1) throw new Exception("printMultiplicationTable方法传入的参数不合法: " + n);

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " * " + i + " = " + j * i + "\t");

            }
            System.out.println();
        }
    }

}
