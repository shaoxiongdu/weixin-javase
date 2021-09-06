package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 15:55
 * @description: 面包工厂
 */
public class BreadFactory {

    /**
     * 根据类型获取面包
     * @param breadType 面包枚举类
     * @return 创建好的面包
     */
    public static Bread makeBread(BreadEnum breadType){

        //面包
        Bread bread = null;

        switch (breadType){
                //鸡腿面包
            case CHICKEN_BREAD :
                bread = new ChickenDrumstickBread();
                break;
                //奶油面包
            case BUTTER_BREAD:
                bread = new ButterBread();
                break;
                //鸡蛋面包
            case EGG_BREAD :
                bread = new EggBread();
                break;
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //准备
        bread.prepare();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //烘焙
        bread.bake();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //打包
        bread.box();

        return bread;
    }

}
