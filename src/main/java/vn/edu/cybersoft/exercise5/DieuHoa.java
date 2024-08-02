package vn.edu.cybersoft.exercise5;

public class DieuHoa extends ThietBiDien {
    private double nhietDo;
    private double doAm;
    private double henGio;

    public DieuHoa(String ten, double gia, int soLuong, double congSuat, double dienAp, double nhietDo, double doAm, double henGio) {
        super(ten, gia, soLuong, congSuat, dienAp);
        this.nhietDo = nhietDo;
        this.doAm = doAm;
        this.henGio = henGio;
    }


}
