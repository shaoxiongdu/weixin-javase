package question4;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:41
 * @description: 青蛙
 */
public class Frog extends Animal implements Swimable{

    public Frog(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    public void eat() {
        System.out.println("青蛙是" + getType() + "爱吃昆虫");
    }


    @Override
    public void call() {
        System.out.println("那只"+getColor()+"的，名叫" + getName() + "的青蛙正在瓜瓜叫！");
    }

    @Override
    public void swim() {
        System.out.println("虽然不是鱼，但青蛙也是游泳高手!");
    }
}
