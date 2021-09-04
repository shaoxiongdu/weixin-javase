package work.work3;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:52
 * @description:
 */
public class Memory {

    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "内存{" +
                "容量=" + capacity +
                "GB";
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Memory(int capacity) {
        this.capacity = capacity;
    }
}
