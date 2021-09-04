package work.work2;

/**
 * @作者: 杜少雄 <github.com/shaoxiongdu>
 * @时间: 2021年08月24日 | 16:52
 * @描述:
 */
public class Penguin {

    public static final String SEX_MALE = "雄";

    public static final String SEX_FEMALE = "雌";

    private String name;

    private int type;

    private int sex;

    private int intimacy;

    private int health;

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {

        return "宠物的自白: \n" + "\t我的名字叫" + name + '\'' +
                "，健康值是" + health +
                ", 和主人的亲密度是" + intimacy + '\'' +
                ", 性别是:" + (sex == 1 ? SEX_MALE:SEX_FEMALE) +
                "。";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
