package Test2;

import java.util.*;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        ArrayList<String> combinedNames = new ArrayList<>();

        combinedNames.addAll(List.of(names1));
        combinedNames.addAll(List.of(names2));

        HashSet<String> set = new HashSet<>(combinedNames);

        String[] finalArray = set.toArray(new String [set.size()]);

        return finalArray;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}