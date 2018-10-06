public class DrinkItem
{
    public String itemCode;
    public int quantity;
    public DrinkItem(String x,int y)
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