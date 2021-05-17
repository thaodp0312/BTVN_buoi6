public class tongsonguyen {
    int tong = 0;
    int tongchusonguyen(String str){
for (int i=0;i<str.length();i++){
    String t = Character.toString(str.charAt(i));
    int x = Integer.parseInt(t);
    tong = tong + x;
} return tong;
    }

}
