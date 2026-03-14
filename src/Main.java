import NhanVien.NhanVien;
import NhanVien.NhanVienFullTime;
import NhanVien.NhanVienPartTime;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên muốn thêm: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nChọn loại nhân viên (1: FullTime, 2: PartTime): ");
            int chon = sc.nextInt();
            NhanVien nv;

            if (chon == 1) {
                nv = new NhanVienFullTime();
            } else {
                nv = new NhanVienPartTime();
            }

            nv.nhapThongTin();
            dsNhanVien.add(nv);
        }

        System.out.println("\n--- DANH SÁCH NHÂN VIÊN VÀ LƯƠNG ---");
        for (NhanVien nv : dsNhanVien) {
            nv.hienThiThongTin();
            System.out.println();
        }
    }
}