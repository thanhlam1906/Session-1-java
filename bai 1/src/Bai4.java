import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu dai: ");
        double width = sc.nextDouble();
        System.out.println("Chieu rong: ");
        double height = sc.nextDouble();

        float area = (float) (width * height);
        float perimeter = (float) (width + height);

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

     }
}
