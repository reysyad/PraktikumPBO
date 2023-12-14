package Module9;

public class PrismaSegitiga extends BangunRuang {
    private double alas;
    private double tinggiSegitiga;
    private double tinggiPrisma;

    public PrismaSegitiga(double alas, double tinggiSegitiga, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiSegitiga = tinggiSegitiga;
        this.tinggiPrisma = tinggiPrisma;
    }

    @Override
    public double volume() {
        return (1.0 / 2.0) * alas * tinggiSegitiga * tinggiPrisma;
    }

    @Override
    public double luasSelimut() {
        return alas * tinggiPrisma + 3 * alas * tinggiSegitiga;
    }

}
