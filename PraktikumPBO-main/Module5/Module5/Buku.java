package Module5;
public class Buku {
   private String judulBuku, namaPengarang;
   private int tahunTerbit;
   private double hargaJual;

    public Buku(){
        System.out.println("\nInformasi Buku: ");
    }
    public Buku(String judulBuku, String namaPengarang){
        this.judulBuku = judulBuku;
        this.namaPengarang = namaPengarang;
    }
    public Buku(String judulBuku, String namaPengarang, int tahunTerbit){
        this.judulBuku = judulBuku;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = tahunTerbit;
    }
    public Buku(String judulBuku, String namaPengarang, int tahunTerbit, double hargaJual){
        this.judulBuku = judulBuku;
        this.namaPengarang = namaPengarang;
        this.tahunTerbit = tahunTerbit;
        this.hargaJual = hargaJual;
    }
    public void infoBuku(){
        System.out.println("Judul: " + judulBuku + "\nPengarang: " + namaPengarang + "\nTahun Terbit: " + tahunTerbit + "\nHarga Jual: " + hargaJual + "Rb");   
    }
    public static void main(String[] args){
        Buku buku1 = new Buku("Akutansi Pengantar", "Supardi", 2009, 50.000);
        Buku buku2 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005, 30.000);
        Buku buku3 = new Buku("Bumi Manusia","Pramoedya Ananta Toer", 1980, 70.000);
        Buku buku4 = new Buku("Sang Pemimpi", "Andrea Hirata", 2006,80.000);
        Buku buku5 = new Buku("Rumah Kaca", "Pramoedya Ananta Toer", 1988,85.000);
        Buku buku6 = new Buku("Dear Nathan", "Erisca Febriani", 2016,65.000);
        Buku buku7 = new Buku("Senyum Karyamin", "Ahmad Tohari", 1989,45.000);
        Buku buku8 = new Buku("Saksi Mata", "Seno Gumira Ajidarma", 1994,80.000);
        Buku buku9 = new Buku("Teh dan Pengkhianatan", "Iksana Banu", 2019, 100.000);
        Buku buku10 = new Buku("Burung-burung Manyar", "Y.B Mangunwijaya", 1981,45.000);
        Buku hai1 = new Buku();
        buku1.infoBuku();
        Buku hai2 = new Buku();
        buku2.infoBuku();
        Buku hai3 = new Buku();
        buku3.infoBuku();
        Buku hai4 = new Buku();
        buku4.infoBuku();
        Buku hai5 = new Buku();
        buku5.infoBuku();
        Buku hai6 = new Buku();
        buku6.infoBuku();
        Buku hai7 = new Buku();
        buku7.infoBuku();
        Buku hai8 = new Buku();
        buku8.infoBuku();
        Buku hai9 = new Buku();
        buku9.infoBuku();
        Buku hai10 = new Buku();
        buku10.infoBuku();

    }
}
