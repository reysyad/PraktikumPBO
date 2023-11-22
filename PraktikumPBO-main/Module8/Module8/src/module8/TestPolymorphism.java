package module8;

public class TestPolymorphism {
    public static void main(String[] args) {
        Pet kucing = new Kucing();
        kucing.beriNama("TOM");
        System.out.println(kucing.panggilNama());
        System.out.println(((Kucing) kucing).makanan());
        Kucing meow = new Kucing();
        meow.meong();
        System.out.println(kucing.perilaku());
        

        Pet anjing = new Anjing();
        anjing.beriNama("BULL");
        System.out.println(anjing.panggilNama());
        System.out.println(((Anjing) anjing).makanan());
        Anjing guk = new Anjing();
        guk.gonggong();
        System.out.println(anjing.perilaku());
    }
    
}
