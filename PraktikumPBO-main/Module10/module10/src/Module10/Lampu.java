package Module10;

public class Lampu implements ActivityLampu{
    public int statusLampu;
    
    @Override
    public void matikanLampu(){
        if (statusLampu==0){
            System.out.println("Lampu sudah dalam kondisi mati");

        }
        else if (statusLampu==1){
            statusLampu=-1;
            System.out.println("Lampu sudah dimatikan");
        }

    }
    @Override
    public void hidupkanLampu(){
        if(statusLampu==1){
            System.out.println("Lampu sudah dinyalakan\n***");

        }

        else{
            statusLampu=+1;
            System.out.println("Lampu sudah daalam kondisi menyala");
        }
    }
    @Override
    public void redupkanLampu(){
        if(statusLampu==1){
            System.out.println("Lampu sudah diredupkan");
        }
        else{
            statusLampu=+2;
            System.out.println("Lampu dalam kondisi redup");
        }
    }
    public int setSaklar(int saklar){
        return statusLampu = saklar;
    }

}