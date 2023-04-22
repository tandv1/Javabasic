package BTVN1;

import java.net.IDN;

public class SinhVien {
    static int ID=3645221;
    static String Lop= "Điện - Điện tử";
    public static void main(String[] args) {

        String name = "Đỗ Văn Tân";
        System.out.println("Họ tên SV: " + name);
        MSV();
        Lop();
    }
    public static void MSV (){
        System.out.println("Mã SV: " + ID);
    }
    public static void Lop (){
        System.out.println("Lớp: "+ Lop);
    }
}
