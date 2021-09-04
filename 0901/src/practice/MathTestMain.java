package practice;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月01日 | 9:46
 * @description:
 */
public class MathTestMain {

    public static void main(String[] args) {

        //圆周率
        System.out.println(Math.PI);
        //自然底数
        System.out.println(Math.E);

        //取100到200的随机数 前后都包含
        System.out.println((int)(Math.random() * 101 + 100));

        System.out.println(Math.decrementExact(3));

        System.out.println(Integer.toHexString(16));

        System.out.println(Runtime.getRuntime().maxMemory());
    }

}
