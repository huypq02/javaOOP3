package vn.edu.cybersoft.exercise2;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class XeHoi {
    private String hangXe;
    private String mauXe;
    private int namSanXuat;

    public XeHoi() {
    }

    public XeHoi(String hangXe, String mauXe, int namSanXuat) {
        this.hangXe = hangXe;
        this.mauXe = mauXe;
        this.namSanXuat = namSanXuat;
    }

    public void validator() {
        if (this.hangXe == null || this.hangXe.isEmpty()) {
            System.out.println("Hang xe khong duoc de trong");
        }
        if (this.mauXe == null || this.mauXe.isEmpty()) {
            System.out.println("Mau xe khong duoc de trong");
        }
        if (!utils.isPositiveNumber(this.namSanXuat)) {
            System.out.println("Nam san xuat phai lon hon 0");
        }
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang xe: ");
        this.hangXe = sc.nextLine();
        System.out.println("Nhap mau xe: ");
        this.mauXe = sc.nextLine();
        System.out.println("Nhap nam san xuat: ");
        this.namSanXuat = sc.nextInt();
    }

    public void xuat() {
        System.out.println("------------------------");
        System.out.println("Thong tin xe hoi");
        System.out.println("Hang xe: " + this.hangXe);
        System.out.println("Mau xe: " + this.mauXe);
        System.out.println("Nam san xuat: " + this.namSanXuat);
    }
}
