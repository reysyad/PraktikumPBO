package Tugas;

public class PersegiPanjang extends BangunDatar{
    int panjang;
    double lebar;
    public void hitungLuas(){
        luas = panjang*lebar;
        System.out.println("Luas persegi panjang: " + luas);
    }
    public void hitungKeliling(){
        keliling = 2*panjang;
        System.out.println("Keliling persegi panjang: " + keliling);
    }
}
