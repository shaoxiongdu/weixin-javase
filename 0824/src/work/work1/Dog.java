package work.work1;

/**
 * @作者: 杜少雄 <github.com/shaoxiongdu>
 * @时间: 2021年08月24日 | 16:36
 * @描述:
 */
public class Dog {

    private String name;

    private int type;

    /**
     * 品种
     */
    private int variety;

    private int health = 60;

    /**
     * 亲密度
     */
    private int intimacy = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setVariety(int variety) {
        this.variety = variety;
    }

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }

    public void setHealth(int health){
        if(health <= 0 || health > 100){
            System.out.println("健康值应该在0-100之间，默认为60");
            this.health = 60;
        }else {
            this.health = health;
        }
    }

    @Override
    public String toString() {
        return "宠物的自白: \n" + "\t我的名字叫" + name + '\'' +
                "，健康值是" + health +
                ", 和主人的亲密度是" + intimacy + '\'' +
                ", 我是一只" + ((variety == 1)?"聪明的拉布拉多犬":"酷酷的雪纳瑞") +
                "。";
    }
}
