enum status{
    Running , Failed , Success, Pending;
}

public class enumx {
    public static void main(String a[]){
        status[] ss = status.values() ; 
        for(status s : ss)
            {
                System.out.println(s + ": " + s.ordinal());
            }
        ;
        

    }
    
}
