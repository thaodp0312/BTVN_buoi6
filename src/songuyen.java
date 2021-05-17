public class songuyen {
    void checksonguyen(double x) {
        int y = (int) x;
        if ((x - y) != 0) {
            System.out.println(x + " không phải là số nguyên");
        } else if (x < 0) {
            System.out.println((int)x + " là số nguyên âm");
        } else if (x > 0) {
            System.out.println((int)x + " là số nguyên dương");
        } else {
            System.out.println((int)x + " là số nguyên");
        }
    }
}