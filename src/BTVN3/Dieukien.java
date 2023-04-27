package BTVN3;

public class Dieukien {
    public static int number = 100;

    static String check(int n) {
        if (n == number) {
            return "Tham số n bằng với số number";
        } else if (n < number) {
            return "Tham số n nhỏ hơn số number";
        } else if (n > number) {
            return "Tham số n lớn hơn số number";
        }
        return "Số n rỗng";
    }

    public static void main(String[] args) {
        String ketqua = check(100);
        System.out.println(ketqua);
    }
}
