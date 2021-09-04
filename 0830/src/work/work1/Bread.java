package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 15:50
 * @description:
 *
 * 编写面包类，包含三个方法
 * 	prepare()准备
 * 	bake()烘烤
 * 	box打包
 * 三个子产品：鸡蛋面包，奶油面包，鸡腿面包
 * 面包工厂类：负责生产各种面包
 * 使用简单工厂实现
 *
 */
public abstract class Bread {

    /**
     * 准备
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public abstract void bake();

    /**
     * 打包
     */
    public abstract void box();

}
