package view;

import entity.Persegi;
import entity.PersegiPanjang;
import entity.Segitiga;

import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);
    Persegi persegi = new Persegi();
    Segitiga segitiga = new Segitiga();
    PersegiPanjang persegiPanjang = new PersegiPanjang();

    public void Menu (){
        System.out.println("Aplikasi Menghitung Luas Bangun Datar");
        System.out.println("===========================================================");
        while (true){
            System.out.println("Masukkan jenis bangun datar :");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Exit");
            System.out.print("Menu : ");
            var menu = input.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.println("Jika alas dan tinggi negatif maka akan dianggap 0");
                    hitungSegitiga();
                }
                case 2 -> {
                    System.out.println("Jika sisi negatif maka akan dianggap 0");
                    hitungPersegi();
                }
                case 3 -> {
                    System.out.println("Jika panjang dan lebar negatif maka akan dianggap 0");
                    hitungPersegiPanjang();
                }
                case 4 -> {
                    System.out.println("Terimakasih :)");
                    return;
                }
                default -> System.out.println("Masukkan menu yang benar");
            }
        }

    }

    private void hitungPersegiPanjang() {
        System.out.print("Masukkan Panjang : ");
        var panjang = input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        var lebar = input.nextDouble();
        persegiPanjang.setPanjang(panjang);
        persegiPanjang.setLebar(lebar);
        System.out.println("Luas = " + persegiPanjang.hitungLuas());

    }

    private void hitungPersegi() {
        System.out.print("Masukkan Sisi : ");
        var sisi = input.nextDouble();
        persegi.setSisi(sisi);
        System.out.println("Luas = " + persegi.hitungLuas());
    }

    private void hitungSegitiga() {
        System.out.print("Masukkan Alas : ");
        var alas = input.nextDouble();
        System.out.print("Masukkan Tinggi : ");
        var tinggi = input.nextDouble();
        segitiga.setAlas(alas);
        segitiga.setTinggi(tinggi);
        System.out.println("Luas = " + segitiga.hitungLuas());
    }
}
