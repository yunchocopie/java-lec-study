package ex13;

import java.util.LinkedList;

public class LinkedListEx01 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Milk");
        list.add("Bread");
        list.add("Butter");
        list.add(1, "Apple"); // Milk 다음에 Apple
        list.set(2, "Grape"); // Bread -> Grape
        list.remove(3);

        for (String s : list) {
            System.out.print(s + " "); // Milk Apple Grape
        }

    }
}
