package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月26日 | 17:32
 * @description:
 */
public class StrengthenTestMain {

    public static void main(String[] args) {

                int days=5; //租赁天数

                //客户租用的多辆汽车信息及租用天数
                MotoVehicle[] motos = new MotoVehicle[4];
                motos[0] = new Car("京NY28588","宝马550i");
                motos[1] = new Car("京NNN3284","宝马550i");
                motos[2] = new Car("京NT43765","别克林荫大道");
                motos[3] = new Bus("京5643765","金龙",34);
                //2、计算总租赁费用
                double totalRent = CalculateRent.compute(motos, days);

                // 输出客户姓名和总租赁费用
                System.out.println("汽车牌号"+"\t\t"+"汽车品牌");
                for(int i=0;i<motos.length;i++){
                    if(i<3){
                        Car c = (Car) motos[i];
                        System.out.println(c.getNo()+"\t"+c.getType());
                    }else{
                        System.out.println(motos[i].getNo()+"\t"+motos[i].getBrand());
                    }
                }

                System.out.println("租赁天数："+ days+"天，租赁费用："+totalRent+"元。");
    }




}
