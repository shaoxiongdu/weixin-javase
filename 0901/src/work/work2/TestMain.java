package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月01日 | 16:45
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        User user = new User();

        try {
            user.setName("张三");
            user.setSex("男");
            user.setAge(20);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(user);

    }

}
