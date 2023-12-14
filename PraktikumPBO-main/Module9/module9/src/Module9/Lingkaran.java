package Module9;

public class Lingkaran  extends MethodAbstract{
    private int jariJari;

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public int luas() {
        return (int) (Math.PI * jariJari * jariJari);
    }

    @Override
    public int keliling() {
        return (int) (2 * Math.PI * jariJari);
    }

}
