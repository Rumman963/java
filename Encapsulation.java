class Human
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;

    }

    public String getName()
    {
        return name;
    }

    public void setAge(int a)
    {
        age=a;
    }

    public void setName(String n)
    {
        name=n;
    }
}

public class Encapsulation 
{
    public static void main(String a[])
    {
        Human obj=new Human();
        obj.setAge(30);
        obj.setName("Rumman");

        System.out.println(obj.getName() + ":" + obj.getAge());
    }

    
}
