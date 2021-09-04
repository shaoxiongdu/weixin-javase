package work.work2;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 16:22
 * @description:
 */
public class TestMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("欢迎来到汽车租赁公司! ");

        System.out.print("请输入要租赁的天数: ");

        int days = scanner.nextInt();

        System.out.print("\n1.轿车 2.客车 \n--------------------- \n请输入要租赁的汽车类型: ");
        int type = scanner.nextInt();
        switch (type){
            //租轿车
            case 1 : carRental(days);break;
            //租大巴
            case 2 : rentalBus(days);break;
        }

    }

    public static void carRental(int days){

        MotoVehicle motoVehicle = null;

        System.out.print("\n1.别克商务舱GL8 2.宝马500i 3.别克林荫大道\n --------------\n 请输入要租赁的汽车型号");

        int model = scanner.nextInt();

        switch (model){

            case 1 :
                motoVehicle = new Car("晋A54h93","别克商务舱GL8");
                break;
            case 2 :
                motoVehicle = new Car("晋B534f9","宝马500i");
                break;
            case 3 :
                motoVehicle = new Car("晋C97g52","别克林荫大道");
                break;

        }

        System.out.println("分配给您的汽车牌号是：" + motoVehicle.getNo());

        System.out.println("顾客您好，您需要支付的租赁费用是: " + motoVehicle.calcRent(days) + "。");
    }

    public static void rentalBus(int days){

        MotoVehicle motoVehicle = null;

        System.out.print("请输入你需要的最大载客人数 :");

        int seatCount = scanner.nextInt();

        motoVehicle = new Bus("晋D48gt5",seatCount);

        System.out.println("分配给您的汽车牌号是：" + motoVehicle.getNo());

        System.out.println("顾客您好，您需要支付的租赁费用是: " + motoVehicle.calcRent(days) + "。");

    }

}
