import others.*;
public class AccessMod {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.marks); //since in others package the class First have a public marks so we can access it
    }//if it was not public we cant access marks in other packages (other than package of "First" class)
    
}

//private is used in same class irrespective of package