package regular;

import java.util.Calendar;
import java.util.regex.Pattern;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 15:47
 * @description:
 */
public class Regular {

    public static void main(String[] args) {

        //正则验证
        boolean matches = Pattern.matches(".*panda.*", "i am panda ");

        System.out.println(matches);

        Calendar instance = Calendar.getInstance();

    }

}
