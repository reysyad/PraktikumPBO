package module8;

public class Anjing extends Pet {
    @Override
    public String perilaku() {
        return "Hewan yang setia";
    }

    public void gonggong() {
        System.out.println("Guk..Guk..Guk..");
    }

    public String makanan() {
        return "Menyukai Daging dan Tulang";
    }
}
