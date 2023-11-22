package module8;

public class Pet {
    private String nama;

    public void beriNama(String beriNama) {
        this.nama = beriNama;
    }
    
    public String panggilNama() {
        return this.nama;
    }
    public String perilaku(){
        return "Hewan Penurut";
    }

}
