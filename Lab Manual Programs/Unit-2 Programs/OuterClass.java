// prog 9 Nested Classes
public class OuterClass {
    private int outerVal = 7;
    
    class InnerClass {
        public void disp() {
            System.out.println("Outer val from inner class: " + outerVal);
        }
    }
    
    static class StaticNestedClz {
        public void disp() {
            System.out.println("This is static nested class");
        }
    }
    
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.InnerClass inn = out.new InnerClass();
        OuterClass.StaticNestedClz  snc= new OuterClass.StaticNestedClz();
        
        inn.disp();
        snc.disp();
    }
}
