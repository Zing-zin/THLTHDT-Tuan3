import java.util.Scanner;

public class checktamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập độ dài cạnh thứ nhất: ");
        double a = scanner.nextDouble();

        System.out.println("Nhập độ dài cạnh thứ hai: ");
        double b = scanner.nextDouble();

        System.out.println("Nhập độ dài cạnh thứ ba: ");
        double c = scanner.nextDouble();

        if (isTriangle(a, b, c)) {
            String triangleType = classifyTriangle(a, b, c);
            System.out.println("Ba cạnh này tạo thành một tam giác " + triangleType);
        } else {
            System.out.println("Ba cạnh này không tạo thành tam giác.");
        }
    }

    // Kiểm tra xem ba cạnh có tạo thành tam giác hay không
    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Xác định loại tam giác
    public static String classifyTriangle(double a, double b, double c) {
        if (a == b && b == c) {
            return "đều";
        } else if (a == b || b == c || a == c) {
            return "cân";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "vuông";
        } else {
            return "thường";
        }
    }
}

