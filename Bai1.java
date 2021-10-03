package Tuan3;

import java.io.FileWriter;
import java.util.Scanner;
public class Bai1 implements Thread {
    Scanner sc = new Scanner(System.in);
    static int x;
    public void run(){
        System.out.println("Nhập số:");
        x = sc.nextInt();
    }
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("D:\\File.txt");
            fw.write(x);
            fw.close();
        }catch(Exception e){
            System.err.println(e);
        }
        Bai1 b1= new Bai1();
        Thread t1= new Thread(b1);
        b1.start();
        System.out.println("Done!!");
    }
}

