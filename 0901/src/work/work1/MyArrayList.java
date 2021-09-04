package work.work1;

import java.util.ArrayList;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月01日 | 16:31
 * @description:
 */
public class MyArrayList extends ArrayList implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("ArrayList的close方法被执行~");
        super.clone();
    }


}
