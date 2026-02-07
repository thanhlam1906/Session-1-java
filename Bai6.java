import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vận tốc: ");
        float velocity = sc.nextFloat();
        System.out.print("Thời gian: "); 
        float time = sc.nextFloat();
        float s = velocity * time;
        System.out.println("s = " + s);
    }
}
