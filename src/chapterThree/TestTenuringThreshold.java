package chapterThree;

/**
 * VM Args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 * Created by sunjiaxin on 2017/8/5.
 */
public class TestTenuringThreshold {

    private static final int _1MB = 1024 * 1024;

    public static void testTenuringThreshold() {
        byte[] allocation1,allocation2,allocation3;
        allocation1 = new byte[_1MB / 4];
        // 什么时候进入老年代取决于XX:MaxTenuringThreshold设置
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testTenuringThreshold();
    }
}
