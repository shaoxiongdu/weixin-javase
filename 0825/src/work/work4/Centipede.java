
package work.work4;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 16:46
 * @description: 蜈蚣怪类
 */
public class Centipede extends Monster{

    public Centipede(String name, double hp, double attackPower) {
        super(name, hp, attackPower);
    }

    /**
     * 蜈蚣的行走方法
     */
    @Override
    public void move() {
        System.out.println("我是蜈蚣【" + getName() + "】，御风飞行！");
    }

    @Override
    public void attack() {
        System.out.print("蜈蚣精怪\t");
        super.attack();
    }
}
