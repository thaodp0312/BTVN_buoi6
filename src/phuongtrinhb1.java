public class phuongtrinhb1 {
        void ptbac1(double a, double b){
        if ((a==0)&&(b==0)){
            System.out.println("Phương trình có vô số nghiệm");
        }else  if ((a==0)&&(b!=0)){
            System.out.println("Phương trình vô nghiệm");

        }else if (a!=0){
            System.out.println("Phương trình có 1 nghiệm x= "+(b*(-1)/a));
        }
    }
}
