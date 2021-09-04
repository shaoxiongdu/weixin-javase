package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description:
 */
public class Work {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            System.out.print("第"+(i+1)+"家手机价格: ");
            int n = scanner.nextInt();
            if(n < min){
                min = n;
            }
        }
        System.out.println("最低价为:" + min);
    }

}
