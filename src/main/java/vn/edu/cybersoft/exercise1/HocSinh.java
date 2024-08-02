package vn.edu.cybersoft.exercise1;

import vn.edu.cybersoft.pkg.utils;

import java.util.Scanner;

public class HocSinh {
    private String ten;
    private int tuoi;
    private double toan;
    private double ly;
    private double hoa;

    public HocSinh(){
    }

    public HocSinh(String ten, int tuoi, double toan, double ly, double hoa){
        this.ten = ten;
        this.tuoi = tuoi;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public void validator() {
        if (this.ten == null || this.ten.isEmpty()) {
            System.out.println("Ten khong duoc de trong");
        }
        if (!utils.isPositiveNumber(this.tuoi)) {
            System.out.println("Tuoi phai lon hon 0");
        }
        if (!utils.isPoint(this.toan)) {
            System.out.println("Diem toan phai lon hon 0");
        }
        if (!utils.isPoint(this.hoa)) {
            System.out.println("Diem toan phai lon hon 0");
        }
        if (!utils.isPoint(this.ly)) {
            System.out.println("Diem toan phai lon hon 0");
        }
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        this.tuoi = sc.nextInt();
        System.out.println("Nhap diem toan: ");
        this.toan = sc.nextDouble();
        System.out.println("Nhap diem ly: ");
        this.ly = sc.nextDouble();
        System.out.println("Nhap diem hoa: ");
        this.hoa = sc.nextDouble();
    }

    public void print(){
        System.out.println("Ten: " + this.ten);
        System.out.println("Tuoi: " + this.tuoi);
        System.out.println("Diem trung binh: " + this.diemTb());
    }

    public double diemTb(){
        return (this.toan
                + this.ly
                + this.hoa) / 3;
    }
}
