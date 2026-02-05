 class Calc 
 
 {
    public int add(int n1, int n2)
    {
        return n1 + n2 ;
    }

    public int sub(int n1 , int n2)
    {
        return n1 - n2 ;
    }

}  


public class aa {
    public static void main(String a[])
    {
       Advanc obj = new Advanc() ;
       int r1 = obj.add(10 , 20);
       int r2 = obj.sub(2 , 3);
       int r3 = obj.mul(4 ,50);
       int r4 = obj.div(4 , 1);

       System.out.println( r1 + "," + r2 + "," + r3 + "," + r4);

        }
}


