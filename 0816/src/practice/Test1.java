package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/16
 * @description:
 */
public class Test1 {

    public static void main(String[] args) {

        wai:
        for (int i = 0; i < 10; i++) {

            nei:
            for (int j = 0; j < 10; j++) {
                if(i == 3 && j == 4){
                    break wai;
                }
            }
        }

    }

}


