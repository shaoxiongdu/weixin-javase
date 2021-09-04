package work.work1;

import java.awt.*;

/**
 * @作者: 杜少雄 <github.com/shaoxiongdu>
 * @时间: 2021年08月25日 | 11:14
 * @描述: 父类 动物类
 */
public class Animal {

    /**
     * 名字
     */
    private String name;

    /**
     * 颜色
     */
    private Color color;

    /**
     * 品种
     */
    private String variety;

    @Override
    public String toString() {
        return "动物{" +
                "名字='" + name + '\'' +
                ", 颜色=" + ColorConverter.Color2String(color) +
                ", 品种='" + variety + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }
}
