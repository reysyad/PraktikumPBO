package Tugas;

public class SegiTigaSamaKaki extends SegiTiga {
    double sisiMiring;
   public void hitungLuas(){
    luas = 0.5*alas*sisiMiring;
    System.out.println("Luas segitiga Sama kaki:" + luas);
   }
   public void hitungKeliling(){
    keliling = 2 *sisiMiring + alas;
    System.out.println("Keliling segitiga Sama Kaki:" + keliling);
   }
}
