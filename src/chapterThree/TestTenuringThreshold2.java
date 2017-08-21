package chapterThree;

/**
 * VM Args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 * -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 * Created by sunjiaxin on 2017/8/6.
 */
public class TestTenuringThreshold2 {

    private static final int _1MB = 1024 * 1024;

    public static void testTenuringThreshold2() {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[_1MB / 4];
        // allocation1+allocation2大于survivor空间一半
//        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testTenuringThreshold2();
    }
}
