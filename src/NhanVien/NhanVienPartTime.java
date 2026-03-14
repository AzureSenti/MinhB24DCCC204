package NhanVien;

import java.util.Scanner;

public class NhanVienPartTime extends NhanVien {
    private int soGioLam;
    private double luongMoiGio;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giờ làm: ");
        soGioLam = sc.nextInt();
        System.out.print("Nhập lương mỗi giờ: ");
        luongMoiGio = sc.nextDouble();
    }

    @Override
    public double tinhLuong() {
        return soGioLam * luongMoiGio;
    }
}