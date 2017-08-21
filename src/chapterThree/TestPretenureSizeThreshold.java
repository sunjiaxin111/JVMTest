package chapterThree;

/**
 * VM Args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * -XX:PretenureSizeThreshold=3145728
 * Created by sunjiaxin on 2017/8/5.
 */
public class TestPretenureSizeThreshold {

    private static final int _1MB = 1024 * 1024;

    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[4 * _1MB];  // 直接分配在老年代中
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}
