package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 15:58
 * @description:
 */
public class Cylinder extends Circle{

    /**
     * 高度
     */
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * 体积
     * @return
     */
    public double getVolume(){
        return this.height * super.getArea();
    }

    public void showVolume(){
        System.out.println("\n圆柱体的体积" + getVolume());
    }
}
