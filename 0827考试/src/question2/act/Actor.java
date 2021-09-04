package question2.act;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:01
 * @description: 演员类
 */
public class Actor extends Person{

    /**
     * 毕业院校
     */
    private String graduatedSchool;

    /**
     * 代表作
     */
    private String masterpiece;

    /**
     * 带参构造
     * @param name 姓名
     * @param age 年龄
     * @param sex 性别
     * @param graduatedSchool 毕业院校
     * @param masterpiece 代表作
     */
    public Actor(String name, int age, char sex, String graduatedSchool,String  masterpiece) {
        super(name, age, sex);
        this.graduatedSchool = graduatedSchool;
        this.masterpiece =masterpiece;
    }

    @Override
    public void saySelf() {
        super.saySelf();
        System.out.println("我毕业于毕业： " + graduatedSchool);
        System.out.println("代表作有： " + masterpiece);

    }
}
