import java.util.Scanner;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập số c: ");
        double c = scanner.nextDouble();

        // Tìm số nhỏ nhất
        double min = Math.min(Math.min(a, b), c);

        System.out.println("Số nhỏ nhất trong ba số là: " + min);

        scanner.close();
    }
}

