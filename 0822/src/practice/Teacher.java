package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description:
 */
public class Teacher {

    /**
     * 姓名
     */
    private String name;

    /**
     * 专业方向
     */
    private String specialty;

    /**
     * 教授课程
     */
    private String direction;

    /**
     * 教龄
     */
    private int teachingAge;

    @Override
    public String toString() {
        return "教师{" +
                "姓名='" + name + '\'' +
                ", 专业='" + specialty + '\'' +
                ", 方向='" + direction + '\'' +
                ", 教学年龄=" + teachingAge +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setTeachingAge(int teachingAge) {
        this.teachingAge = teachingAge;
    }
}
