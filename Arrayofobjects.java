class student {
    int rollno;
    String name;
    int marks;
}

public class Arrayofobjects
{
public static void main(String a[])
    {
        student s1=new student();
        s1.rollno=1;
        s1.name="raj";
        s1.marks=90;

        student s2=new student();
        s2.rollno=2;
        s2.name="sam";
        s2.marks=80;

         student students[]=new student[2];
         students[0]=s1;
         students[1]=s2;

         for (int i=0 ; i<students.length ; i++)
         {
            System.out.println(students[i].rollno + " " + students[i].name + " " + students[i].marks);

         }


    }
}