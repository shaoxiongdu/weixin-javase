package practice.customenum;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 15:23
 * @description:
 */
public class OrderStateTestMain {

    @Test
    void main(){

        Random random = new Random();

        OrderState orderState = null;

        OrderState[] values = OrderState.values();

        while (true){

            int randomInt = random.nextInt(values.length);

            orderState = values[randomInt];

            System.out.println(orderState);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }





    }

}
