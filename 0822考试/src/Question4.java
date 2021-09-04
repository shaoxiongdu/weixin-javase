import java.util.Arrays;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description:
 *
 * 4.数组A：1，7，9，11，13，15，17，19；数组b：2，4，6，8，10    
 * 两个数组合并为数组c，按升序排列。 要求：使用Arrays类的方法快速实现
 *
 *
 */
public class Question4 {

    public static void main(String[] args) {

        int [] a = {1,7,9,11,13,15,17,19};
        int [] b = {2,4,6,8,10};

        int [] result = new int[a.length + b.length];

        //a加入数组
        for (int i = 0; i < a.length; i++) {

            result[i] = a[i];

        }

        //b加入数组
        for (int i = 0; i < b.length; i++) {

            result[i + a.length] = b[i];

        }

        //排序
        Arrays.sort(result);

        //输出
        System.out.println(Arrays.toString(result));

    }

}
