package Module9;

public class MainRuang {
    public static void main(String[] args) {
        Balok blk = new Balok(10.0, 11.5, 13.3);
        System.out.println("Method Balok:");
        System.out.println("Volume = " + blk.getVolume());
        System.out.println("Luas Selimut = " + blk.getLuasSelimut()+"\n");

        Bola bla = new Bola(15.0);
        System.out.println("Method Bola:");
        System.out.println("Volume = " + bla.getVolume());
        System.out.println("Luas Selimut = " + bla.getLuasSelimut()+"\n");

        Kerucut krc = new Kerucut(11.0, 20.0);
        System.out.println("Method Kerucut:");
        System.out.println("Volume =" + krc.getVolume());
        System.out.println("Luas Selimut = " + krc.getLuasSelimut()+ "\n");

        PrismaSegitiga prsm = new PrismaSegitiga(12.0, 13.1, 14.0);
        System.out.println("Method Prisma Segitiga:");
        System.out.println("Volume =" + prsm.getVolume());
        System.out.println("Luas Selimut = " + prsm.getLuasSelimut());
    }

}
