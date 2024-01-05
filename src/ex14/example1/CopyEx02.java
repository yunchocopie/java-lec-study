package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyEx02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        //map
        List<Integer> newList = list.stream().map((i) -> i*100).toList();

        for(Integer i:newList){
            System.out.println(i);
        }

        //forEach
        newList.stream().forEach(i -> System.out.println(i));
    }
}