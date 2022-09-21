package entity;

public class PersegiPanjang {
    private double panjang;
    private double lebar;


    public void setLebar(double lebar) {
        this.lebar = (lebar >= 0)? lebar : 0;
    }

    public void setPanjang(double panjang) {
        this.panjang = (panjang >= 0)? panjang : 0;
    }

    public double hitungLuas(){
        double panjang = this.panjang;
        double lebar = this.lebar;
        return panjang*lebar;
    }
}
