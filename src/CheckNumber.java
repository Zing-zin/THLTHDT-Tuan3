import java.util.Scanner;

 public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("So bạn nhap la duong.");
        } else if (number < 0) {
            System.out.println("So ban nhap la am.");
        } else {
            System.out.println("So ban nhap bang 0.");
        }
    }
}
