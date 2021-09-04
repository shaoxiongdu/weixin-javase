package morning;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 9:09
 * @description: 咖啡
 */
public class Coffee extends Beverage{

    //配料
    private String burden;

    public Coffee(String name, int capacity) {
        super(name, capacity);
    }

    /**
     * 重写添加配料方法
     */
    public void addIngredients() {
        System.out.println("请问是否要配料(1.加糖 2.加奶 3.不加) : ");
        switch (new Scanner(System.in).nextInt()){
            case 1 :
                setBurden("加糖");
                break;
            case 2 :
                setBurden("加奶");
                break;
            case 3 :
                setBurden("不加");
                break;
        }
    }

    @Override
    public void printOrder() {
        super.printOrder();
        System.out.println("配料:" + burden);
    }

    public String getBurden() {
        return burden;
    }

    public void setBurden(String burden) {
        this.burden = burden;
    }
}
