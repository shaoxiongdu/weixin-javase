package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        Student zhangsan = new Student();

        zhangsan.setAge(18);
        zhangsan.setName("张三");
        zhangsan.setClassName("维信Java1105");
        zhangsan.addHobby("抽烟");
        zhangsan.addHobby("喝酒");
        zhangsan.addHobby("烫头");
        zhangsan.addHobby("敲代码");

        System.out.println(zhangsan);

        Teacher teacher = new Teacher();
        teacher.setTeachingAge(5);
        teacher.setName("王老师");
        teacher.setSpecialty("计算机");
        teacher.setDirection("使用Java语言理解程序逻辑");
        System.out.println(teacher);


    }

}
