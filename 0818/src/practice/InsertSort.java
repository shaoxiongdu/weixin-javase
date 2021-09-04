package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/18
 * @description: 插入排序
 *
 *  从未排序的序列中拿出第一个元素，然后放到已排序序列中的合适位置 直到遍历完所有的未排序序列
 *
 */
public class InsertSort {

    public static void main(String[] args) {

        int [] numbers = {7,5,1,34,5,23,7,9,4,23,67,8,23213,11,41,2};

        System.out.println(System.currentTimeMillis() + "ms");

        //分界点
        int i = 1;
        while (i < numbers.length){

            //当前循环的数字
            int current = numbers[i];
            //排好序的最右边
            int j = i -1;

            while (j >= 0){

                if(numbers[j] > current){
                    //如果内循环当前位置不合适 ，当前位置的数后移
                    numbers[j +1] = numbers[j];
                }else {
                    //找到合适的位置 跳出
                    break;
                }
                //继续向前查找
                j--;
            }
            //将当前循环的数字放入合适的位置
            numbers[j + 1] = current;

            //分界点后移
            i++;
        }



        //输出
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println(System.currentTimeMillis() + "ms");


    }

}
