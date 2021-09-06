package morning;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 9:06
 * @description:
 */
public class Question1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个字符串: ");
        String inputs = scanner.next();
        System.out.print("输入要查找的字符: ");
        String word = scanner.next();
        int count = counter1(inputs,word);
        System.out.println(inputs + "中包含" + count + "个" + word);
    }

    /**
     * 使用字符数组循环判断
     * @param inputs 主字符串
     * @param word 子字符串
     * @return 个数
     */
    public static int counter(String inputs, String word){
        char[] chars = inputs.toCharArray();
        int count = 0;
        for(char c : chars){
            if(c == word.charAt(0)){
                count++;
            }
        }
        return count;
    }

    //偷懒做法
    public static int counter1(String inputs, String word){
        //使用子字符串截取主字符串
        String[] split = inputs.split(word);
        //返回长度-1
        return split.length - 1;
    }

}
