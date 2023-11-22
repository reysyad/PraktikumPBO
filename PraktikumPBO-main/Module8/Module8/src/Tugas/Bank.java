package Tugas;

public class Bank implements Calculatable{
    public int calculateRasioBunga() {
        return 0;
    }
    public double hitungBungaGaji(CustomerData customer) {
        return customer.getGaji() * calculateRasioBunga() / 100;
    }
}
