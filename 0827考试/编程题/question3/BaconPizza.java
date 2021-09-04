package question3;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:16
 * @description: 培根披萨
 */
public class BaconPizza extends Pizza{

    /**
     * 培根克数
     */
    private int baconGram;

    /**
     *  全参构造
     * @param name 名字
     * @param price 价格
     * @param size 大小
     * @param baconGram 培根克数
     */
    public BaconPizza(double price, double size, int baconGram) {
        super("培根披萨", price, size);
        this.baconGram = baconGram;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("培根克数: " + baconGram);
    }
}
