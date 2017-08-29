package chapterEleven;

/**
 * volatile变量自增运算测试
 */
public class VolatileTest {

    public static volatile int race = 0;

    public static void increase() {
        race++;
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        // 等待所有累加线程都结束
        while(Thread.activeCount() > 1) {
            // 使当前线程从执行状态（运行状态）变为可执行态（就绪状态）。
            Thread.yield();
        }

        System.out.println(race);
    }
}
