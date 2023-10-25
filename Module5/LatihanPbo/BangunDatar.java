package LatihanPbo;

public class BangunDatar {
    double panjang;
    double lebar;
    public BangunDatar(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    double hitungLuas(){
        return panjang * lebar;

    }
    double hitungKeliling(){
        return 2 * (panjang + lebar);


    }
    public static void main(String[] args) {
        BangunDatar bangun = new BangunDatar(3.0, 4.0);
        BangunDatar bangun2 = new BangunDatar(1.0, 2.58);
        double luas = bangun.hitungLuas();
        double keliling = bangun.hitungKeliling();
        double luas2 = bangun2.hitungLuas();
        double keliling2 = bangun2.hitungKeliling();
        
        System.out.println("Based on task in OOP\n");
        System.out.println("Wide: " + luas);
        System.out.println("Perimete of flat Shap: " + keliling);
        System.out.println("\nWide: " + luas2);
        System.out.println("Perimete of flat Shap: " + keliling2);
    }
    
}
