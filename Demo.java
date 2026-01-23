class computer
{
    public void playMusic()
    {
        System.out.println("Playing music");
    }

    public String getMePen(int cost)
    {
        if (cost>=10)
            return "Pen";

        return "no pen";

    }
}
public class Demo
{
    public static void main(String a[])
    {
        computer obj=new computer();
        obj.playMusic();
        System.out.println();
        String str=obj.getMePen(12);
        System.out.println(str);

}

}
