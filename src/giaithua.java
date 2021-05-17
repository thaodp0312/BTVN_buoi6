public class giaithua {
    long gt=1L;
    long tinhgiaithua(int n){
        if (n==0) {
            return 1;
        }
        for (int i=1;i<=n;i++){
            gt=i*gt;
        }
        return gt;
    }

}

