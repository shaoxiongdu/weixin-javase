package practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description: 学生类
 */
public class Student {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 班级
     */
    private String className;

    /**
     * 爱好
     */
    private List<String> hobbys = new ArrayList();

    /**
     * 添加爱好
     * @param hobby
     */
    public void addHobby(String hobby){
        hobbys.add(hobby);
    }

    @Override
    public String toString() {
        return "学生{ " +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 班级=" + className +
                ", 爱好=" + hobbys.toString() +
                "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List getHobby() {
        return hobbys;
    }

    public void setHobby(List hobby) {
        this.hobbys = hobby;
    }
}
