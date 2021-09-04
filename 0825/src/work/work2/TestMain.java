package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月25日 | 16:00
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        circle.show();

        Cylinder cylinder = new Cylinder(3.1, 5.6);
        cylinder.showVolume();


    }

}
