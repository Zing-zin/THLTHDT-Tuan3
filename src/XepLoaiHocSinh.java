import java.util.Scanner;

public class XepLoaiHocSinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm trung bình của học sinh: ");
        double diemTrungBinh = scanner.nextDouble();

        if (diemTrungBinh >= 8.0) {
            System.out.println("Học sinh xếp loại Giỏi.");
        } else if (diemTrungBinh >= 6.5) {
            System.out.println("Học sinh xếp loại Khá.");
        } else if (diemTrungBinh >= 5.0) {
            System.out.println("Học sinh xếp loại Trung bình.");
        } else {
            System.out.println("Học sinh xếp loại Yếu.");
        }
    }
}
