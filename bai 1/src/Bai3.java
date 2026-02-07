import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Nhập c: ");
        int c = sc.nextInt();
        System.out.println("Nhập d: ");
        int d = sc.nextInt();

        int tuSo = a*d + b*c;
        int mauSo = b*d;
        System.out.println("tu so" + tuSo);
        System.out.println("mau so" + mauSo);

       System.out.printf("Tổng hai phân số là %S / %S", tuSo, mauSo);

    }
}
