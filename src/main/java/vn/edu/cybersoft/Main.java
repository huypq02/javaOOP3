package vn.edu.cybersoft;

import vn.edu.cybersoft.exercise1.HocSinh;
import vn.edu.cybersoft.exercise2.XeHoi;
import vn.edu.cybersoft.exercise3.TroChoi;
import vn.edu.cybersoft.exercise4.PhuongTienGiaoThong;
import vn.edu.cybersoft.exercise5.ThietBiDien;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        try{

            // bai 1 hoc sinh
            HocSinh hs = new HocSinh();
            hs.nhap();
            hs.validator();
            hs.print();

            // bai 2 xe hoi
            XeHoi xe = new XeHoi();
            xe.nhap();
            xe.validator();
            xe.xuat();


            // bai 3 tro choi
            TroChoi tc = new TroChoi();
            tc.start();
            tc.validator();
            tc.end();

            // bai 4 phuong tien giao thong
            PhuongTienGiaoThong pt = new PhuongTienGiaoThong();
            pt.nhap();
            pt.validator();
            pt.display();



            // bai 5 he thong dieu hoa va may say
            ThietBiDien tbd = new ThietBiDien();

        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.println("Loi nhap lieu");
            } else {
                System.out.println("Loi khong xac dinh");
            }
        }
    }
}