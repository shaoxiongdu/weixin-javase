package question3;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:31
 * @description:
 */
public class Test {

    public static void main(String[] args) {


        //披萨工厂
        PizzaFactory pizzaFactory = new PizzaFactory();

        System.out.println("亲选择要制作的披萨(1.培根披萨 2.海鲜披萨):");

        Pizza pizza = null;

        switch (new Scanner(System.in).nextInt()){
            case 1 :
                //调用披萨工程创建对象
                pizza = pizzaFactory.getPizza(1);
                break;
            case 2:
                //调用披萨工程创建对象
                pizza = pizzaFactory.getPizza(2);
                break;
        }

        //展示
        pizza.show();

    }

}
