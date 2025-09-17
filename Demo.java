class Students {
    int rollno;
    String name;
    int marks;
   
}

public class Demo{
    public static void main(String[] args) 
    {
        Students s1 =new Students();
        s1.rollno =1;
        s1.name ="alok";
        s1.marks =100;

        Students s2 =new Students();
        s2.rollno =2;
        s2.name ="arpit";
        s2.marks =100;

        Students s3 =new Students();
        s3.rollno =3;
        s3.name ="ashu";
        s3.marks =100;

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].name + ":" + students[i].marks);
        // }

        for(Students stud: students)
        {       
            System.out.println(stud.name + ":" + stud.marks);
        }

        
    }
}