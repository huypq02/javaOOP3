package vn.edu.cybersoft.exercise3;

import java.util.Scanner;

public class TroChoi {
    private String tenTroChoi;
    private int soLuotChoi;


    public TroChoi() {
    }

    public TroChoi(String tenTroChoi, int soLuotChoi) {
        this.tenTroChoi = tenTroChoi;
        this.soLuotChoi = soLuotChoi;
    }

    public void validator() {
        if (this.tenTroChoi == null || this.tenTroChoi.isEmpty()) {
            System.out.println("Ten tro choi khong duoc de trong");
        }
        if (this.soLuotChoi <= 0) {
            System.out.println("So luot choi phai lon hon 0");
        }
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten tro choi: ");
        this.tenTroChoi = sc.nextLine();
        System.out.println("Nhap so luot choi: ");
        this.soLuotChoi = sc.nextInt();
    }

    public void end() {
        System.out.println("------------------------");
        System.out.println("Thong tin tro choi");
        System.out.println("Ten tro choi: " + this.tenTroChoi);
        System.out.println("So luot choi: " + this.soLuotChoi);
    }
}
