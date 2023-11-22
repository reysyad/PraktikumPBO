package Tugas;

public class BangunMain {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        persegi.hitungLuas();
        persegi.hitungKeliling();
        PersegiPanjang pang = new PersegiPanjang();
        pang.panjang = 5;
        pang.lebar = 2;
        pang.hitungLuas();
        pang.hitungKeliling();
        SegiTigaSamaKaki segitiga = new SegiTigaSamaKaki();
        segitiga.alas = 10;
        segitiga.sisiMiring = 8;
        segitiga.hitungLuas();
        segitiga.hitungKeliling();
        SegiTigaSamaSisi pan = new SegiTigaSamaSisi();
        pan.alas = 10;
        pan.hitungLuas();
        pan.hitungKeliling();

    
    }
}
