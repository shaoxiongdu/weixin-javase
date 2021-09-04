import com.apifan.common.random.source.PersonInfoSource;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月03日 | 8:39
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        PersonInfoSource instance = PersonInfoSource.getInstance();

        System.out.println(instance.randomChineseNickName(6));

    }

}
