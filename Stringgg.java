public class Stringgg {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("alok"); // provides a capacity of "EXTRA" 16 characters...
        System.out.println(str.capacity());
        str.delete(0, 3);
        System.out.println(str);
        str.insert(0, " insert ");
        System.out.println(str);
        
        System.out.println(str.substring(0,2));
        str.setLength(90);
        
    }
    
}
