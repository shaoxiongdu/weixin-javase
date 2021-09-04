package practice.Innerclass;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 9:34
 * @description: 成员内部类
 *
 *  内部类
 *
 */
public class Inner {

    public static void main(String[] args) {

        Out out = new Out();

        //访问成员内部类
        Out.Inner inner = out.new Inner();

        System.out.println(inner.getInnerName());

    }

}

class Out{

    private String outName = "outNameValue";

    private void outMethod(){
        System.out.println("Out.outMethod run ~");

        Inner inner = new Inner();
        inner.innerMethod();

    }

    // 成员内部类
    class Inner{

        public Inner() {
        }

        public Inner(String innerName) {
            this.innerName = innerName;
        }

        //成员内部类成员变量
        private String innerName = "InnerNameValue";

        //成员内部类成员方法
        private void innerMethod(){
            System.out.println("Inner.innerMethod run ~");
        }

        public String getInnerName() {
            return innerName;
        }
    }

}

