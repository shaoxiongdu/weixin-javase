package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 17:30
 * @description:
 */
public class CalculateRent {

    public static double compute(MotoVehicle[] motoVehicles, int days){

        double total = 0.0;

        for (int i = 0; i < motoVehicles.length; i++) {

            total += motoVehicles[i].calcRent(days);

        }
        return total;

    }

}
