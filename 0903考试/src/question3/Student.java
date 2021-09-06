package question3;

import java.util.StringJoiner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月03日 | 15:22
 * @description:
 */
public class Student{

    /**
     * 学号
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;



    public Student(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return new StringJoiner("\t", "学生:\t", "")
                .add("年龄='" + age + "'")
                .add("姓名='" + name + "'")
                .add("学号='" + id + "'")
                .toString();
    }

    public Student() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



}
