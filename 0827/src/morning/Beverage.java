package morning;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 9:07
 * @description: 饮料类
 */
public class Beverage {

    //名称
    private String name;

    //容量
    private int capacity;

    //无参构造
    public Beverage() {
    }

    //带参构造
    public Beverage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * 添加配料方法
     */
    public void addIngredients(){

    }

    /**
     * 打印订单
     */
    public void printOrder(){
        System.out.println("您购买的饮料信息如下：");
        System.out.println("名称: " + name);
        System.out.println("容量: " + capacity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
