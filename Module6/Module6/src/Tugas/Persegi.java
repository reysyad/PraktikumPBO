package Tugas;

public class Persegi extends BangunDatar{
    double sisi;
    public void hitungLuas(){
        luas = sisi*sisi;
        System.out.println("Luas persegi: " + luas);
    }
    public void hitungKeliling(){
        keliling = 4*sisi;
        System.out.println("Keliling persegi: " + keliling);
    }
}
