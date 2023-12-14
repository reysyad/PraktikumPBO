package module11;

public class OuterDemo2 {
    private int num = 175;
    public class Inner_Demo{
        public int getNum(){
            System.out.println("ini adalah nilai dari var private outer demo");
            return num;
        }
    }
}
