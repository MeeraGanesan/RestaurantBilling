public class Item
{
    private String code;
    private String name;
    private double price;
    public Item()
    {
        code="";
        name="";
        price=0;
    }
    Item(String c,String n,double p)
    {
        code=c;
        name=n;
        price=p;
    }
    public String getCode()
    {
        return code;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    
     public String toString()
    {
        return( code + " " + name + " " +price);
     }
}