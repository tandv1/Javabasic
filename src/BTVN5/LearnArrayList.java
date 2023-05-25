package BTVN5;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        System.out.println(list);
        for (i = 0; i <= 50; i++)
            if (i % 2 == 0) {
                list.add(i);
                System.out.println("Dãy số chẵn: " + i);
            }
        ArrayList<String> nhanVien = new ArrayList<>();
        nhanVien.add("Đỗ Văn Tân");
        nhanVien.add("Hanoi");
        nhanVien.add("MĐC");
        System.out.println("Thông tin NV");
        for (int j = 0; j < nhanVien.size(); j++) {
            System.out.println(nhanVien.get(j));
        }
    }
}