package NhanVien;
import java.util.Scanner;

public abstract class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double luongCoBan;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = sc.nextDouble();
    }

    public void hienThiThongTin() {
        System.out.printf("Mã: %-8s | Họ tên: %-20s | Lương: %,10.2f VNĐ", maNV, hoTen, tinhLuong());
    }

    public abstract double tinhLuong();
}