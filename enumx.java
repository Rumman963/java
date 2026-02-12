enum Laptop {
    Dell(20000) , Hp(24000) , Acer , Lenovo(30000) ; 
    
    public int price ;

    private Laptop() {     // 1 times call 
        price = 50000;
        System.out.println("Default constructor called, price set to: " + price);
    }

    private Laptop(int price) {
        System.out.println("Constructor called with price: " + price);
        this.price = price;
    }





    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    } 
    
    
}


public class enumx {
    public static void main(String a[])
    {
        for(Laptop lap: Laptop.values()) {
            System.out.println(lap + ":"+ lap.getPrice());
    }
}

}













