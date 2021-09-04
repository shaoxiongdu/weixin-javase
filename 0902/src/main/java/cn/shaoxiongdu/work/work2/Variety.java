package cn.shaoxiongdu.work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月02日 | 17:53
 * @description:
 */
/**
 * 狗狗品种的内部枚举类
 */
public enum Variety{
    /**
     * 雪纳瑞
     */
    SCHNAUZER("雪纳瑞"),
    /**
     * 拉布拉多
     */
    LABRADOR("拉布拉多"),
    /**
     * 边境牧羊犬
     */
    BORDER_COLLIE("边境牧羊犬"),
    /**
     * 哈士奇
     */
    HUSKY("哈士奇"),
    /**
     * 萨摩耶
     */
    SAMOYED("萨摩耶"),
    /**
     * 泰迪
     */
    TEDDY("泰迪"),
    /**
     * 博美犬
     */
    HIROMI_DOG("博美犬"),
    /**
     * 柯基
     */
    CORGI("柯基"),
    /**
     * 斗牛犬
     */
    BULLDOG("斗牛犬");

    private String name;

    Variety(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}