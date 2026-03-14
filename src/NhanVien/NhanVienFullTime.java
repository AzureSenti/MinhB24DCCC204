package NhanVien;

import java.util.Scanner;

public class NhanVienFullTime extends NhanVien {
    private double heSoLuong;

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = new Scanner(System.in).nextDouble();
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
}