import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều cao: ");
        float weight = sc.nextFloat();
        System.out.print("Cân nặng: ");
        float height = sc.nextFloat();
        float BMI = weight / (height * height);
        System.out.printf("BMI = %.2f " , BMI);
    }
}
