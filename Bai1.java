import java.util.Scanner;

public class Bai1 {
    // public static final double PI = 3.141592653;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kin r: ");
        double r = sc.nextDouble();
        double A = Math.PI * Math.sqrt(r);
        System.out.printf("Dien tich hinh tron %.2f" , A  );
    }
}