package abstarct;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 10:31
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        Transportation transportation1 = new Bicycle("解放牌");
        Transportation transportation2 = new Subway("太原");

        Person zhangsan  = new Person("张三");

        zhangsan.goHome(transportation1);
        zhangsan.goHome(transportation2);


    }

}
