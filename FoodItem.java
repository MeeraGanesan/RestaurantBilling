public class FoodItem
{
    public String itemCode;
    public int quantity;
    public FoodItem(String x,int y)
    {
        itemCode=x;
        quantity=y;
    }
    public String getCode()
    {
        return itemCode;
    }
    public int getQuantity()
    {
        return quantity;
    }

    
   
    }