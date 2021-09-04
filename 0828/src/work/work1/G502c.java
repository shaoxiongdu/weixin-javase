package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:22
 * @description:
 */
public class G502c extends MobilePhone implements Musicable{
    @Override
    public void play() {
        System.out.println("开始播放《热血》......");
    }

    public G502c(String model, String brand) {
        super(model, brand);
    }
}
