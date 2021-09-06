package work.work3.bean;

import java.util.Random;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 17:30
 * @description:
 */
public class AIPlayer extends Player{

    /**
     *  电脑玩家随机选择
     */
    @Override
    public void doSelect() {
        Random random = new Random(System.currentTimeMillis());
        super.setSelect(Select.values()[random.nextInt(3)]);
        System.out.println("电脑玩家【" + name + "】已做出选择!");
    }

    /**
     * 构造函数
     * @param name 玩家姓名
     */
    public AIPlayer(String name) {
        super(name);
    }





}
