package practice.polymorphism;

import morning.Car;
import morning.FamilyCar;
import morning.TAXI;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 15:32
 * @description:
 */
class TestMainTest {

    @org.junit.jupiter.api.Test
    void main() {

        Car car = new Car("父类汽车","晋A5433");
        car.start();
        car.stop();

        TAXI taxi = new TAXI("出租车","晋B3423","晋中市出租车公司");
        taxi.start();
        taxi.stop();

        FamilyCar familyCar = new FamilyCar("家用车","晋C2342","武大郎");

        familyCar.start();
        familyCar.stop();

    }
}