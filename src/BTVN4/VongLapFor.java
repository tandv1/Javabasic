package BTVN4;

import org.w3c.dom.ls.LSOutput;

public class VongLapFor {

    public static void main(String[] args) {
        int ch[] = new int[26];
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                ch[i / 2] = i;
            }
        }
        for (int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }


}