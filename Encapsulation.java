class Human{
    private int age ;
    private String name;
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }


    public void setAge(int a){
        age =a;
    }
    public void setName(String n){
        name = n;
    }

}


public class Encapsulation {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.setAge(10);
        obj1.setName("Alok");
        System.out.println(obj1.getAge() + ": " + obj1.getName());
        
    }
    
}
