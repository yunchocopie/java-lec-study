package ex03;

import java.util.Arrays;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        for (int value : numbers)
            System.out.print(value + " ");

        System.out.println();
        System.out.println(Arrays.toString(numbers));
    }
}
