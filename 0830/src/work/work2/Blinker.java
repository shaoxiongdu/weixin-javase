package work.work2;

import java.awt.*;
import java.util.StringJoiner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 16:08
 * @description: 交通信号灯枚举类
 */
public enum Blinker {

    RED_LIGHT(Color.RED,"红灯","红灯停 !"),
    GREEN_LIGHT(Color.GREEN,"绿灯","绿灯行~"),
    YELLOW_LIGHT(Color.YELLOW,"黄灯","黄灯亮了慢慢走~"),
    ;

    private Color color;

    private String name;

    private String description;

    Blinker(Color color, String name, String description) {
        this.color = color;
        this.name = name;
        this.description = description;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Blinker.class.getSimpleName() + "[", "]")
                .add("信号灯='" + name + "'")
                .add("描述='" + description + "'")
                .add("颜色值=(" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + ")")
                .toString();
    }
}
