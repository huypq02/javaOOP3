package vn.edu.cybersoft;

import vn.edu.cybersoft.exercise1.HocSinh;
import vn.edu.cybersoft.exercise2.XeHoi;
import vn.edu.cybersoft.exercise3.TroChoi;
import vn.edu.cybersoft.exercise4.PhuongTienGiaoThong;
import vn.edu.cybersoft.exercise4.XeMay;
import vn.edu.cybersoft.exercise5.DieuHoa;
import vn.edu.cybersoft.exercise5.MaySay;
import vn.edu.cybersoft.exercise5.ThietBiDien;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{

            // bai 1 hoc sinh
            HocSinh hs = new HocSinh();
            hs.nhap();
            hs.validator();
            hs.print();
            System.out.println("---------------------------------------");

            // bai 2 xe hoi
            XeHoi xe = new XeHoi();
            xe.nhap();
            xe.validator();
            xe.xuat();
            System.out.println("---------------------------------------");

            // bai 3 tro choi
            TroChoi tc = new TroChoi();
            tc.start();
            tc.validator();
            tc.end();
            System.out.println("---------------------------------------");

            // bai 4 phuong tien giao thong
            PhuongTienGiaoThong pt = new PhuongTienGiaoThong();
            pt.nhap();
            pt.validator();
            pt.display();

            vn.edu.cybersoft.exercise4.XeHoi xeHoi = new vn.edu.cybersoft.exercise4.XeHoi();
            xeHoi.nhap();
            xeHoi.validator();
            xeHoi.display();

            XeMay xeMay = new XeMay();
            xeMay.nhap();
            xeMay.validator();
            xeMay.display();
            System.out.println("---------------------------------------");


            // bai 5 he thong dieu hoa va may say
            DieuHoa dh = new DieuHoa();
            dh.henGioTat();
            if (dh.kiemTraHenGio()) {
                System.out.println("Dieu hoa da tat");
            } else {
                System.out.println("Dieu hoa dang bat");
            }

            MaySay ms = new MaySay();
            ms.nhapCheDo();
            ms.say();

        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                System.out.println("Loi nhap lieu");
            } else {
                System.out.println("Loi khong xac dinh");
            }
        }
    }
}