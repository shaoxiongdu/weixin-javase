package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/18
 * @description: 选择排序 : 每次在未排序序列中找到一个最小值，然后放入已排序的最后，直到遍历完所有的未排序的数
 */
public class selectSort {

    public static void main(String[] args) {

        int [] numbers = {4,5,3,7,3,2,6,8,9,56};

        for (int i = 0; i < numbers.length; i++) {

            //最小值下标
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {

                if( numbers[j] < numbers[min]){
                    int temp = numbers[j];
                    numbers[j] = numbers[min];
                    numbers[min] = temp;
                }
            }

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



    }

}
