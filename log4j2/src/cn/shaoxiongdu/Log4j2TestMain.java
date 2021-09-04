package cn.shaoxiongdu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月02日 | 10:18
 * @description:
 */
public class Log4j2TestMain {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.trace("这是trace");
        logger.debug("这是debug");
        logger.info("这是info");
        logger.warn("这是warn");
        logger.error("这是error");
        logger.fatal("这是fatal");

        try {
            int n = 5 / 0;
        }catch (Exception e){
            logger.error(e);
        }

    }

}
