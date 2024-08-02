package vn.edu.cybersoft.exercise5;

import java.util.Scanner;

public class MaySay extends ThietBiDien {
    private int cheDo;
    private double dungTich;

    public MaySay(String ten, double gia, int soLuong, double congSuat, double dienAp, int cheDo, double dungTich) {
        super(ten, gia, soLuong, congSuat, dienAp);
        this.cheDo = cheDo;
        this.dungTich = dungTich;
    }

    public MaySay() {
    }

    public void nhapCheDo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon che do may say: ");
        System.out.println("1. Say kho");
        System.out.println("2. Say nong");
        int cheDo = sc.nextInt();
        switch (cheDo) {
            case 1, 2:
                this.cheDo = cheDo;
                break;
            default:
                System.out.println("Chon sai che do");
        }
    }

    public void say() {
        switch (this.cheDo) {
            case 1:
                System.out.println("May say dang say kho");
                break;
            case 2:
                System.out.println("May say dang say nong");
                break;
        }
    }

    public int getCheDo() {
        return cheDo;
    }

    public void setCheDo(int cheDo) {
        this.cheDo = cheDo;
    }

    public double getDungTich() {
        return dungTich;
    }

    public void setDungTich(double dungTich) {
        this.dungTich = dungTich;
    }
}
