package question2.act;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:01
 * @description: 运动员类
 */
public class Athlete extends Person{

    /**
     * 运动项目
     */
    private String sports;

    /**
     * 历史最好成绩
     */
    private double maxScore;

    /**
     * 带参构造
     * @param name 姓名
     * @param age 年龄
     * @param sex 性别
     * @param sports 运动项目
     * @param maxScore 最高分
     */
    public Athlete(String name, int age, char sex, String sports,double maxScore){
        super(name, age, sex);
        this.sports = sports;
        this.maxScore = maxScore;
    }

    @Override
    public void saySelf() {
        super.saySelf();
        System.out.println("我擅长的运动项目是： " + sports);
        System.out.println("历史最好成绩: " + maxScore);

    }
}
