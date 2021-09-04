package practice.designpatterns.singleton;

/**
 * @author:杜少雄 <github.com/shaoxiongdu>
 * @date:2021年08月30日 | 11:24
 * @description:饿汉式单例模式
 */
public class HungrySingleton{
    //静态实例对象
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    //访问
    public static HungrySingleton getInstance(){
        return instance;
    }


}
