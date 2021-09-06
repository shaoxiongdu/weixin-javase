package morning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月03日 | 9:22
 * @description:
 */
public class Question1 {

    public static void main(String[] args) {

        Random random = new Random();

        //声明
        Collection arraylist = new ArrayList();

        //生成A
        for (int i = 0; i < 6; i++) {
            int randomInt = random.nextInt(33 - 1 + 1) + 1;
            arraylist.add(randomInt);
        }

        //迭代
        Iterator iterator = arraylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
