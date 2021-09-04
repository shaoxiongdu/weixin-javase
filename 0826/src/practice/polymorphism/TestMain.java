package practice.polymorphism;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 15:25
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        Person person1 = new Teacher("王老师");
        Person person2 = new Student("李同学");

        person1.work();
        person2.work();

    }

}
