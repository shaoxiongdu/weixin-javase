package work.work4;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 16:46
 * @description: 蛇怪类
 */
public class Snake extends Monster{

    public Snake(String name, double hp, double attackPower) {
        super(name, hp, attackPower);
    }

    /**
     * 蛇怪的补血方法
     */
    public void addHp(){

        System.out.println("尝试补血! " + toString());

        if(getHp() < 10){
            setHp(getHp() + 20);
            System.out.println("补血成功！" + toString());
        }else {
            System.out.println("当前生命值过高，无法补血！ " + toString());
        }
        
    }

    @Override
    public void attack() {
        System.out.print("蛇怪\t");
        super.attack();
    }

    /**
     * 蛇怪的行走方法
     */
    @Override
    public void move() {
        System.out.println("我是蛇怪【" + getName() + "】，我走S型路线");
    }


}
