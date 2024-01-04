package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);

        List<Integer> arr2 = Arrays.asList(1, 2); // 1, 2 포함한 리스트 생성

        // 실습 //
        // ArrayList 생성 (문자열 타입)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 저장
        list.add("Milk");
        list.add("Bread");
        list.add("Butter");

        // 위치를 지정하여 데이터 저장
        list.add(1, "Apple"); // Milk 다음으로 Apple이 들어감

        // 특정 위치에 있는 원소 바꾸기
        list.set(2, "Grape"); // Bread -> Grape

        // 데이터 삭제
        list.remove(3); // 인덱스 3의 원소 삭제 - Butter 삭제

        // 저장된 객체 가져오는 메소드
        String s = list.get(1); // 인덱스 1의 원소 반환
        System.out.println(s);
        //list.get(5); // out of bounds

        // 특정 값이 리스트에 포함되어 있는지 확인
        if (list.contains("Apple")) {
            System.out.println("Apple이 리스트에서 발견되었습니다.");
        }

    }
}