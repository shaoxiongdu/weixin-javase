package abstarct;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 10:28
 * @description:
 */
public class Bicycle extends Transportation{

    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println(getBrand() +  "牌的自行车启动！");
    }
}
