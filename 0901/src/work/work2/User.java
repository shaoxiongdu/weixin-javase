package work.work2;

import java.util.StringJoiner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月01日 | 16:44
 * @description:
 */
public class User {

    private String name;

    private String sex;

    private int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    /**
     * 设置用户性别
     * @param sex 欲设置的性别
     * @throws Exception 当参数非"男"非"女“时 抛出此异常
     */
    public void setSex(String sex) throws Exception {
        if(!"男".equals(sex) && !"女".equals(sex)) throw new Exception("性别不合法: " + sex);
        this.sex = sex;
    }


    /**
     * 设置年龄
     * @param age 年龄
     * @throws Exception 当参数>=100或<=0时 抛出
     */
    public void setAge(int age) throws Exception {
        if(age <= 0 || age >= 100) throw new Exception("年龄不合法: " + age);
        this.age = age;
    }

    public User() {
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("sex='" + sex + "'")
                .add("age=" + age)
                .toString();
    }
}
