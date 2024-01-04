package ex13;

import java.util.HashSet;

public class SetEx01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Milk");
        set.add("Bread");
        set.add("Milk");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set); // Ham 한 번만 출력

        if (set.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음");
        }

        // LinkedHashSet일 경우 : [Milk, Bread, Butter, Cheese, Ham]
        // TreeSet일 경우 : [Bread, Butter, Cheese, Ham, Milk]

    }
}
