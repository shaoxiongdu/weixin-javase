package cn.shaoxiongdu;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description:
 */
public class User implements Comparable{
    
    private String name;
    
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    /**
     * 实现Comparable接口的比较方法 （年龄为依据）
     * @param o
     * @return 返回调用者和参数的年龄差值 
     */
    @Override
    public int compareTo(Object o) {
        //参数不是User类 则直接返回
        if(!(o instanceof User)) return 0;
        User user = (User) o;
        return this.age - user.age;
    }

    @Override
    public String toString() {
        return "年龄: " + age + "\t\t姓名: " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

  
}
