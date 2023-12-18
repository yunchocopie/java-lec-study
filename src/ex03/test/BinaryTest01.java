package ex03.test;

public class BinaryTest01 {
    public static void main(String[] args) {
    // 이진 검색 => 반드시 정렬이 되어있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9(0~8) / 2 = 4
        // 8를 찾는다 하면 인덱스 4 양쪽에서 큰 부분만 남김

        // target = 8

        // 0번지 ~ 8번지 start = 0 end = 8
        // mid = 4 -> arr[4] -> 값 5
        // if(8==5) -> mid 위치에 타깃에 있다.
        // if(8>5) 참

        // 5번지 ~ 8번지 다시 검색 start = 5 (mid+1) end = 8
        // mid = 7 = arr[7] -> 값 8
        // if(8==5) -> mid 위치에 타깃에 있다.
        // if(8>8)

        /////////////////////////////////////////////

        // target = 3

        // 0번지 ~ 8번지 start = 0 end = 8
        // mid = 4 -> arr[4] -> 값 5
        // if(8==5) -> mid 위치에 타깃에 있다.
        // if(8>5) 거짓

        // 0번지 ~ 3번지 다시 검색 start = 0 end = mid-1
        // mid = 7 = arr[7] -> 값 8
        // if(8==5) -> mid 위치에 타깃에 있다.
        // if(8>8)
    }

}
