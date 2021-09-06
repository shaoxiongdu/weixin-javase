package datetest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 16:32
 * @description:
 */
public class LocalDateTimeTestMain {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);

        System.out.println(dateTimeFormatter.format(localDateTime));

    }

}
