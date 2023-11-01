package latihan;

public class KaryawanDemo {
    public static void main(String[] args){
        Manager karyawan1 = new Manager();
        karyawan1.setNama("Luffy");
        karyawan1.setGaji(1000000);
        karyawan1.setUsia(25);
        karyawan1.setJamKerja(21.0f);
        System.out.println(karyawan1.getNama());
        System.out.println("Bergaji: " + karyawan1.getGajiManager());
        System.out.println("Dia Bekerja Selama: " + karyawan1.jamKerja());
        System.out.println("Dia Berussia: " + karyawan1.getUsia() + "\n");
        Manager karyawan2 = new Manager();
        karyawan2.setNama("Marwoto");
        karyawan2.setGaji(5000.000f);
        karyawan2.setUsia(70);
        karyawan2.setJamKerja(50.0f);
        System.out.println(karyawan2.getNama());
        System.out.println("Bergaji: " + karyawan2.getGajiManager());
        System.out.println("Dia Bekerja Selama: " + karyawan2.jamKerja());
        System.out.println("Dia Berussia: " + karyawan2.getUsia() + "\n");
    }
}
