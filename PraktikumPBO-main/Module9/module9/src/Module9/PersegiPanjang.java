package Module9;

public class PersegiPanjang extends MethodAbstract {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public int luas() {
        return panjang * lebar;
    }

    @Override
    public int keliling() {
        return 2 * (panjang + lebar);
    }

}
