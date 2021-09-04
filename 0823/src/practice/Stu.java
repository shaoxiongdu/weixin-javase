package practice;

import java.util.Arrays;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/23
 * @description:
 */
public class Stu {

    //姓名数组
    private String [] names;

    //当前位置
    private int currentIndex;

    //容量
    private int capacity;


    /**
     * 指定容量
     * @param capacity
     */
    public Stu(int capacity) {
        currentIndex = 0;
        //初始化容量
        this.capacity = capacity;
        //饿汉式
        this.names = new String[capacity];
    }

    /**
     * 默认容量10
     */
    public Stu(){
        this(10);
    }

    public void add(String name){
        //扩容
        if(currentIndex == capacity) {
            resetCapacity();
        }
        names[currentIndex++] = name;
    }

    public void show(){
        System.out.println("学生列表: ");
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(names[i] + "\t");
        }
    }

    /**
     * 从指定区间查找元素
     * @param start 开始位置
     * @param end 结束位置
     * @param name 元素
     * @return 返回该元素的下标  如果不存在 返回-1
     */
    public int find(int start, int end, String name){

        for (int i = start - 1; i < end; i++) {

            if(names[i] == null || i >= currentIndex) return -1;

            if(names[i].equals(name)) return i;

        }

        return -1;
    }

    /**
     * 返回当前元素给个数
     * @return
     */
    public int size(){
        return currentIndex + 1;
    }

    /**
     * 动态扩容
     */
    private void resetCapacity(){

        String[] newNames = Arrays.copyOf(names, capacity << 1);

        capacity = capacity << 1;

        names = newNames;

        System.err.println("\n" + getClass().getSimpleName() + "发生动态扩容: 原长度:" + (capacity >> 1) + "\t 现长度: " + capacity + '\n');

    }


}
