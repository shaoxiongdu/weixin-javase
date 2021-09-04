package work.work3;

import java.util.List;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 17:30
 * @description:
 */
public class CalculateRent {

    public static double compute(List<MotoVehicle> motoVehicles, int days){

        double total = 0.0;

        for (int i = 0; i < motoVehicles.size(); i++) {

            total += motoVehicles.get(i).calcRent(days);

        }
        return total;

    }

}
