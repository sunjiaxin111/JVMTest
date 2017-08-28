package chapterTen;

public class TestThree {

    public static void main(String[] args) {
        if (true) {
            System.out.println("block 1");
        } else {
            System.out.println("block 2");
        }
    }

    /*public static void main(String[] args) {
        // 编译器会提示 "Unreachable code"
        while (false) {
            System.out.println("");
        }
    }*/
}
