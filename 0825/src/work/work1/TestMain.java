package work.work1;

import java.awt.*;

/**
 * @作者: 杜少雄 <github.com/shaoxiongdu>
 * @时间: 2021年08月25日 | 11:22
 * @描述:
 */
public class TestMain {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setIntimacy(100);
        dog.setColor(new Color(123,232,213));
        dog.setName("旺财");
        dog.setVariety("二哈");
        System.out.println(dog);
        dog.lookHome();

        Cat cat = new Cat();
        cat.setName("小猫猫");
        cat.setColor(new Color(121,121,121));
        cat.setHobby("抽烟喝酒烫头");
        cat.setVariety("蒙古西蒙达尔猫");
        System.out.println(cat);
        cat.playBall();


    }

}
