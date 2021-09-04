package work.work3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 18:53
 * @description:
 */
public class Ui {

    private static Scanner scanner = new Scanner(System.in);

    private static Random random = new Random();

    private static List<MotoVehicle> motoVehicleList = new ArrayList<>();


    public void run(){


        System.out.println("欢迎来到汽车租赁公司! ");

        System.out.print("请输入要租赁的天数: ");

        int days = scanner.nextInt();

        System.out.println("-----------------------------------------");

        while (true){

            System.out.print("\n1.轿车\n2.客车\n3.卡车\n--------------------- \n请输入您的选择: ");

            int type = scanner.nextInt();

            if(type == 0) break;

            switch (type){
                //租轿车
                case 1 : carRental(days);break;
                //租大巴
                case 2 : rentalBus(days);break;
                //卡车
                case 3 : addTruck(days);break;
            }

            System.out.println("继续添加吗?(y/n): ");
            String s = scanner.next();
            if(s.equals("n")) break;

        }

        System.out.println("------------------------选 择 完 毕，正 在 结 算------------------------------");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double total = CalculateRent.compute(motoVehicleList,days);


        System.out.println("\n----------------------------------------------您 的 订 单----------------------------------------------");

        for (int i = 0; i < motoVehicleList.size(); i++) {
            System.out.println(motoVehicleList.get(i) + "\t\t价格: " + motoVehicleList.get(i).calcRent(days) + "￥");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t租赁天数: " + days);

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t共计: " + total + "￥");

    }

    //添加轿车方法
    public static void carRental(int days){

        MotoVehicle motoVehicle = null;

        System.out.print("\n1.别克商务舱GL8\n2.宝马500i\n3.别克林荫大道\n --------------\n 请输入要租赁的汽车型号:");

        int model = scanner.nextInt();

        switch (model){

            case 1 :
                motoVehicle = new Car("晋A" + random.nextInt(9999),"别克商务舱GL8","别克");
                break;
            case 2 :
                motoVehicle = new Car("晋A" + random.nextInt(9999),"宝马500i","宝马");
                break;
            case 3 :
                motoVehicle = new Car("晋A" + random.nextInt(9999),"别克林荫大道","别克");
                break;

        }

        motoVehicleList.add(motoVehicle);

        System.out.println("添加成功: " + motoVehicle);

    }

    //添加客车方法
    public static void rentalBus(int days){

        System.out.print("请输入你需要的最大载客人数 :");

        int seatCount = scanner.nextInt();

        MotoVehicle bus = new Bus("晋D" + random.nextInt(9999), seatCount,"晋中客运系统");

        motoVehicleList.add(bus);

        System.out.println("添加成功: " + bus);
    }

    //添加卡车方法
    public static void addTruck(int days){

        MotoVehicle motoVehicle = null;

        System.out.print("请输入要租赁的卡车吨位: ");

        int tonnage = scanner.nextInt();

        motoVehicle = new Truck("晋G" + random.nextInt(9999),tonnage,"解放牌大卡车");

        motoVehicleList.add(motoVehicle);

        System.out.println("添加成功: " + motoVehicle);

    }

}
