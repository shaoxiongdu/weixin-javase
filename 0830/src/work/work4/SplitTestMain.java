package work.work4;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 17:30
 * @description:
 */
public class SplitTestMain {

    static String songWord = "长亭外 古道边 芳草碧连天 晚风拂柳笛声残 夕阳山外山";

    public static void main(String[] args) {

        System.out.println("原歌词格式");
        System.out.println(songWord);

        System.out.println("拆分后歌词格式: ");
        String[] s = songWord.split(" ");
        for(String word:s){
            System.out.println(word);
        }

    }

}
