import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so thu nhat: ");
        int firstNumber = sc.nextInt();
        System.out.print("nhap so thu hai: ");
        int secondNumber = sc.nextInt();

        System.out.println("\n -- Kết quả --");
        System.out.printf("Tong 2 bien: %S%n", firstNumber + secondNumber );
        System.out.printf("Hieu 2 bien: %S%n", firstNumber - secondNumber);
        System.out.printf("Tich 2 bien: %S%n", firstNumber * secondNumber);
        System.out.printf("Thuong 2 bien: %S%n", firstNumber / secondNumber);
        System.out.printf("So du cua thuong 2 bien: %S%n", firstNumber % secondNumber);


    }
}
