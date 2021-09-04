package work.work3;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:51
 * @description:
 */
public class HardDisk {

    private int capacity;

    public HardDisk(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "硬盘{" +
                "容量=" + capacity +
                "GB";
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
