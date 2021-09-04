package practice;

/**
 * @author: 杜少雄 <https://www.github.com/shaoxiongdu>
 * @date: 2021年09月01日 | 11:13
 * @description:
 */
public class ExceptionTestMain {

    public static void main(String[] args) {

        method();

        System.out.println("主方法~!");

    }

    public static void method(){

        try {
            int n = 3 / 0;
        }catch (Exception e){
            System.err.println(e.getMessage());
            return;
        }finally {
            System.out.println("finally继续执行");
        }

    }

}
