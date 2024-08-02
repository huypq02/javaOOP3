package vn.edu.cybersoft.exercise5;

import java.util.Scanner;

public class DieuHoa extends ThietBiDien {
    private double nhietDo;
    private double doAm;
    private double gioTat;

    public DieuHoa(String ten, double gia, int soLuong, double congSuat, double dienAp, double nhietDo, double doAm, double gioTat) {
        super(ten, gia, soLuong, congSuat, dienAp);
        this.nhietDo = nhietDo;
        this.doAm = doAm;
        this.gioTat = gioTat;
    }

    public DieuHoa() {
    }

    public void henGioTat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so gio hen tat: ");
        double soGio = sc.nextDouble();
        if (soGio < 0) {
            System.out.println("So gio khong hop le");
            return;
        }
        this.gioTat = java.time.LocalTime.now().getHour() + soGio;
    }

    public boolean kiemTraHenGio() {
        return java.time.LocalTime.now().getHour() == this.gioTat;
    }

    public double getNhietDo() {
        return nhietDo;
    }

    public void setNhietDo(double nhietDo) {
        this.nhietDo = nhietDo;
    }

    public double getDoAm() {
        return doAm;
    }

    public void setDoAm(double doAm) {
        this.doAm = doAm;
    }
}
