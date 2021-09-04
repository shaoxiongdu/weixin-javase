package question5;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:50
 * @description: 新闻类
 */
public class News implements Comparable{

    /**
     * 编号
     */
    private int id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 点击量
     */
    private int clickCount;

    @Override
    public int compareTo(Object other) {

        //如果参数为Null 或者参数和调用者是同一个对象  直接返回0
        if(other == null | this == other) {
            return 0;
        }

        if(other instanceof News){
            News o = (News)other;
            //根据编号大小判断
            return (this.id == o.id ? 0 : (this.id > o.id ? 1 : -1));
        }
        //如果参数不是News类型 返回0
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getClickCount() {
        return clickCount;
    }

    public void setClickCount(int clickCount) {
        this.clickCount = clickCount;
    }

    @Override
    public String toString() {
        return "新闻{" +
                "新闻编号=" + id +
                ", 标题='" + title + '\'' +
                ", 正文='" + content + '\'' +
                ", 点击量=" + clickCount +
                '}';
    }
}
