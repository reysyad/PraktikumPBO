package module11;

import module11.NestedClass.InnerClass;

public class NestedClassMain {
    public static void main(String[] args) {
        NestedClass main = new NestedClass();
        main.printNama();
        NestedClass.InnerClass innerClass = main.new InnerClass();
        innerClass.printJurusan();

    }
}
