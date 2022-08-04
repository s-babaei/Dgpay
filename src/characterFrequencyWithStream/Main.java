package characterFrequencyWithStream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// counting character frequency with stream and comparing the character

public class Main {
    public static void main(String[] args) {
        "zxzxssssdfaaaaaa".chars()
                .mapToObj(character -> (char) character).collect(Collectors.toList()).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((one, two) ->
                        two.getValue().equals(one.getValue()) ?
                                two.getKey().compareTo(one.getKey()) :
                                two.getValue().compareTo(one.getValue()))
                .map(characterLongEntry ->
                        Collections.nCopies(characterLongEntry.getValue().intValue(),
                                characterLongEntry.getKey()))
                .flatMap(List::stream)
                .collect(Collectors.toList()).forEach(System.out::print);
    }
}
