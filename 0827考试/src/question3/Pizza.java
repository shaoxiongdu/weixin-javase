package question3;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:14
 * @description: 培根
 */
public class Pizza {

    //培根名称
    private String name;

    //培根价格
    private double price;

    //培根尺寸
    private double size;

    //展示
    public void show() {
        System.out.println("*********************");
        System.out.println("名称:" + name);
        System.out.println("价格:" + price);
        System.out.println("大小:" + size + "寸");
    }

    public Pizza(String name, double price, double size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }
}