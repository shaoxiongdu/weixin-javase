package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/17
 * @description:
 */
public class Sum {

    public static void main(String[] args) {

        System.out.println(sum(100));

    }

    /**
     * 递归
     * @param n
     * @return
     */
    public static int sum(int n){

        if(n == 1) return 1;
        return sum(n-1) + n;
    }

}
