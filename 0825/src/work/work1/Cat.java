package work.work1;

/**
 * @作者: 杜少雄 <github.com/shaoxiongdu>
 * @时间: 2021年08月25日 | 11:17
 * @描述:
 */
public class Cat extends Animal {

    /**
     * 爱好
     */
    private String  hobby;

    /**
     * 玩球
     */
    public void playBall(){
        System.out.println("小猫" + this.getName() + "在玩球");
    }

    @Override
    public String toString() {
        return super.toString() +
                "hobby='" + hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
