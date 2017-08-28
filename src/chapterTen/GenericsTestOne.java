package chapterTen;

import java.util.HashMap;
import java.util.Map;

public class GenericsTestOne {

    public static void main(String[] args) throws Exception{
        Map<String, String> map = new HashMap<>();
        map.put("hello", "你好");
        map.put("how are you?", "吃了没?");
        System.out.println(map.get("hello"));
        System.out.println(map.get("how are you?"));
    }
}
