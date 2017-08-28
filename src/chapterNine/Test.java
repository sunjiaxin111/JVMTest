package chapterNine;

import java.io.FileInputStream;
import java.io.InputStream;

public class Test {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("E:/JVMTest/out/production/JVMTest/chapterNine/TestClass.class");
            byte[] b = new byte[is.available()];
            is.read(b);
            is.close();
            System.out.println(JavaClassExecuter.execute(b));
        } catch (Exception e) {

        }
    }
}
