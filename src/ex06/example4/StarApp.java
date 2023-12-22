package ex06.example4;

public class StarApp {
    public static void gameStart(Zealot u1, Zealot u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, Dark u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Dragoon u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Zealot u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, River u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Dark u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, River u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Zealot u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Dragoon u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Dark u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, Zealot u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, Dragoon u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, River u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, Dark u2) { // 오버로딩
        u1.attack();
        u2.attack();
    }



    // Protoss
    public static void gameStart(Protoss u1, Protoss u2) { // 오버로딩
        u1.attack();
        u2.attack();
        System.out.println();
    }


    public static void main(String[] args) {
        Protoss z1 = new Zealot("z1"); // [Zealot, Protoss] 힙에 뜸
        Protoss d1 = new Dragoon("d1"); // [Dragoon, Protoss] 힙에 뜸
        Protoss r1 = new River("r1"); // [River, Protoss] 힙에 뜸
        Protoss dark1 = new Dark("dark1"); // [Dark, Protoss] 힙에 뜸


        gameStart(z1, d1); // 프로토스 유닛 -> 프로토스 유닛 때림
        gameStart(d1, z1);

    }

}