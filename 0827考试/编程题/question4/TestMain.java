package question4;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:45
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        //兔子
        Animal tu = new Rabbit("美人","白色","哺乳类");
        tu.call();
        tu.eat();
        System.out.println("______________________________");
        //青蛙
        Frog wa = new Frog("癞蛤蟆","黑色","非哺乳类");
        wa.call();
        wa.eat();
        wa.swim();


    }

}
