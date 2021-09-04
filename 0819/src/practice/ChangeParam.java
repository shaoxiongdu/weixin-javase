package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description: 可变参数
 */
public class ChangeParam {

    public static void main(String[] args) {

        int sum = sum(1, 2, 3, 4, 5, 6, 6, 2, 2, 4, 4, 3245, 2, 2, 2, 23, 234, 2354, 34, 63, 6, 3, 4, 45, 234, 2);
        System.out.println(sum);

    }

    public static int sum(int ... param){

        int sum = 0;
        for (int i = 0; i < param.length; i++) {
            sum += param[i];
        }
        return sum;
    }

}
