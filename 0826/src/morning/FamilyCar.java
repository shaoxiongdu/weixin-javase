package morning;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 9:18
 * @description:
 */
public class FamilyCar extends Car{

    private String owner;

    public FamilyCar(String model, String no, String owner) {
        super(model, no);
        this.owner = owner;
    }

    @Override
    public void start() {
        System.out.println("我是" + owner + "，我的汽车我做主!");
    }

    @Override
    public void stop() {
        System.out.println("目的地到了，我们去玩吧！");
    }
}
