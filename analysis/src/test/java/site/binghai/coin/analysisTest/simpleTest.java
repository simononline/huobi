package site.binghai.coin.analysisTest;

import org.junit.Test;

import static java.lang.Thread.sleep;

/**
 * Created by binghai on 2018/1/9.
 *
 * @ huobi
 */
public class simpleTest {

    @Test
    public void test() throws InterruptedException {
        System.out.print("Progress:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "%");
            Thread.sleep(100);

            for (int j = 0; j <= String.valueOf(i).length(); j++) {
                System.out.print("\b");
            }
        }
        System.out.println();
    }
}
