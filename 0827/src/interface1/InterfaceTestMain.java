package interface1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 8:18
 * @description:
 */
public class InterfaceTestMain {

    public static void main(String[] args) {

        Flyable flyable = new Plane();

        flyable.fly();
        flyable.stop();

    }

}

/**
 * 可以飞的
 */
interface Flyable{

    /**
     * 全局常量 最快速度 【第一宇宙速度】
     */
    public static final double MAX_SPEED = 7900.00;
    /**
     * 最慢速度
     */
    public static final double MIN_SPEED = 1.00;

    /**
     * 飞行
     */
    public abstract void fly();

    /**
     * 停止
     */
    public abstract void stop();

}

/**
 * 飞机实现类
 */
class  Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("~~~~~~~~~~~ 芜 湖 起 飞 ~~~~~~~~~~~~~");
    }

    @Override
    public void stop() {
        System.out.println("~~~~~~~~~~~ 坠 机 ！~~~~~~~~~~~~~");
    }
}
