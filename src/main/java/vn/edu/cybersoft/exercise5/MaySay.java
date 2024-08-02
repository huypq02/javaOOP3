package vn.edu.cybersoft.exercise5;

public class MaySay extends ThietBiDien {
    private double cheDo;
    private double dungTich;

    public MaySay(String ten, double gia, int soLuong, double congSuat, double dienAp, double cheDo, double dungTich) {
        super(ten, gia, soLuong, congSuat, dienAp);
        this.cheDo = cheDo;
        this.dungTich = dungTich;
    }
}
