package work;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description:
 */
public class Work9 {

    public static void main(String[] args) {

        printStar(10,20);

    }

    /**
     * 生成指定参数的由*组成的矩形图案
     * @param n 行
     * @param m 列
     */
    public static void printStar(int n, int m){
        System.out.println(n + "行" + m + "列");
        for (int i = 0; i < m; i++) {
        }
        System.out.println();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print("*" + "\t");

            }
            System.out.println();
        }

    }

}
