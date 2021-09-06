package cn.shaoxiongdu.work.work1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月02日 | 16:51
 * @description:
 */
public class TestMain {

    //结束标志
    static boolean isStop = false;

    public static void main(String[] args) {


        MyThread myThread = new MyThread();
        myThread.start();

        Collection<Dog> dogCollection = new ArrayList();

        while (!isStop){

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            dogCollection.add(Dog.generateRandomDog());

            System.out.println("***** 正 在 随 机 生 成 第 " + dogCollection.size() + "个 小 狗 数 据 ******");
        }

        System.out.println("-------------- 数 据 生 成 完 成 !!! --------------------");

        System.out.println("共计有" + dogCollection.size() + "条小狗!");

        System.out.println("\n\t分别是: ");

        System.out.println("\n\t名字\t\t\t\t品种");
        Iterator<Dog> iterator = dogCollection.iterator();
        while (iterator.hasNext()){
            System.out.println("----------------------------");
            System.out.println(iterator.next());

        }

    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            try {
                int i = new Random().nextInt(5000);
                sleep(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isStop = true;
        }
    }
}

