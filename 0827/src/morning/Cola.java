package morning;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 9:15
 * @description: 可乐
 */
public class Cola extends Beverage{

    //配料
    private String burden;

    public Cola(String name, int capacity) {
        super(name, capacity);
    }

    /**
     * 重写添加配料方法
     */
    public void addIngredients() {
        System.out.print("请问是否添加配料: (1.加糖 2.不加)");
        switch (new Scanner(System.in).nextInt()){
            case 1 :
                setBurden("加糖");
                break;
            case 2 :
                setBurden("不加");
                break;
        }
    }

    public String getBurden() {
        return burden;
    }

    @Override
    public void printOrder() {
        //调用父类的输出名字 容量
        super.printOrder();
        System.out.println("配料:" + burden);
    }

    public void setBurden(String burden) {
        this.burden = burden;
    }
}
