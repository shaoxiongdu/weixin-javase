package test;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月03日 | 14:43
 * @description:
 */
public class Something{
    public static void main(String[] args){
        final Other o=new Other();
        new Something().addOne(o);//1
    }
    public void addOne( Other o){
        o.i++;//2
        o =  new Other();//3
    }
}
class Other{
    public int i;
}