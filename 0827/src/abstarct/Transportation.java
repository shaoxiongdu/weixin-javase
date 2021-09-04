package abstarct;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 10:27
 * @description: 交通工具抽象类
 */
public abstract class Transportation {

    private String brand;

    public abstract void run();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Transportation() {

    }

    public Transportation(String brand) {
        this.brand = brand;
    }
}
