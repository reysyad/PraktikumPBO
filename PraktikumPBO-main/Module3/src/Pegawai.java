/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reynz
 */
public class Pegawai {
    String nama;
    int nip;
    double gaji;

    public Pegawai(String nama, int nip, double gaji) {
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji: " + gaji + " Juta");
    }

    public static void main(String[] args) {
       
        Pegawai pegawai1 = new Pegawai("Eko", 32678, 5.000000);
        Pegawai pegawai2 = new Pegawai("Aziz", 67890, 2.500000);
        Pegawai pegawai3 = new Pegawai("Rangga", 250879, 5.500000);
        Pegawai pegawai4 = new Pegawai("Jadog", 45287, 1.800000);
        Pegawai pegawai5 = new Pegawai("Nanda", 34567, 3.000000);

        System.out.println("Informasi Pegawai 1:");
        pegawai1.tampilkanInformasi();

        System.out.println("\nInformasi Pegawai 2:");
        pegawai2.tampilkanInformasi();

        System.out.println("\nInformasi Pegawai 3:");
        pegawai3.tampilkanInformasi();

        System.out.println("\nInformasi Pegawai 4:");
        pegawai4.tampilkanInformasi();

        System.out.println("\nInformasi Pegawai 5:");
        pegawai5.tampilkanInformasi();
    }
}
