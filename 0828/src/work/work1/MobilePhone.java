package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:15
 * @description: 原始手机
 */
public class MobilePhone {

    /**
     * 型号
     */
    private String model;

    /**
     * 品牌
     */
    private String brand;


    public MobilePhone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    /**
     * 发送短信
     */
    public void seedMessage(){
        System.out.println("发送文字信息~~~");
    }

    /**
     * 通电话
     */
    public void call(){
        System.out.println("开始语音通话~~~");
    }

    @Override
    public String toString() {
        return "这是一台型号为" + model + "的" + brand + "手机";
    }
}
