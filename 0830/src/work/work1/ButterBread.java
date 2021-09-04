package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 15:52
 * @description: 奶油面包
 */
public class ButterBread extends Bread{
    @Override
    public void prepare() {
        System.out.println("奶油面包准备过程......");
    }

    @Override
    public void bake() {
        System.out.println("奶油面包烘焙过程......");
    }

    @Override
    public void box() {
        System.out.println("奶油打包准备过程......");
    }
}
