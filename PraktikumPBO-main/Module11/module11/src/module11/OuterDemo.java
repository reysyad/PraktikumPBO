package module11;
public class OuterDemo {
    int num;

    private class InnerDemo{
        private void print(){
            System.out.println("ini merupakan inner class");
        }
    }
    void displayInner(){
       InnerDemo inner = new InnerDemo();
       inner.print(); 
    }
}
