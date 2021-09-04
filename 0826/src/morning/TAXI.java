package morning;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 9:16
 * @description:
 */
public class TAXI extends Car{

    private String company;

    public TAXI(String model, String no,String company) {
        super(model, no);
        this.company = company;
    }

    @Override
    public void start() {
        System.out.println("乘客您好，我是" + company + "的，我的车牌号是 "  + getNo() + ",您要去哪里？");
    }

    @Override
    public void stop() {
        System.out.println("目的地已经到了，请您付费下车，欢迎再次乘坐！");
    }
}
