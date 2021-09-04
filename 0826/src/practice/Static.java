package practice;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 15:38
 * @description:
 */
public class Static {

    static {
        System.out.println("Static类被加载");
    }

    public static String staticStringValue = "静态字符串";

    public static String getStaticStringValue(){
        return staticStringValue;
    }
}
