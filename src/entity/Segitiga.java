package entity;

public class Segitiga  {
    private double alas;
    private double tinggi;

    public void setAlas(double alas) {
        this.alas = (alas >= 0)? alas : 0;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = (tinggi >= 0)? tinggi : 0;
    }

    public double hitungLuas(){
        double alas = this.alas;
        double tinggi = this.tinggi;
        return alas*tinggi * 0.5;
    }
}
