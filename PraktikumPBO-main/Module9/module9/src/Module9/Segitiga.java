package Module9;

public class Segitiga extends MethodAbstract {
    private int alas;
    private int tinggi;
    private int sisi1;
    private int sisi2;
    private int sisi3;

    public Segitiga(int alas, int tinggi, int sisi1, int sisi2, int sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public int luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public int keliling() {
        return sisi1 + sisi2 + sisi3;
    }

}
