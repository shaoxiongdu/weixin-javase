package work.work4;

import java.util.ArrayList;

import java.util.Random;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 17:02
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        //蛇类cassiopeia对象
        Snake cassiopeia  = new Snake("卡西奥佩娅",5.0,10);

        //移动
        cassiopeia.move();
        //攻击
        cassiopeia.attack();
        //加血
        cassiopeia.addHp();

        //蜈蚣类 scanner对象
        Centipede scanner = new Centipede("斯卡纳",30,20);

        scanner.attack();
        scanner.move();

    }

}

