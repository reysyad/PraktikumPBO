package module11;

public class NestedClass {
    String nama = "Rianaldi Rayyan";
    String nim = "L200224286";

    public void printNama(){
        System.out.println(nama + ":" + nim );
    }
    static class StaticNestedClass{
         String jurusan = "Informatika";

    }
    class InnerClass{
        StaticNestedClass statis= new StaticNestedClass();

        void printJurusan(){
            System.out.println("Jurusannya Adalah:" + statis.jurusan);
        }
    }
}
