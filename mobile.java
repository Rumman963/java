abstract class Car
{

    public abstract void drive();
    public void playmusic()
    {
        System.out.println("in music...");
    }

}

class WagonR extends Car
{
    public void drive() {
        System.out.println("in drive...");
        
        
    }


}

public class mobile{
    public static void main(String a[])
    {
        Car obj = new WagonR();
        obj.drive();

    }

}