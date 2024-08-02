package vn.edu.cybersoft.exercise5;

public class ThietBiDien {
    private String ten;
    private double gia;
    private int soLuong;
    private double congSuat;
    private double dienAp;
    private double chucNang;

    public ThietBiDien() {
    }

    public ThietBiDien(String ten, double gia, int soLuong, double congSuat, double dienAp) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.congSuat = congSuat;
        this.dienAp = dienAp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    public double getDienAp() {
        return dienAp;
    }

    public void setDienAp(double dienAp) {
        this.dienAp = dienAp;
    }

    public double getChucNang() {
        return chucNang;
    }

    public void setChucNang(double chucNang) {
        this.chucNang = chucNang;
    }
}
