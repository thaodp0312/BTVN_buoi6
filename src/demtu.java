public class demtu {
int sotu(String st){
    int d=0;
    st = st.replaceAll("\\s+"," ");
    for (int i = 0;i<st.length();i++){
        if(Character.toString(st.charAt(i)).equals(" ")){
            d++;
        }
    }
    return d=d+1;
}
}
