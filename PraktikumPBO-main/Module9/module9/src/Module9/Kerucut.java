package Module9;

public class Kerucut extends BangunRuang {
    private double jariJariAlas;
    private double tinggi;

    public Kerucut(double jariJariAlas, double tinggi) {
        this.jariJariAlas = jariJariAlas;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJariAlas, 2) * tinggi;
    }

    @Override
    public double luasSelimut() {
        return Math.PI * jariJariAlas * Math.sqrt(Math.pow(jariJariAlas, 2) + Math.pow(tinggi, 2));
    }

}
