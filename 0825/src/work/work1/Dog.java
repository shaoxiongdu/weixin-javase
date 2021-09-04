package work.work1;

/**
 * @作者: 杜少雄 <github.com/shaoxiongdu>
 * @时间: 2021年08月25日 | 11:17
 * @描述:
 */
public class Dog extends Animal {

    /**
     * 亲密度
     */
    private int intimacy = 0;

    /**
     * 看家
     */
    public void lookHome(){
        System.out.println("狗狗" + this.getName() + "在看家");
    }

    @Override
    public String toString() {
        return super.toString() + "\t亲密度:" + this.getIntimacy();
    }

    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }
}
