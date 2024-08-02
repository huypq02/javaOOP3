package vn.edu.cybersoft.exercise4;

import java.util.Scanner;

public class XeMay extends PhuongTienGiaoThong{
    public String phanKhoi;

    public XeMay(){
    }

    public XeMay(String hangSanXuat, String mauSac, int namSanXuat, String phanKhoi){
        super(hangSanXuat, mauSac, namSanXuat);
        this.phanKhoi = phanKhoi;
    }

    @Override
    public void validator() {
        super.validator();
        if (this.phanKhoi == null || this.phanKhoi.isEmpty()) {
            System.out.println("Phan khoi khong duoc de trong");
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan khoi: ");
        this.phanKhoi = sc.nextLine();
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Phan khoi: " + this.phanKhoi);
    }
}
