package abstarct;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 10:29
 * @description:
 */
public class Subway extends Transportation{
    public Subway(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println(getBrand() +  "地铁启动！");
    }
}
