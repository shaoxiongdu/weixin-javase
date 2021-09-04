package question4;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:45
 * @description:
 */
public class Rabbit extends Animal{

    public Rabbit(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    public void eat() {
        System.out.println("兔子是" + getType() + "，爱吃胡萝卜哦");
    }

    @Override
    public void call() {
        System.out.println("那只"+getColor()+"的，名叫" + getName() + "的兔子正在叽叽叫！");
    }
}
