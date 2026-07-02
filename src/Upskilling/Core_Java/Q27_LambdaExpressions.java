package Upskilling.Core_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q27_LambdaExpressions {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Charlie", "alice", "Bob"));
        Collections.sort(names, (first, second) -> first.compareToIgnoreCase(second));
        System.out.println(names);
    }
}
