package Module9;

public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double volume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double luasSelimut() {
        return 4 * Math.pow(sisi, 2);
    }

}
