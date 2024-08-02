package vn.edu.cybersoft.exercise4;

import java.util.Scanner;

public class PhuongTienGiaoThong {
    private String hangSanXuat;
    public String mauSac;
    public int namSanXuat;

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(String hangSanXuat, String mauSac, int namSanXuat) {
        this.hangSanXuat = hangSanXuat;
        this.mauSac = mauSac;
        this.namSanXuat = namSanXuat;
    }

    public void validator() {
        if (this.hangSanXuat == null || this.hangSanXuat.isEmpty()) {
            System.out.println("Hang san xuat khong duoc de trong");
            return;
        }
        if (this.mauSac == null || this.mauSac.isEmpty()) {
            System.out.println("Mau sac khong duoc de trong");
            return;
        }
        if (this.namSanXuat <= 0) {
            System.out.println("Nam san xuat phai lon hon 0");
            return;
        }
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang san xuat: ");
        this.hangSanXuat = sc.nextLine();
        System.out.println("Nhap mau sac: ");
        this.mauSac = sc.nextLine();
        System.out.println("Nhap nam san xuat: ");
        this.namSanXuat = sc.nextInt();
    }

    public void display() {
        System.out.println("Hang san xuat: " + this.hangSanXuat);
        System.out.println("Mau sac: " + this.mauSac);
        System.out.println("Nam san xuat: " + this.namSanXuat);
    }
}
