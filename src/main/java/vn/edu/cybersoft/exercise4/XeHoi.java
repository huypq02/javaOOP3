package vn.edu.cybersoft.exercise4;

import java.util.Scanner;

public class XeHoi extends PhuongTienGiaoThong {
    private String soChoNgoi;

    public XeHoi() {
    }

    public XeHoi(String hangXe, String mauXe, int namSanXuat, String soChoNgoi) {
        super(hangXe, mauXe, namSanXuat);
        this.soChoNgoi = soChoNgoi;
    }

    @Override
    public void validator() {
        super.validator();
        if (this.soChoNgoi == null || this.soChoNgoi.isEmpty()) {
            System.out.println("So cho ngoi khong duoc de trong");
        }
    }

    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so cho ngoi: ");
        this.soChoNgoi = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("So cho ngoi: " + this.soChoNgoi);
    }
}
