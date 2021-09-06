package work.work3.bean;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 17:02
 * @description:
 */
public enum Select {
    /**
     * 石头
     */
    STONE("石头"),
    /**
     * 剪刀
     */
    SCISSORS("剪刀"),
    /**
     * 布
     */
    CLOTH("布");

    private String name;

    Select(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
