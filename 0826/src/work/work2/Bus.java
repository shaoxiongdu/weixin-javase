package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 16:14
 * @description: 最终公共汽车类
 */
public final class Bus extends MotoVehicle{

    /**
     * 最大载客
     */
    private int seatCount;

    /**
     * 带参构造
     * @param no 车牌号
     * @param seatCount 最大载客人数
     */
    public Bus(String no,int seatCount) {
        super();
        super.setNo(no);
        this.seatCount = seatCount;
    }

    public Bus(String no, String brand, int i) {
        super(no,brand);
        this.seatCount = i;
    }

    /**
     * 计算租金
     * @param days 天数
     * @return 租金
     */
    @Override
    public double calcRent(int days) {

        return seatCount <= 16 ? (days * 800) : (days * 1500);

    }
}
