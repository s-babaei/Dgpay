package ListOfCharacterToMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        list.add('s');
        list.add('a');
        list.add('r');
        list.add('a');
        list.add('a');
        list.add('m');
        list.add('i');
        list.add('r');
        list.add('r');
        list.add('e');
        list.add('z');
        list.add('a');
        Map<Character, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);



        Map<Character,Integer> map = new HashMap<>();
        map.put('a',5);
        map.put('b',2);
        map.put('c',4);
        map.put('a',9);


    }
}
