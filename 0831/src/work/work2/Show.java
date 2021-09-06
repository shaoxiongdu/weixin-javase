package work.work2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 16:40
 * @description:
 */
public class Show {

    private static List<Goods> goodsList = new ArrayList<>();

    public static void show(){

        System.out.println("************ 欢 迎 进 入 商 品 批 发 城 *****************");
        System.out.println("\t\t编号\t\t商品\t\t\t价格");
        for (int i = 0; i < goodsList.size(); i++) {
            System.out.println(goodsList.get(i).getId() + goodsList.get(i).getName() + Utils.change(goodsList.get(i).getPrice()));
        }
        System.out.println("******************************************************");

    }

    /**
     * 通过id获取产品价格
     * @param id 产品ID
     * @return 价格
     */
    public static double getPriceById(int id){
        return goodsList.get( (id - 1) ).getPrice();
    }

    static {

        goodsList.add(new Goods(1,"电风扇",124.23));
        goodsList.add(new Goods(2,"洗衣机",4500.0));
        goodsList.add(new Goods(3,"电视机",8800.9));
        goodsList.add(new Goods(4,"冰  箱",5000.88));
        goodsList.add(new Goods(5,"空  调",4456.0));

    }

}
