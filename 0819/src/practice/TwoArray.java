package practice;

import java.util.Arrays;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description:
 */
public class TwoArray {

    public static void main(String[] args) {

        String [] [] twoArrays = new String[20][20];


        for (int i = 0; i < twoArrays.length; i++) {

            Arrays.fill(twoArrays[i],"❤️");

            for (int j = 0; j < twoArrays[i].length; j++) {
                if(i % 2 ==0 && j % 2 ==0){
                    System.out.print("  " + "\t");
                    continue;
                }
                System.out.print(twoArrays[i][j] + "\t");
            }
            System.out.println();
        }


    }

}
