package Tugas;

public class CustomerData {
    private String nama;
    private String alamat;
    private String tanggalLahir;
    private String pekerjaan;
    private double gaji;

    // Overloading constructor
    public CustomerData() {

    }

    public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan, double gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getTanggalLahir(){
        return tanggalLahir;
    }
    public String getPekerjaan(){
        return pekerjaan;
    }
    public double getGaji(){
        return gaji;
    }
    public void info(){
        System.out.println("\nInformasi Customer:");
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Tanggal Lahir: " + getTanggalLahir());
        System.out.println("Pekerjaan: " + getPekerjaan());
        System.out.println("Gaji: " + getGaji());

    }

}

