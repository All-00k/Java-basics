public class OverRide {
    public static void main(String[] args) {
        Aa obj = new Bb();
        obj.show();
    }  
}//in method overriding same name and same number of parameters

class Aa{
    public void show()
    {
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in Config");
    }
}
class Bb extends Aa{
    public void show(){
        System.out.println("in B show");
    }
}
