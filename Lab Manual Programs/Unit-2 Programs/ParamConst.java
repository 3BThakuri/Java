// prog 4 Parameterized Constructor
public class ParamConst{
    private int id;
    private String name;
    
    public ParamConst(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void dis() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    
    public static void main(String[] args) {
        ParamConst bm= new ParamConst(73, "Bhakta");
        bm.dis();
    }
}
