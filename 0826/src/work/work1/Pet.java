package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 17:03
 * @description: 宠物类
 */
public class Pet {

    /**
     * 健康度
     */
   private int health;

   private String name;

   public void play(String name){

   }

    /**
     * 亲密度
     */
   private int intimacy;

    public Pet(int health, String name, int intimacy) {
        this.health = health;
        this.name = name;
        this.intimacy = intimacy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }

    @Override
    public String toString() {
        return name + "宠物的当前状态{" +
                "健康度=" + health +
                ", 和主人亲密度=" + intimacy +
                '}';
    }

}
