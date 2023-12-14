package Module10;

import java.util.Scanner;

public class AplikasiLampu {
    public static void main(String[] args) {
        Lampu lmp = new Lampu();
        Scanner sc = new Scanner(System.in);
        lmp.statusLampu = lmp.setSaklar(0);
        System.out.println("Status Lampu = " +lmp.statusLampu+ "\nKetikkan 2 kali untuk angka 1 dan 2");
        System.out.println("0 untuk mematikan lampu\n1 untuk menghidupkan lampu\n2 untuk meredupkan lampu");
        if(lmp.setSaklar(sc.nextInt())==0){
            lmp.matikanLampu();

        }
        else if(lmp.setSaklar(sc.nextInt())==2){
            lmp.redupkanLampu();
        }
        else {
            lmp.hidupkanLampu();
        }

    }

}
