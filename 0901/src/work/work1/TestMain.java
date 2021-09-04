package work.work1;

import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月01日 | 16:35
 * @description: 测试  无论是否抛出异常 在try括号中的实例都会自动执行close方法
 *
 *      实例对应的类必须实现 closealbe或者AutoCloseable接口
 */
public class TestMain {

    private static final Logger log = LogManager.getLogManager().getLogger("file");


    public static void main(String[] args) {

        try (MyArrayList m = new MyArrayList();){
            //System.out.println("没有异常发生");
            int n = 5 / 0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally语句被执行!");
        }




        System.out.println("main 结束");


    }

}
