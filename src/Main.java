import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        songaunhien();
        indexchuoi();
        bangcuuchuong bcc = new bangcuuchuong();
        bcc.inbangcuuchuong();
        System.out.println("Hãy nhập 3 cạnh: ");
        System.out.print("a= ");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();

        System.out.print("b= ");
        Scanner sc2 = new Scanner(System.in);
        int y = sc2.nextInt();

        System.out.print("c= ");
        Scanner sc3 = new Scanner(System.in);
        int z = sc3.nextInt();
        checktamgiac(x, y, z);
        System.out.println("Hãy nhập chuỗi cần đếm từ: ");
        Scanner sc4 = new Scanner(System.in);
        String chuoi = sc4.nextLine();
        demtutrongchuoi(chuoi);
        System.out.print("Hãy nhập số nguyên: ");
        Scanner sc5 = new Scanner(System.in);
        String chuoi3 = sc5.nextLine();
        tong(chuoi3);
        System.out.print("Hãy nhập số a = ");
        Scanner sc6 = new Scanner(System.in);
        int chuoi4 = sc6.nextInt();
        System.out.print("Hãy nhập số b = ");
        Scanner sc7 = new Scanner(System.in);
        int chuoi5 = sc7.nextInt();
        giaiptb1(chuoi4,chuoi5);
        System.out.println();
        System.out.print("Hãy nhập số n = ");
        Scanner sc8 = new Scanner(System.in);
        int chuoi6 = sc8.nextInt();
        tongchiahetcho3(chuoi6);
        System.out.print("Hãy nhập số bất kỳ để kiểm tra số nguyên dương hay âm: ");
        Scanner sc9 = new Scanner(System.in);
        double chuoi7 = sc9.nextDouble();
        songuyenamduong(chuoi7);
    }

    static void songaunhien() {
        Random x = new Random();
        nguyento nt = new nguyento();
        giaithua gt = new giaithua();
        int y = x.nextInt(10);
        if (nt.checknguyento(y)) {
            System.out.println("Số ngẫu nhiên: " + y + " là số nguyên tố");
        } else {
            System.out.println("Số ngẫu nhiên " + y + " không phải là số nguyên tố");
        }
        if (y >= 0) {
            System.out.println(y + "! = " + gt.tinhgiaithua(y));
        } else {
            System.out.println("Không thể tính được giai thừa với số âm: " + y);
        }
    }

    static void indexchuoi() {
        String c = "You only live once, but if you do it right, once is enough";
        System.out.println("index của các ký tụ o trong chuỗi " + c + " là: ");
        int d = 0;
        for (int i = 0; i < c.length(); i++) {
            if (Character.toString(c.charAt(i)).equals("o")) {
                System.out.print(i + "\t");
                d++;
            }
        }
        System.out.println();
        System.out.println("Tổng số lần ký tự o xuất hiện là: " + d);
    }

    static void checktamgiac(int x, int y, int z) {
        tamgiac tg = new tamgiac();
        tg.a = x;
        tg.b = y;
        tg.c = z;
        if (tg.tamgiaccan()) {
            System.out.println("Là tam giác cân");
        } else if (tg.tamgiacdeu()) {
            System.out.println("Là tam giác đều");
        } else if (tg.tamgiacvuong()) {
            System.out.println("Là tam giác vuông");
        } else if (tg.latamgiac()) {
            System.out.println("Là tam giác");
        } else {
            System.out.println("Không phải là tam giác");
    }}

    static void demtutrongchuoi(String str) {
        demtu dt = new demtu();
        System.out.println("Số từ trong chuỗi là: " + dt.sotu(str));
    }

    static void tong(String str){
        tongsonguyen t = new tongsonguyen();
        System.out.println("Tổng các chữ số của số: "+ str +" là: "+t.tongchusonguyen(str));
    }
    static void giaiptb1(int a, int b){
        phuongtrinhb1 pt = new phuongtrinhb1();
        pt.ptbac1(a,b);
    }
    static void tongchiahetcho3(int x){
        tongchia3 t = new tongchia3();
        System.out.println("Tổng các số chia hết cho 3 là "+t.tongchiahet3(x));
    }
    static void songuyenamduong(double x){
        songuyen y = new songuyen();
        y.checksonguyen(x);
    }
}


