package work.work1;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 14:58
 * @description:
 */
public class Question1 {

    public static void main(String[] args) {

        System.out.print("请输入一串数字: "); // 输入： 2367846325673426753426783546783546

        String string = new Scanner(System.in).next();

        //通过指定字符串构造缓冲区
        StringBuffer stringBuffer = new StringBuffer(string);
        //从后往前遍历 步长为3
        for (int i = stringBuffer.length() - 3;i >= 0; i-=3){
            stringBuffer.insert(i,',');
        }
        System.out.println(stringBuffer); //输出:  2,367,846,325,673,426,753,426,783,546,783,546

    }

}
