public class tamgiac {
    int a, b, c;

    boolean latamgiac() {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;
        } else {
            return false;
        }
    }

    boolean tamgiaccan() {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if (((a == b)&&(a!=c)) || ((a == c)&&(a!=b)) || ((b == c))&&(b!=a)) {
                return true;
            } else {
                return false;
            }
        } return false;
    }

    boolean tamgiacdeu() {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if ((a == b) && (a == c) && (b == c)) {
                return true;
            } else {
                return false;
            }
        } return false;
    }

    boolean tamgiacvuong() {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            if ((a*a+b*b == c*c) || (a*a+c*c == b*b) && (b*b+c*c == a*a)) {
                return true;
            } else {
                return false;
            }
        } return false;
    }
}

