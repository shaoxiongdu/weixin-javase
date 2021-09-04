package question4;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:37
 * @description: 抽象动物类
 */
abstract public class Animal {

    /**
     * 姓名
     */
    private String name;

    /**
     * 颜色
     */
    private String color;

    /**
     * 类别 （哺乳类，非哺乳类）
     */
    private String type;

    //无餐构造
    public Animal() {
    }

    //但参构造
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    /**
     * 吃饭抽象方法
     */
    public abstract void eat();

    /**
     * 叫抽象方法
     */
    public abstract void call();

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
