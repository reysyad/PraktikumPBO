package Tugas;
import java.lang.Math;

public class SegiTigaSamaSisi extends SegiTiga {
    double sisi;
    public void hitungLuas(){
        tinggi =  (Math.sqrt(1) / 2) * alas;
        luas = 0.5*alas*tinggi;
        System.out.println("Luas segitiga Sama Sisi: " + luas);
    }
    public void hitungKeliling(){
        keliling = 3*alas;
        System.out.println("Keliling segitiga Sama Sisi: " + keliling);
    }
}
