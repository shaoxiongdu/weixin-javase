package morning;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 9:13
 * @description: 抽象汽车类
 */
public class Car {

    /**
     * 车型
     */
    private String model;

    /**
     * 车牌
     */
    private String no;

    /**
     * 启动
     */
    public  void start(){
        System.out.println("我是车，我启动");
    }

    /**
     * 停止
     */
    public void stop(){
        System.out.println("我是车，我停止");
    }

    public Car(String model, String no) {
        this.model = model;
        this.no = no;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
