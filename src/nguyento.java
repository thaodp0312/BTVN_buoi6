public class nguyento {
    boolean checknguyento(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }

        }
        return true;
    }
}
