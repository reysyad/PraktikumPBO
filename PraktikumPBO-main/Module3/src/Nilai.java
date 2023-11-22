/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reynz
 */
public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;

    public Nilai(int nilaiUTS, int nilaiUAS, int nilaiTugas) {
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiTugas = nilaiTugas;
    }

    public int hitungNilaiTotal() {
        int nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas) / 3;
        return nilaiTotal;
    }

    public static void main(String[] args) {
        
        Nilai nilai1 = new Nilai(100, 95, 90);
        Nilai nilai2 = new Nilai(70, 90, 80);

        int nilaiTotal1 = nilai1.hitungNilaiTotal();
        int nilaiTotal2 = nilai2.hitungNilaiTotal();

        System.out.println("Nilai Total Nilai 1 : " + nilaiTotal1);
        System.out.println("Nilai Total Nilai 2 :A " + nilaiTotal2);
    }
}
