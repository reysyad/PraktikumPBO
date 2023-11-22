package module8;

public class Kucing extends Pet {
    @Override
    public String perilaku() {
        return "Hewan yang suka bermain";
    }

    public void meong() {
        System.out.println("Meeooww... Meeooww");
    }

    public String makanan() {
        return "Menyukai Ikan";
    }
}

