package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/16
 * @description:
 */
public class evenSum {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <=10 ; i++) {

            if(! (i % 2 == 0)){
                continue;
            }
            sum = i;

        }
        System.out.println("和是" + sum);


    }

}
