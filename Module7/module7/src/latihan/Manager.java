package latihan;

public class Manager extends Karyawan {
    private float jamKerja;

    public float jamKerja() {
        return jamKerja;
    }
    public void setJamKerja(float jamKerja) {
        this.jamKerja = jamKerja;

    }
    public float getGajiManager() {
        return getGaji() * 2;
    }
    
}
