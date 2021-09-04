package practice.polymorphism;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 15:24
 * @description:
 */
public class Student extends Person{

    public Student(String name) {
        setName(name);
    }

    @Override
    public void work() {
        System.out.println(getName() + "学习");
    }
}
