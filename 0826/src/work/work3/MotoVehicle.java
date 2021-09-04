package work.work3;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 16:09
 * @description: 机动车抽象类
 */
public abstract class MotoVehicle {

    /**
     * 车牌号
     */
    private String no;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 颜色
     */
    private String Color;

    /**
     * 里程
     */
    private String mileage;

    /**
     * 计算组件
     * @param days 天数
     * @return 租金
     */
    public abstract double calcRent(int days);

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "\t\t车牌号=" + no + ",\t\t品牌=" + brand;
    }
}
