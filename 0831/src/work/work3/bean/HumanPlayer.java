package work.work3.bean;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 17:38
 * @description: 人类玩家 继承 抽象玩家类
 */
public class HumanPlayer extends Player{

    /**
     * 构造方法
     *
     * @param name 玩家姓名
     */
    public HumanPlayer(String name) {
        super(name);

    }

    /**
     * 人类玩家  从控制台输入
     */
    @Override
    public void doSelect() {

        final Select[] selects = Select.values();

        for (int i = 0; i < selects.length; i++) {
            System.out.print(i + ". " + selects[i] + "\t");
        }

        System.out.print("\n请输入您的选择:");

        //用户选择
        int userSelect = new Scanner(System.in).nextInt();
        super.setSelect(selects[userSelect]);

        System.out.println("人类玩家【" + name + "】已做出选择!");

    }
}
