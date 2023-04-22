package BTVN2;

import java.sql.SQLOutput;
public class Calculator {
    static int sum(int num1, int num2) {
        return num1 + num2;
    }
    static float tich(float num3, float num4) {
        return num3 * num4;
    }
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;
        int x = sum(num1, num2);
        float num3 = 2.5F;
        float num4 = 3.9F;
        float y = num3 * num4;
        System.out.println("Tổng 2 số bằng: " + x);
        System.out.println("Tích 2 số bằng: " + y);
    }
}
