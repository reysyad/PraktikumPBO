package Tugas;

public class BankMain {
    public static void main(String[] args) {
        // Membuat 10 objek CustomerData menggunakan constructor yang berbeda
        CustomerData customer1 = new CustomerData("yohan", "Alamat1", "01-01-1990", "Pekerjaan1", 50000.0);
        CustomerData customer2 = new CustomerData("margono", "Alamat2", "02-02-1991", "Pekerjaan2", 60000.0);
        CustomerData customer3 = new CustomerData("vina", "Alamat2", "02-02-1991", "Pekerjaan3", 750000.0);
        CustomerData customer4 = new CustomerData("zaki", "Alamat7", "02-02-1991", "Pekerjaan4", 90000.0);
        CustomerData customer5 = new CustomerData("jadug", "Alamat2", "02-02-1991", "Pekerjaan2", 60000.0);
        CustomerData customer6 = new CustomerData("rafa", "Alamat2", "02-02-1991", "Pekerjaan2", 60000.0);
        CustomerData customer7 = new CustomerData("tomi", "Alamat2", "02-02-1991", "Pekerjaan2", 60000.0);
        CustomerData customer8 = new CustomerData("cina", "Alamat2", "02-02-1991", "Pekerjaan2", 60000.0);
        CustomerData customer9 = new CustomerData("yaya", "Alamat2", "02-02-1991", "Pekerjaan2", 60000.0);
         CustomerData customer10 = new CustomerData("lulu", "Alamat2", "02-02-1991", "Pekerjaan2", 60000.0);
        Calculatable[] calculatables = new Calculatable[5];
        calculatables[0] = new Bank();
        calculatables[1] = new BankPribadi();
        calculatables[2] = new BankUmum();
        calculatables[3] = new BankPasar();
        calculatables[4] = new BankSyariah();

        // Menampilkan hasil calculateRasioBunga dari masing-masing object
        for (Calculatable calculatable : calculatables) {
            System.out.println("Rasio Bunga: " + calculatable.calculateRasioBunga());
        }
        customer1.info();
        for (Calculatable calculatable : calculatables) {
            if (calculatable instanceof Bank) {
                Bank bank = (Bank) calculatable;
                double bungaGaji = bank.hitungBungaGaji(customer1);
                System.out.println("Bunga Gaji di " + bank.getClass().getSimpleName() + ": " + bungaGaji);
            }
        } 
        
        customer2.info();
        for (Calculatable calculatable : calculatables) {
            if (calculatable instanceof Bank) {
                Bank bank = (Bank) calculatable;
                double bungaGaji = bank.hitungBungaGaji(customer2);
                System.out.println("Bunga Gaji di " + bank.getClass().getSimpleName() + ": " + bungaGaji);
            }
        }
        
        customer3.info();
         for (Calculatable calculatable : calculatables) {
            if (calculatable instanceof Bank) {
                Bank bank = (Bank) calculatable;
                double bungaGaji = bank.hitungBungaGaji(customer3);
                System.out.println("Bunga Gaji di " + bank.getClass().getSimpleName() + ": " + bungaGaji);
            }
        } 
        customer4.info();
         for (Calculatable calculatable : calculatables) {
            if (calculatable instanceof Bank) {
                Bank bank = (Bank) calculatable;
                double bungaGaji = bank.hitungBungaGaji(customer4);
                System.out.println("Bunga Gaji di " + bank.getClass().getSimpleName() + ": " + bungaGaji);
            }
        } 
        customer5.info();
         for (Calculatable calculatable : calculatables) {
            if (calculatable instanceof Bank) {
                Bank bank = (Bank) calculatable;
                double bungaGaji = bank.hitungBungaGaji(customer5);
                System.out.println("Bunga Gaji di " + bank.getClass().getSimpleName() + ": " + bungaGaji);
            }
        } 
        customer6.info();
         for (Calculatable calculatable : calculatables) {
            if (calculatable instanceof Bank) {
                Bank bank = (Bank) calculatable;
                double bungaGaji = bank.hitungBungaGaji(customer6);
                System.out.println("Bunga Gaji di " + bank.getClass().getSimpleName() + ": " + bungaGaji);
            }
        } 
        customer7.info();
         for (Calculatable calculatable : calculatables) {
            if (calculatable instanceof Bank) {
                Bank bank = (Bank) calculatable;
                double bungaGaji = bank.hitungBungaGaji(customer7);
                System.out.println("Bunga Gaji di " + bank.getClass().getSimpleName() + ": " + bungaGaji);
            }
        }
        customer8.info();
         for (Calculatable calculatable : calculatables) {
            if (calculatable instanceof Bank) {
                Bank bank = (Bank) calculatable;
                double bungaGaji = bank.hitungBungaGaji(customer8);
                System.out.println("Bunga Gaji di " + bank.getClass().getSimpleName() + ": " + bungaGaji);
            }
        } 
        customer9.info();
         for (Calculatable calculatable : calculatables) {
            if (calculatable instanceof Bank) {
                Bank bank = (Bank) calculatable;
                double bungaGaji = bank.hitungBungaGaji(customer9);
                System.out.println("Bunga Gaji di " + bank.getClass().getSimpleName() + ": " + bungaGaji);
            }
        }
        customer10.info();
         for (Calculatable calculatable : calculatables) {
            if (calculatable instanceof Bank) {
                Bank bank = (Bank) calculatable;
                double bungaGaji = bank.hitungBungaGaji(customer10);
                System.out.println("Bunga Gaji di " + bank.getClass().getSimpleName() + ": " + bungaGaji);
            }
        }   


    }

       
}
