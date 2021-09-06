package practice.date;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 20:30
 * @description: Date
 */
public class DateTestMain {

    public static void main(String[] args) throws ParseException {

        /*
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        System.out.println(sdf.format(date));

        String stringDate = "1069-08-30 21:31:23";

        Date parse = sdf.parse(stringDate);
        System.out.println(sdf.format(parse));
        */

        LocalDateTime now = LocalDateTime.now();

        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);//2021年8月31日 上午11时02分27秒
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM); //2021-8-31 11:06:14
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); //21-8-31 上午11:06

        System.out.println(dateTimeFormatter.format(now));

    }

}
