package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 16:43
 * @description:
 */
public class Utils {

    //私有化构造器
    private Utils() {}

    public static String change(double price){

        String string = String.valueOf(price);

        //通过指定字符串构造缓冲区
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer.insert(0,"￥");
        //从后往前遍历 步长为3
        for (int i = stringBuffer.indexOf(".") - 3;i > 1; i-=3){
            stringBuffer.insert(i,',');
        }
        return stringBuffer.toString();
    }

}
