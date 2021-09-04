package work.work3;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 17:42
 * @description:
 */
public class Truck extends MotoVehicle{

    private int tonnage;

    public Truck(String no, int tonnage,String barand) {
        super.setBrand(barand);
        super.setNo(no);
        this.tonnage = tonnage;
    }

    @Override
    public double calcRent(int days) {
        return tonnage * days * 50;
    }

    @Override
    public String toString() {
        return "卡车:" +"\t\t吨位=" + tonnage + super.toString();
    }
}
