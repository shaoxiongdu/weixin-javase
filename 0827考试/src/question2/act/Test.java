package question2.act;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:06
 * @description:
 */
public class Test {

    public static void main(String[] args) {

        Person zhouxinchi = new Actor("周新驰",48,'男',"无线电视艺员训练班","大话西游");

        zhouxinchi.saySelf();

        System.out.println("=====================================");

        Person subintian = new Athlete("苏炳添",31,'男',"100米田径运动员",9.83);

        subintian.saySelf();

    }

}
