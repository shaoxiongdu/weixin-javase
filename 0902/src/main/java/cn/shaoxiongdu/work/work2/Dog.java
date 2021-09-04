package cn.shaoxiongdu.work.work2;

import com.apifan.common.random.source.PersonInfoSource;

import java.util.Objects;
import java.util.Random;
import java.util.StringJoiner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月02日 | 16:51
 * @description:
 */
public class Dog {

    private static PersonInfoSource personInfoSource = PersonInfoSource.getInstance();

    /**
     * 名字
     */
    private String name;

    /**
     * 品种
     */
    private Variety variety;


    /**
     * 生成一条随机的狗并返回
     * @return 随机的狗
     */
    public static Dog generateRandomDog(){
        Dog dog = new Dog();
        //随机姓名
        dog.setName(personInfoSource.randomChineseName());
        if(dog.getName().length() == 2){
            String name = "";
            name += dog.getName().charAt(0);
            name += " ";
            name += dog.getName().charAt(1);
            dog.setName(name);
        }
        //随机品种
        Random random = new Random();
        dog.setVariety(Variety.values()[random.nextInt(Variety.values().length)]);
        return dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Variety getVariety() {
        return variety;
    }

    public void setVariety(Variety variety) {
        this.variety = variety;
    }

    @Override
    public String toString() {
        return new StringJoiner("", "\t", "")
                .add(name)
                .add("\t\t\t" + variety.getName())
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

}
