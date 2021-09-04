package practice;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 11:07
 * @description:
 */
public class HashCodeTestMain {

    public static void main(String[] args) {

        Object object1 = new Object();
        Object object2 = new Object();

        System.out.println(object1.hashCode());
        System.out.println(object2.hashCode());

        String s1 = "1";
        String s2 = "1";

        System.out.println(s1.hashCode() == s2.hashCode());

        long l = Runtime.getRuntime().totalMemory();
        System.out.println(l / 1024 / 1024 + "MB");

    }

}
