package entity;

public class Persegi {
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = (sisi>=0)? sisi : 0;
    }

    public double hitungLuas(){
        double sisi = this.sisi;
        return sisi* sisi;
    }
}
