package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 15:55
 * @description: 面包枚举类
 */
public enum BreadEnum {

    CHICKEN_BREAD("鸡腿面包"),
    EGG_BREAD("鸡蛋面包"),
    BUTTER_BREAD("奶油面包");
    //名字
    private String name;
    //有参构造
    private BreadEnum(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
