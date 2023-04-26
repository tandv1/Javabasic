package BTVN1;

import java.net.IDN;

public class SinhVien {
    static String Lop= "Điện - Điện tử";
    public static void main(String[] args) {
        String name = "Đỗ Văn Tân";
        System.out.println("Họ tên SV: " + name);
        MSV();
        Lop();
    }
    public static void MSV (){
        System.out.println("Mã SV: " + Thontin.ID);
    }
    public static void Lop (){
        System.out.println("Lớp: "+ Lop);
    }
}
