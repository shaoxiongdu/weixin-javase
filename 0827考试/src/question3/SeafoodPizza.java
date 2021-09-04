package question3;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:19
 * @description:
 */
public class SeafoodPizza extends Pizza{

    /**
     * 配料
     */
    private String burden;

    /**
     * 全餐构造
     * @param name 名字
     * @param price 价格
     * @param size 尺寸
     * @param burden 配料
     */
    public SeafoodPizza(double price, double size, String burden) {
        super("海鲜披萨", price, size);
        this.burden = burden;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("配料:" + burden);
    }
}
