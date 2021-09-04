package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 17:06
 * @description:
 */
public class Dog extends Pet{

    public Dog(int health, String name, int intimacy) {
        super(health, name, intimacy);
    }

    @Override
    public void play(String name) {

        System.out.println("玩耍前: ");
        System.out.println(this);
        System.out.println(name + "和" + this.getName() + "狗狗玩接飞盘游戏,狗狗健康值-10,和" + name + "亲密度+5");

        super.setHealth(super.getHealth() - 10);
        super.setIntimacy(super.getIntimacy() + 5);
        System.out.println("玩耍后:");
        System.out.println(this);
    }
}
