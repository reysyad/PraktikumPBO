package Module9;

public class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double luasSelimut() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

}
