package abstarct;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 10:29
 * @description:
 */
public class Person {

    private String name;

    public void goHome(Transportation transportation){
        System.out.println(name + "下班，准备回家!");
        transportation.run();
        System.out.println(name + "回到家啦！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}
