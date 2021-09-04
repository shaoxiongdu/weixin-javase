package cn.shaoxiongdu.work;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/11
 * @description: 根据天数计算周数和剩余的天数
 */
public class Work1 {

    public static void main(String[] args) {

        //天数
        int days = 46;

        //星期
        int week = days / 7;

        //剩余天数
        int leftDay = days % 7;

        //输出
        System.out.println("第" + week + "周"); //第6周
        System.out.println("剩余" + leftDay + "天"); //剩余4天

    }

}
