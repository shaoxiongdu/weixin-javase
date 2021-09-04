package work.work4;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 16:42
 * @description: 抽象怪物类
 */
public abstract class Monster {

    /**
     * 怪物名字
     */
    private String name;

    /**
     * 生命值
     */
    private double hp;

    /**
     * 攻击力
     */
    private double attackPower;

    /**
     * 攻击
     */
    public void attack(){
        System.out.print("【" + getName() + "】以【"+getAttackPower()+"的攻击力】进行攻击!");
        System.out.println("\t当前血量【" + getHp() + "】!");
    }

    public Monster() {
    }

    public Monster(String name, double hp, double attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    /**
     * 移动
     */
    public abstract void move();

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    public String toString() {
        return "怪物{" +
                "名字='" + name + '\'' +
                ", 血量=" + hp +
                ", 攻击力=" + attackPower +
                '}';
    }
}
