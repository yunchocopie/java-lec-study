package ex03;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // 힙
        list.add("철수"); // 추가
        list.add("영희");
        list.add("순신");
        list.add("지영");

        for (String obj : list)
            System.out.print(obj + " ");

        System.out.println(list.get(3)); // 값 읽는 법

        list.remove(3); // 삭제

        // System.out.println(list.get(3)); 오류 : out of bounds
    }
}
