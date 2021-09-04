package work.work3;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:49
 * @description:
 */
public class CPU {

    private String brand;

    private double mainFrequency;

    public CPU(String brand, double mainFrequency) {
        this.brand = brand;
        this.mainFrequency = mainFrequency;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMainFrequency() {
        return mainFrequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "品牌='" + brand + '\'' +
                ", 主频=" + mainFrequency +
                '}';
    }

    public void setMainFrequency(double mainFrequency) {
        this.mainFrequency = mainFrequency;
    }
}
