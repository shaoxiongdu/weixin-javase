package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 16:12
 * @description: 最终轿车类
 */
public final class Car extends MotoVehicle{

    /**
     * 轿车类型
     */
    private String type;

    /**
     * 带参构造
     * @param no 车牌号
     * @param type 轿车类型
     */
    public Car(String no,String type) {
        super.setNo(no);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    /**
     * 计算租金
     * @param days 天数
     * @return 租金
     */
    @Override
    public double calcRent(int days) {

        double rent = 0.0;

        switch (this.type){
            case "别克商务舱GL8" :
                rent = days * 600;
                break;
            case "宝马500i" :
                rent = days * 500;
                break;
            case "别克林荫大道" :
                rent = days * 300;
                break;
        }
        return rent;
    }
}
