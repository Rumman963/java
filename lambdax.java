@FunctionalInterface
interface A {
     int add(int x , int y );
}

public class lambdax {
     public static void main(String a[])
     {
        A obj = (int x  , int y) -> x+y ;
        int result = obj.add(4 , 5);
        System.out.println(result);
     }
    
}
