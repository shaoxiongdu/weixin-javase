package question1.test;

import question1.info.ProductDetal;
import question1.info.ProductType;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 14:52
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        //类别
        ProductType mouse = new ProductType(1,"鼠标");

        //详细商品
        ProductDetal luoji = new ProductDetal(1001,"罗技电竞鼠标K300s",mouse.getName(),20,99.99);
        //盘点
        luoji.inventory();

        //详细商品
        ProductDetal leisheng = new ProductDetal(1002,"雷神电竞鼠标w200",mouse.getName(),0,199.99);

        //盘点
        leisheng.inventory();

    }

}
