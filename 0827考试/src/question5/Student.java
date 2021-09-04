package question5;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:50
 * @description:
 */
public class Student implements Comparable{

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
    private int age;

    /**
     * 分数
     */
    private int score;

    @Override
    public int compareTo(Object other) {

        //如果参数为Null 或者参数和调用者是同一个对象  直接返回0
        if(other == null | this == other) {
            return 0;
        }

        if(other instanceof Student){
            Student o = (Student)other;
            //根分数大小判断
            return (this.score == o.score ? 0 : (this.score > o.score ? 1 : -1));
        }
        //如果参数不是Student类型 返回0
        return 0;
    }

    @Override
    public String toString() {
        return "学生{" +
                "学号='" + id + '\'' +
                ", 姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 成绩=" + score +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
