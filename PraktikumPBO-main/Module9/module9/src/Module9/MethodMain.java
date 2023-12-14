package Module9;

public class MethodMain {
    public static void main(String[] args) {
        PersegiPanjang pnj = new PersegiPanjang(8, 10);
        System.out.println("Method Persegi Panjang: ");
        System.out.println("Keliling = " + pnj.getKell());
        System.out.println("Luas = " + pnj.getLuas() + "\n");

        Segitiga stg = new Segitiga(5, 12, 13, 14, 12);
        System.out.println("Method Segitiga:");
        System.out.println("Keliling = " + stg.getKell());
        System.out.println("Luas = " + stg.getLuas() + "\n");
        
        Lingkaran lkr = new Lingkaran(20);
        System.out.println("Method Langkaran:");
        System.out.println("Keliling = " + lkr.getKell());
        System.out.println("Luas = " + lkr.getLuas() + "\n");

        JajarGenjang jjr = new JajarGenjang(7, 12, 20);
        System.out.println("Method Jajar Genjang:");
        System.out.println("Keliling = " + jjr.getKell());
        System.out.println("Luas = " + jjr.getLuas());

    }

}
