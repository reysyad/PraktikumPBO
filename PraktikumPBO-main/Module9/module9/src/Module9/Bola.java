package Module9;

public class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    @Override
    public double luasSelimut() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

}
