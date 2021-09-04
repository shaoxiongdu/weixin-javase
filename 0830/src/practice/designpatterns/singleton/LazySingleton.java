package practice.designpatterns.singleton;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 10:47
 * @description: 懒汉式单例模式
 */
public class LazySingleton{

    //静态实例对象
    private static LazySingleton instance = null;

    //访问
    public static LazySingleton getInstance() {

        //如果没有创建好 则创建
        if (instance == null) {
            Lock lock = new ReentrantLock();
            //加锁
            lock.lock();
            if (instance == null) {
                instance = new LazySingleton();
            }
            //释放锁
            lock.unlock();
        }
        return instance;
    }

    //私有化构造方法
    private LazySingleton(){}


    /**
     * 测试多线程环境下懒汉式的数据安全问题
     */
    @Test
    void multithreaded(){

        //通过set的不可重复验证
        Set set = new HashSet();

        for (int i = 0; i < 10000; i++) {

            //创建线程
            Thread thread = new Thread(){
                @Override
                public void run() {

                    //获取懒汉式的实例
                    LazySingleton lazySingleton = LazySingleton.getInstance();

                    set.add(lazySingleton);

                    if(set.size() > 1){
                        System.out.println("多个实例被创建 懒汉式 线程不安全");
                        System.exit(-1);
                    }
                }
            };
            //启动线程
            thread.start();
        }

        System.out.println("单一实例对象 懒汉式 线程安全");

        System.out.println(set.size()); //结果为3 说明线程不安全

    }


}