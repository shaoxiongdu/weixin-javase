package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:24
 * @description:
 */
public class I9100 extends MobilePhone implements Onlineable,Videoable,Cameraable{
    @Override
    public void camera() {
        System.out.println("咔嚓，拍照成功！");
    }

    @Override
    public void online() {
        System.out.println("开启移动网络!");
    }

    @Override
    public void playVideo() {
        System.out.println("播放视频《小时代》");
    }

    @Override
    public void seedMessage() {
        System.out.println("发送带有图片与文字的信息!");
    }

    public I9100(String model, String brand) {
        super(model, brand);
    }
}
