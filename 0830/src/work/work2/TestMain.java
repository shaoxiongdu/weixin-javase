package work.work2;

import java.util.Random;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 16:08
 * @description:
 * 根据交通信号灯颜色决定汽车停车、行驶和慢行
 * 提示：使用枚举实现
 */
public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        //信号灯枚举数组
        Blinker[] values = Blinker.values();

        //随机对象
        Random random = new Random();

        while (true){

            //取随机值
            int randomInt = random.nextInt(values.length);

            //输出随机信号灯
            System.out.println(values[randomInt]);

            //延时1s
            Thread.sleep(1000);
        }

    }

}
