package cn.shaoxiongdu.work.work2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月02日 | 16:51
 * @description:
 */
public class TestMain {

    static ArrayList<Dog> dogs = new ArrayList();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("欢迎来到小狗管理系统!!!");

        initDate();

        while (true){

            System.out.println("\n\t1.小狗列表 \n\t2.删除小狗 \n\t3.添加小狗 \n\t4.查找小狗 \n\t5.退出系统 ");

            System.out.print("\n\t请输入您的选择: ");

            int input = scanner.nextInt();

            switch (input){
                case 1: printDogs();break;
                case 2:delete();break;
                case 3:add();break;
                case 4:searchDog();break;
                case 5:System.exit(0);
            }

        }

    }

    private static void searchDog() {
        System.out.print("\n\t请输入要查找的小狗名称: ");
        String name = scanner.next();

        Dog dog = new Dog();
        dog.setName(name);

        boolean find = dogs.contains(dog);
        if(find){
            System.out.println("\n\t*** 存 在 ****");
        }else {
            System.out.println("\n\t*** 不 存 在 ****");
        }

    }

    private static void add() {

        Dog dog = new Dog();
        System.out.print("请输入小狗的名字: ");
        String name = scanner.next();
        dog.setName(name);

        System.out.println("--------------------");
        Variety[] values = Variety.values();

        for (int i = 0; i < values.length; i++) {
            System.out.println("" + (i + 1) + values[i]);
        }
        System.out.println("请选择小狗品种(序号): ");
        int n = scanner.nextInt();
        dog.setVariety(values[n-1]);

        dogs.add(dog);

        System.out.println("\n\t *** 添加成功! ***");

        printDogs();
    }

    public static void delete(){

        System.out.print("请输入要删除的小狗序号:");
        int no = scanner.nextInt();
        dogs.remove(no - 1);
        System.out.println("\n\t***** 删 除 成 功 ! *****");

        printDogs();

    }

    /**
     * 随机生成10条小狗数据
     */
    public static void initDate(){
        System.out.println("\n\t正在随机生成小狗数据...");
        System.out.println("\n\t生成完毕!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            dogs.add(Dog.generateRandomDog());
        }
    }

    /**
     * 打印小狗
     */
    public static void printDogs(){

        System.out.println("\n\t序号\t\t名字\t\t\t\t品种");
        System.out.println("--------------------------------");
        Iterator<Dog> iterator = dogs.iterator();
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println("\t" + (i+1) + "\t" + dogs.get(i));
        }
        System.out.println("---------------------------------");
        System.out.println("\t\t\t\t共计有" + dogs.size() + "条小狗数据!");

    }

}

