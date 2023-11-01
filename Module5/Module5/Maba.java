package Module5;
public class Maba {
    String name;
    String nim;
    String parentName;
    String address;
    String birth;

    public Maba(){
        System.out.println("\nModified constructor: \n");
    }
    public Maba(String name, String nim, String parentName, String address, String birth){
        this.name = name;
        this.nim = nim;
        this.parentName = parentName;
        this.address = address;
        this.birth = birth;

    }
    public void infoMaba(){
        System.out.println("Nama: " + name + "\nNIM: " + nim + "\nNama Ortu: " + parentName + "\nAlamat: " + address + "\nTanggal Lahir: " + birth);

    }
    public static void main(String[] args){
        Maba mabaKu = new Maba();
        Maba maba1 = new Maba("Irwan", "L2007585584", "Otto","Solo",  "22 January 2004");
        Maba maba2 = new Maba("Marsinah", "L200228769", "Tukinem", "Not defined", "22 Desember 1789")
;        maba1.infoMaba();
        Maba mabaKu2 = new Maba();
        maba2.infoMaba();


    }
}
