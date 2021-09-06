package practice;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 19:37
 * @description:
 */
public class StringBufferTestMain {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("my name is zhang san");
        System.out.println(stringBuffer.length()); //20
        System.out.println(stringBuffer.capacity());//20 + 16
/*

        stringBuffer.reverse();
        System.out.println(stringBuffer); //nas gnahz si eman ym
*/

        //追加  后方
        stringBuffer.append(1);
        System.out.println(stringBuffer);

        stringBuffer.delete(2,7);
        System.out.println(stringBuffer); //my is zhang san1

        stringBuffer.replace(0,2,"h");
        System.out.println(stringBuffer);

        int i = stringBuffer.indexOf("sa");
        System.out.println(i);

    }

}
