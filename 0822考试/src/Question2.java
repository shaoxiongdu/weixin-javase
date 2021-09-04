/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description:
 *
 *  2.定义方法：打印指定行和列的矩形（控制台输入行；控制台输入列，通过打印输出一个矩阵）
 *
 */
public class Question2 {

    /**
     * 打印指定大小的矩形
     * @param m 行
     * @param n 列
     */
    public static void printStar(int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printStar(3,2);

    }

}
