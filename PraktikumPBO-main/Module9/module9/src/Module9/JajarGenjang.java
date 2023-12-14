package Module9;

public class JajarGenjang extends MethodAbstract {
    private int alas;
    private int tinggi;
    private int sisiMiring;

    public JajarGenjang(int alas, int tinggi, int sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public int luas() {
        return alas * tinggi;
    }

    @Override
    public int keliling() {
        return 2 * (alas + sisiMiring);
    }

}
