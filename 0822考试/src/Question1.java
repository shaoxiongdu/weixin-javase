import java.util.Arrays;
import java.util.List;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description:
 *
 * 1.请根据英文单词的第一个字母判断星期几，如果第一个字母是一样的，则继续判断第二个字母。
 * 例如如果第一个字母是S,则继续判断第二个字母，如果第二个字母是a,则输出“星期六”。
 * 星期的英文单词如下表所示。
 * 星期一	星期二	星期三	星期四	星期五	星期六	星期日
 * Monday	Tuesday	Wednesday	Thursday	Fridy	Saturday	Sunday
 *
 */
public class Question1 {

    public static void main(String[] args) {

        String keyWord = "T";


        switch(keyWord.charAt(0)){

            case 'M':System.out.println("Monday");break;
            case 'W':System.out.println("Wednesday");break;
            case 'F':System.out.println("Fridy");break;
            case 'T':
                if (keyWord.charAt(1) =='u') {
                    System.out.println("Tuesday");
                }else {
                    System.out.println("Thursday");
                }
               break;
            case 'S':

                if (keyWord.charAt(1) =='a') {
                    System.out.println("Saturday");
                }else {
                    System.out.println("Sunday");
                }
                break;
        }

    }

}
