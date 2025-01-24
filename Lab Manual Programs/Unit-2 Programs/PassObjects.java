//  Passing Objects to Methods
public class PassObjects {
    int value;
    
    PassObjects(int v) {
        value = v;
    }
    
    void updateval(PassObjects bm) {
        bm.value += 10;
    }
    
    public static void main(String[] args) {
        PassObjects bm1 = new PassObjects(50);
        System.out.println("Before: " + bm1.value);
        
        bm1.updateval(bm1);
        System.out.println("After: " + bm1.value);
    }
}