package Programming;

public class Unit2_04 {
    public static void main(String[] args) {
        System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t", "P","Q","AND","OR","XOR");
        System.out.println();

        boolean case1P = true;
        boolean case1Q = true;
        System.out.println(case1P + "\t" + case1Q + "\t" + (case1P&&case1Q) + "\t" + (case1P||case1Q) + "\t" + (case1P^case1Q));

        boolean case2P = true;
        boolean case2Q = false;
        System.out.println(case2P + "\t" + case2Q + "\t" + (case2P&&case2Q) + "\t" + (case2P||case2Q) + "\t" + (case2P^case2Q));

        boolean case3P = false;
        boolean case3Q = true;
        System.out.println(case3P + "\t" + case3Q + "\t" + (case3P&&case3Q) + "\t" + (case3P||case3Q) + "\t" + (case3P^case3Q));

        boolean case4P = false;
        boolean case4Q = false;
        System.out.println(case4P + "\t" + case4Q + "\t" + (case4P&&case1Q) + "\t" + (case4P||case4Q) + "\t" + (case4P^case4Q));


    }
}
