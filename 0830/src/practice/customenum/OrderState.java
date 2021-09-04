package practice.customenum;

import java.util.StringJoiner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 15:19
 * @description: 订单状态的枚举类
 */
public enum OrderState {

    /**
     * 已下单
     */
    PLACE_AN_ORDER("已下单","用户已经完成付款"),

    /**
     * 已配货
     */
    DISTRIBUTION("已配货","商家已经完成配货"),

    /**
     * 已发货
     */
    SHIP("已发货","商家已经发货"),

    /**
     * 已签收
     */
    SIGN_FOR("已签收","客户已经签收"),

    /**
     * 待评价
     */
    BE_EVALUATED("待评价","等待客户完成评价"),

    /**
     * 已完成
     */
    COMPLETE("已完成","订单已完成");

    /**
     * 订单状态
     */
    private String state;

    /**
     * 订单描述
     */
    private String description;

    OrderState(String state, String description) {
        this.state = state;
        this.description = description;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", OrderState.class.getSimpleName() + "[", "]")
                .add("订单状态='" + state + "'")
                .add("描述='" + description + "'")
                .toString();
    }
}
