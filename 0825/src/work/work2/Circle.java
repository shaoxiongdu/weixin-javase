package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 15:49
 * @description: 圆类
 */
public class Circle {

    /**
     * 半径
     */
    private double radius;

    private final double PI = Math.PI;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * 面积
     * @return
     */
    public double getArea(){
        return PI * Math.pow(radius,2);
    }

    /**
     * 周长
     * @return
     */
    public double getPerimeter(){
        return  2 * PI * radius;
    }

    public void show(){
        System.out.print("圆的半径: " + radius + "\t");
        System.out.print("圆的面积: " + getArea() + "\t");
        System.out.print("圆的周长: " + getPerimeter() + "\t");
    }



}
