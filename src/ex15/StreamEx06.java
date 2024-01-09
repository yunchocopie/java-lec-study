package ex15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StreamEx06 {
    public static void main(String[] args) {
        try {
            //BufferedReader br = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study\\src\\ex15\\hello.txt"));
            BufferedReader br = new BufferedReader(new FileReader("src\\ex15\\hello.txt"));

            String line = br.readLine();
            System.out.println(line);

            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
            bw.write("안녕");
            bw.write("반가워\n");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
