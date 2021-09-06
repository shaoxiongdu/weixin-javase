package work.work3.bean;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 17:28
 * @description: 玩家类
 */
public abstract class Player {

    /**
     * 玩家的选择
     */
    Select select;

    /**
     * 玩家姓名
     */
    String name;

    /**
     * 积分
     */
    int score;

    /**
     * 赢的次数
     */
    int winCount;

    /**
     * 玩的总次数
     */
    int totalCount;

    /**
     * 做选择
     */
    public abstract void doSelect();

    /**
     * 构造方法
     * @param name 玩家姓名
     */
    public Player(String name) {
        this.name = name;
        score = 0;
        winCount = 0;
        totalCount = 0;
        select = null;
    }

    public int getTotalCount() {
        return totalCount;
    }

    /**
     * 记录总局数
     */
    public void incrementTotalCount(){
        totalCount++;
    }

    /**
     * 记录赢数
     */
    public void incrementWinCount(){
        winCount++;
    }

    public Select getSelect() {
        return select;
    }

    public void setSelect(Select select) {
        this.select = select;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return getName() + "\t\t" + getScore() + "\t\t\t" + getWinCount() + "\t\t\t" + getTotalCount() + "\t\t\t" + winRate();
    }

    public String  winRate(){
        return String.format("%.2f%%",(((double) winCount) / totalCount * 100));
    }
}
