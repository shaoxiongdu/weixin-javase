package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 16:38
 * @description:
 */
public class Goods {

    private int id;

    private String name;

    private double price;

    public Goods(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Goods() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\t\t" + id + "\t\t" + name + "\t\t" + price;
    }
}
