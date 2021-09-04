package practice.Innerclass;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 9:57
 * @description: 静态内部类
 */
public class StaticInner {

    public static void main(String[] args) {

        //创建静态内部类对象
        OutClass.StaticInnerClass staticInnerClass = new OutClass.StaticInnerClass();

        System.out.println(staticInnerClass.getName());

    }

}

class OutClass{

    private static String name = "OutClassValue";
    private  String name1 = "OutClassValue";

    static class StaticInnerClass{

        public StaticInnerClass(String name) {
            this.name = name;
        }

        public StaticInnerClass() {
        }

        private String name = "StaticInnerClassValue";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
